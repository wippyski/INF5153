package vueTableVerite;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import editeurcircuit.TableVeriteObserver;
import editeurcircuit.impl.TableVeriteImpl;


public class FenetreTableVerite extends JFrame implements Observeur {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */	
	
	private JTable table;
	private int nbSorties;
	private static volatile FenetreTableVerite instance = null;

	/**
	 * Create the application.
	 */
	private FenetreTableVerite() {
		initialize();
	}
	
	public final static FenetreTableVerite getInstance() {        
        if (FenetreTableVerite.instance == null) {           
           synchronized(FenetreTableVerite.class) {
             if (FenetreTableVerite.instance == null) {
            	 FenetreTableVerite.instance = new FenetreTableVerite();
             }
           }
        }
        return FenetreTableVerite.instance;
    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setTitle("Table de v\u00E9rit\u00E9");
		setBounds(100, 100, 620, 469);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocation(800, 100);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 584, 409);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		
		// À l'ouverture de l'application, par défaut
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"0", "0", "ND"},
				{"0", "1", "ND"},
				{"1", "0", "ND"},
				{"1", "1", "ND"},
			},
			new String[] {
				"E1", "E2", "S1"
			}
		));
		nbSorties = 1;
		scrollPane.setViewportView(table);
	}
	
	public void update(TableVeriteObserver p_table){
		/* Mettre à jour la JTable avec les valeurs de p_table */
		
		if(p_table instanceof TableVeriteImpl)
        {       
			TableVeriteImpl t = (TableVeriteImpl) p_table;	
			int nbCol = t.getNomColonne().size();
			Map<Integer, ArrayList<Boolean>> tablemap = t.getTable();
			String[] nomCol = new String[nbCol];
			Object[][] data = new Object[(int) Math.pow(2, t.getNbEntrees())][nbCol];			
			nbSorties = nbCol - t.getNbEntrees();			
			
			//Set les noms des colonnes du tableau
			for(int i = 0; i < nbCol ; ++i){
				nomCol[i] = t.getNomColonne().get(i);
			}			
			
			//Remplit le tableau 			
			for(int i = 0; i < tablemap.size(); ++i){
				for(int j = 0; j < tablemap.get(i).size() ; ++j){
					if(tablemap.get(i).get(j) == true){
						data[i][j]= "1";
					} else {
						data[i][j]= "0";
					}
				}					
			}
			
			table.setModel(new DefaultTableModel(data, nomCol));    
        }      
	}
	
	public void changementCircuit(){
		int nbCol = table.getColumnCount();
		for(int i = nbCol - nbSorties ; i <= nbCol-1 ; ++i){
			for(int j = 0; j < Math.pow(2, nbCol - nbSorties); ++j){
				table.setValueAt("ND", j, i);
			}			
		}		
	}
}


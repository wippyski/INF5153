package vueTableVerite;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class FenetreTableVerite extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */	
	
	private JTable table;

	/**
	 * Create the application.
	 */
	public FenetreTableVerite() {
		initialize();
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
		scrollPane.setViewportView(table);
	}
}


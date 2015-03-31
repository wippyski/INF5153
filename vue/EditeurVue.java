package vue;

/*    UQAM / Département d'informatique                           *
 *    INF5153 - Gr10  											  *
 *    Hiver 2015 / TP1 - Prototype                                *
 *    										                      * 
 * 	  Identifiant d'équipe: Gr07								  *
 *    Auteurs:	 												  *
 *    Maxime GAGNON (GAGM29038801)								  *
 *    Steeve SCHAWANN (SCHS25048606)							  *
 *    Jonathan MILOT (MILJ28019308)								  *
 * 	  Martin OUIMET (OUIM25097904) 								  *
 *    															  *									  
 * 																  */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;










import controleur.*;
import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;
import editeurcircuit.EditeurcircuitPackage;
import editeurcircuit.Signal;
import editeurcircuit.TypeSignal;


public class EditeurVue extends JFrame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 593727486073662800L;

	private JFrame frmEditeurDeCircuit;
	private JTable table;	
	
	public Circuit v_circuit;
	JComboBox<String> myCombo = new JComboBox<String> ();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {				
					EditeurcircuitPackage.eINSTANCE.eClass();
					//v_circuit.setSauvegarder(true);
					EditeurVue window = new EditeurVue();
					window.frmEditeurDeCircuit.setVisible(true);				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EditeurVue() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		v_circuit = EditeurcircuitFactory.eINSTANCE.createCircuit();
		v_circuit.setSauvegarder(true);
		
		// Ajout des signaux réglementaires
		v_circuit.AjouterSignal(TypeSignal.ENTREE);
		v_circuit.AjouterSignal(TypeSignal.ENTREE);
		v_circuit.AjouterSignal(TypeSignal.SORTIE);
		updateScrollList(myCombo); // Faire la liste déroulante
		
		
		frmEditeurDeCircuit = new JFrame();
		frmEditeurDeCircuit.setTitle("\u00C9diteur de circuit");
		frmEditeurDeCircuit.setBounds(100, 100, 694, 526);
		frmEditeurDeCircuit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmEditeurDeCircuit.setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		//Bouton pour charger un nouveau circuit vierge
		JMenuItem mntmNouveauCircuit = new JMenuItem("Nouveau circuit");
		mnFichier.add(mntmNouveauCircuit);
		mntmNouveauCircuit.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {	
				
				if(v_circuit.isSauvegarder()){
					CommandeNouveau command8 = new CommandeNouveau(v_circuit);
					v_circuit = command8.execute2();
					
					updateScrollList(myCombo); 
				} else {
					System.out.println("Sauvegarder d'abord le circuit en cours (à faire)");
					
				}		
			}

		}
		);
		
		
		//Bouton du menu pour charger un circuit
		JMenuItem mntmChargerCircuit = new JMenuItem("Charger circuit");
		mnFichier.add(mntmChargerCircuit);
		mntmChargerCircuit.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {		
				
				JFileChooser fc = new JFileChooser();
				
				if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					CommandeCharger command7 = new CommandeCharger(v_circuit);
					v_circuit = command7.execute2(file);	
					
					updateScrollList(myCombo);
				}			

			}

		}
		);
		
		//Bouton du menu pour sauvegarder le circuit
		JMenuItem mntmSauvegarderCircuit = new JMenuItem("Sauvegarder circuit");
		mnFichier.add(mntmSauvegarderCircuit);
		mntmSauvegarderCircuit.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {				
				Commande command6 = new CommandeSauvegarder(v_circuit);
				command6.execute();				

			}

		}
		);
		
		//Quitter l'application
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mnFichier.add(mntmQuitter);
		mntmQuitter.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {				
				Commande command9 = new CommandeQuitter(v_circuit);
				command9.execute();				

			}

		}
		);
		
		JMenu mnEditer = new JMenu("\u00C9diter");
		menuBar.add(mnEditer);
		
		JMenuItem mntmAnnuler = new JMenuItem("Annuler");
		mnEditer.add(mntmAnnuler);
		
		JMenuItem mntmRefaire = new JMenuItem("Refaire");
		mnEditer.add(mntmRefaire);
		frmEditeurDeCircuit.getContentPane().setLayout(null);
		
		//Bouton Ajouter Entrée
		JButton btnAjouterEntree = new JButton("Ajouter Entr\u00E9e");
		btnAjouterEntree.setBounds(500, 26, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterEntree);
		btnAjouterEntree.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				int v_nb_entree = 0;

				// Comptage du nombre de signal Entree
				for (Signal s : v_circuit.getEstDefinitPar()) {

					if (s.getType() == TypeSignal.ENTREE)
						v_nb_entree++;
				}
				
				if(v_nb_entree < 5 ){
					Commande command1 = new CommandeAjouterEntree(v_circuit);								
					command1.execute();	
					myCombo.addItem(v_circuit.getEstDefinitPar().get(v_circuit.getEstDefinitPar().size()-1).getNom());
				} else {
					System.out.println("ERREUR : Nombre d'entree limite atteint. L'ajout d'une entree est annulée.");
				}

			}
		});
		
		//Bouton Ajouter Sortie
		JButton btnAjouterSortie = new JButton("Ajouter Sortie");
		btnAjouterSortie.setBounds(500, 47, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterSortie);
		btnAjouterSortie.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				int v_nb_sortie = 0;

				// Comptage du nombre de signal Sortie
				for (Signal s : v_circuit.getEstDefinitPar()) {

					if (s.getType() == TypeSignal.SORTIE)
						v_nb_sortie++;
				}
				
				if(v_nb_sortie < 5){
					Commande command2 = new CommandeAjouterSortie(v_circuit);								
					command2.execute();	
					myCombo.addItem(v_circuit.getEstDefinitPar().get(v_circuit.getEstDefinitPar().size()-1).getNom());
				} else {
					System.out.println("ERREUR : Nombre de sortie limite atteint. L'ajout d'une sortie est annulée.");
				}
			}

		}
		);
		
		//Bouton Supprimer Signal (entree ou sortie)
		JButton btnSupprimerEntreeSortie = new JButton("Supprimer Entr\u00E9e/Sortie");
		btnSupprimerEntreeSortie.setBounds(500, 69, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnSupprimerEntreeSortie);
		btnSupprimerEntreeSortie.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					int id;
					String nomSignal = null;
					if(table.getSelectedRow() != -1) {						
						if(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()) != null){
							nomSignal = table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString();
						}
					}
					
					if(nomSignal != null && (v_circuit.getTypeObjet(nomSignal) == 4 || 
											 v_circuit.getTypeObjet(nomSignal) == 5)){						
						id = v_circuit.RechercherSignalParNom(nomSignal).getID();
						supprimerSignal(id, nomSignal);
					} else {
						System.out.println("Ceci n'est pas un signal valide. Sélectionner un signal dans le tableau.");
					}					
			}

		}
		);
		
		
		
		//Bouton Ajouter Porte AND
		JButton btnAjouterPorteAnd = new JButton("Ajouter Porte AND");
		btnAjouterPorteAnd.setBounds(500, 114, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterPorteAnd);
		btnAjouterPorteAnd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(v_circuit.getEstCompose().size() < 50){
					Commande command3 = new CommandeAjouterPorteAnd(v_circuit);								
					command3.execute();		
					myCombo.addItem(v_circuit.getEstCompose().get(v_circuit.getEstCompose().size()-1).getNom());
				} else {
					System.out.println("ERREUR : Nombre de porte limite atteint. L'ajout d'une porte est annulée.");
				}

		}
		});
		
		//Bouton Ajouter Porte OR
		JButton btnAjouterPorteOr = new JButton("Ajouter Porte OR");
		btnAjouterPorteOr.setBounds(500, 136, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterPorteOr);
		btnAjouterPorteOr.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					Commande command4 = new CommandeAjouterPorteOr(v_circuit);								
					command4.execute();	
					myCombo.addItem(v_circuit.getEstCompose().get(v_circuit.getEstCompose().size()-1).getNom());
			}

		}
		);
		
		//Bouton Ajouter Porte NOT
		JButton btnAjouterPorteNot = new JButton("Ajouter Porte NOT");
		btnAjouterPorteNot.setBounds(500, 159, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterPorteNot);
		btnAjouterPorteNot.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					Commande command5 = new CommandeAjouterPorteNot(v_circuit);								
					command5.execute();
					myCombo.addItem(v_circuit.getEstCompose().get(v_circuit.getEstCompose().size()-1).getNom());
			}

		}
		);
		
		//Bouton Supprimer Porte
		JButton btnSupprimerPorte = new JButton("Supprimer Porte");
		btnSupprimerPorte.setBounds(500, 203, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnSupprimerPorte);
		btnSupprimerPorte.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int id;
				String nomPorte = null;
				if(table.getSelectedRow() != -1) {						
					if(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()) != null){
						nomPorte = table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString();
					}
				}
				
				if(nomPorte != null && (v_circuit.getTypeObjet(nomPorte) == 1 || 
										 v_circuit.getTypeObjet(nomPorte) == 2 ||
										 v_circuit.getTypeObjet(nomPorte) == 3)){						
					id = v_circuit.RechercherPorteParNom(nomPorte).getID();
					supprimerPorte(id, nomPorte);
				} else {
					System.out.println("Ceci n'est pas une porte valide. Sélectionner une porte dans le tableau.");
				}					
			}

		}
		);
		
		JButton btnAjouterPortePerso = new JButton("Ajouter Porte Personnalis\u00E9e");
		btnAjouterPortePerso.setBounds(500, 181, 178, 23);
		btnAjouterPortePerso.setEnabled(false);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterPortePerso);
		
		JButton btnMiseAJour = new JButton("Mise a jour des liens");
		btnMiseAJour.setBounds(500, 245, 178, 23);		
		frmEditeurDeCircuit.getContentPane().add(btnMiseAJour);
		btnMiseAJour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					faireLesLiens();
			}

		}
		);
		
					    
				    JScrollPane scrollPane = new JScrollPane();
				    scrollPane.setBounds(22, 11, 452, 427);
				    frmEditeurDeCircuit.getContentPane().add(scrollPane);
				    table = new JTable();				   
				    table.setModel(new DefaultTableModel(
				    	new Object[50][50],
				    	new String[] {
				    		"Source", "Destination"
				    	}
				    ));	    	
			    	
			    	table.getColumn("Destination").setCellEditor(new DefaultCellEditor(myCombo));
			    	table.getColumn("Source").setCellEditor(new DefaultCellEditor(myCombo));
				    
				    scrollPane.setViewportView(table);
	}
	
	private void updateScrollList(JComboBox<String> p_myCombo){
		
		p_myCombo.removeAllItems();
		
		for(int i = 0; i < v_circuit.getEstCompose().size(); ++i){
		
			p_myCombo.addItem(v_circuit.getEstCompose().get(i).getNom()); 
		}
		
		for(int i = 0; i < v_circuit.getEstDefinitPar().size(); ++i){
			
			p_myCombo.addItem(v_circuit.getEstDefinitPar().get(i).getNom()); 
		}
		
		p_myCombo.addItem(null);
	
	
	}
	
	private void faireLesLiens(){
		for(int i = 0; i < table.getRowCount(); ++i){
			if(table.getValueAt(i, 0) != null){
				if(table.getValueAt(i, 1) != null){
					Commande command10 = new CommandeAjouterLien(v_circuit, table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString());						
					command10.execute();
				}
			}
		}		
	}

	private void supprimerSignal(int idSignal, String nomSignal){
		Commande command11 = new CommandeSupprimerSignal(v_circuit, idSignal);						
		command11.execute();
		for(int i = 0; i < table.getRowCount(); ++i){
			if(table.getValueAt(i, 0) !=null){
				if(table.getValueAt(i, 0).toString() == nomSignal){
					table.setValueAt(null, i, 0);
				}
			}
			if(table.getValueAt(i, 1) !=null){
				if(table.getValueAt(i, 1).toString() == nomSignal){
					table.setValueAt(null, i, 1);	
				}
			}
		}
		updateScrollList(myCombo);		
				
	}
	
	private void supprimerPorte(int idPorte, String nomPorte){
		Commande command12 = new CommandeSupprimerPorte(v_circuit, idPorte);						
		command12.execute();
		for(int i = 0; i < table.getRowCount(); ++i){
			if(table.getValueAt(i, 0) !=null){
				if(table.getValueAt(i, 0).toString() == nomPorte){
					table.setValueAt(null, i, 0);
				}
			}
			if(table.getValueAt(i, 1) !=null){
				if(table.getValueAt(i, 1).toString() == nomPorte){
					table.setValueAt(null, i, 1);	
				}
			}
		}
		updateScrollList(myCombo);		
				
	}

}

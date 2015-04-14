package vue;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
import editeurcircuit.Signal;
import editeurcircuit.TypeSignal;
import editeurcircuit.impl.CircuitImpl;
import editeurcircuit.impl.Porte_ANDImpl;
import editeurcircuit.impl.Porte_NOTImpl;
import editeurcircuit.impl.Porte_ORImpl;


public class EditeurVue extends JFrame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 593727486073662800L;

	public JFrame frmEditeurDeCircuit;
	private JTable table;	
	
	public Circuit v_circuit;
	JComboBox<String> myCombo = new JComboBox<String> ();
	int caseVide;


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
				
				
				if(!v_circuit.isSauvegarder()){
					int result = JOptionPane.showConfirmDialog(frmEditeurDeCircuit, "Attention, le circuit n'a pas été sauvegardé. Voulez-vous continuer ?",
							"alert", JOptionPane.OK_CANCEL_OPTION);
					if(result != 0) return;
				}
				
				CommandeNouveau command_new = new CommandeNouveau(v_circuit);
				v_circuit = command_new.execute2();
				
				clearTable();
				updateScrollList(myCombo); 
				
			}

		}
		);
		
		
		//Bouton du menu pour charger un circuit
		JMenuItem mntmChargerCircuit = new JMenuItem("Charger circuit");
		mnFichier.add(mntmChargerCircuit);
		mntmChargerCircuit.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {		
				
				if(!v_circuit.isSauvegarder()){
					int result = JOptionPane.showConfirmDialog(frmEditeurDeCircuit, "Attention, le circuit n'a pas été sauvegardé. Voulez-vous continuer ?",
							"alert", JOptionPane.OK_CANCEL_OPTION);
					if(result != 0) return;
				}
				
				JFileChooser fc = new JFileChooser();
				
				if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					CommandeCharger command_load = new CommandeCharger(v_circuit);
					v_circuit = command_load.execute2(file);	
					
					updateScrollList(myCombo);
					chargerTable();
				}			

			}

		}
		);
		
		//Bouton du menu pour sauvegarder le circuit
		JMenuItem mntmSauvegarderCircuit = new JMenuItem("Sauvegarder circuit");
		mnFichier.add(mntmSauvegarderCircuit);
		mntmSauvegarderCircuit.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {	
				faireLesLiens();
				Commande command_save = new CommandeSauvegarder(v_circuit);
				command_save.execute();				

			}

		}
		);
		
		//Quitter l'application
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mnFichier.add(mntmQuitter);
		mntmQuitter.addActionListener( new ActionListener() {

			public void actionPerformed(ActionEvent e) {	
				
				if(!v_circuit.isSauvegarder()){
					int result = JOptionPane.showConfirmDialog(frmEditeurDeCircuit, "Attention, le circuit n'a pas été sauvegardé. Voulez-vous continué ?",
							"alert", JOptionPane.OK_CANCEL_OPTION);
					if(result != 0) return;
				}
				
				Commande command_quit = new CommandeQuitter();
				command_quit.execute();				

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
					Commande command_ajoutEntree = new CommandeAjouterEntree(v_circuit);								
					command_ajoutEntree.execute();	
					myCombo.addItem(v_circuit.getEstDefinitPar().get(v_circuit.getEstDefinitPar().size()-1).getNom());
				} else {
					JOptionPane.showMessageDialog(frmEditeurDeCircuit,"ERREUR : Nombre d'entree limite atteint. L'ajout d'une entree est annulée.");					
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
					Commande command_ajoutSortie = new CommandeAjouterSortie(v_circuit);								
					command_ajoutSortie.execute();	
					myCombo.addItem(v_circuit.getEstDefinitPar().get(v_circuit.getEstDefinitPar().size()-1).getNom());
				} else {
					JOptionPane.showMessageDialog(frmEditeurDeCircuit,"ERREUR : Nombre de sortie limite atteint. L'ajout d'une sortie est annulée.");
					
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
					
					if(nomSignal != null && (v_circuit.getTypeObjet(nomSignal) == CircuitImpl.typeObject.Signal_ENTREE || 
											 v_circuit.getTypeObjet(nomSignal) == CircuitImpl.typeObject.Signal_SORTIE)){	
						
						//Validation qu'il reste plus d'une entree/sortie
						Signal v_sig_to_del = v_circuit.RechercherSignalParNom(nomSignal); 
						
						//Sortie
						if(v_sig_to_del.getType() == TypeSignal.SORTIE){
							int v_nb_sortie = 0;
							
							// Comptage du nombre de signal Sortie
							for (Signal s : v_circuit.getEstDefinitPar()) {
	
								if (s.getType() == TypeSignal.SORTIE)
									v_nb_sortie++;
							}
							
							if(v_nb_sortie > 1){
								id = v_sig_to_del.getID();
								supprimerSignal(id, nomSignal);
							} else {
								JOptionPane.showMessageDialog(frmEditeurDeCircuit,"Erreur. Il doit rester au moins une sortie dans le circuit.");
							}
						}
						
						//Entree
						else {
							int v_nb_entree = 0;
							
							// Comptage du nombre de signal Sortie
							for (Signal s : v_circuit.getEstDefinitPar()) {
	
								if (s.getType() == TypeSignal.ENTREE)
									v_nb_entree++;
							}
							
							if(v_nb_entree > 1){
								id = v_sig_to_del.getID();
								supprimerSignal(id, nomSignal);
							} else {
								JOptionPane.showMessageDialog(frmEditeurDeCircuit,"Erreur. Il doit rester au moins une entree dans le circuit.");
							}
						}				
						
						
					} else {
						JOptionPane.showMessageDialog(frmEditeurDeCircuit,"Ceci n'est pas un signal valide. Sélectionner un signal dans le tableau.");
						
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
					Commande command_ajoutPorteAND = new CommandeAjouterPorteAnd(v_circuit);								
					command_ajoutPorteAND.execute();		
					myCombo.addItem(v_circuit.getEstCompose().get(v_circuit.getEstCompose().size()-1).getNom());
				} else {
					JOptionPane.showMessageDialog(frmEditeurDeCircuit,"ERREUR : Nombre de porte limite atteint. L'ajout d'une porte est annulée.");
					
				}

		}
		});
		
		//Bouton Ajouter Porte OR
		JButton btnAjouterPorteOr = new JButton("Ajouter Porte OR");
		btnAjouterPorteOr.setBounds(500, 136, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterPorteOr);
		btnAjouterPorteOr.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(v_circuit.getEstCompose().size() < 50){
					Commande command_ajoutPorteOR = new CommandeAjouterPorteOr(v_circuit);								
					command_ajoutPorteOR.execute();	
					myCombo.addItem(v_circuit.getEstCompose().get(v_circuit.getEstCompose().size()-1).getNom());
				} else {
					JOptionPane.showMessageDialog(frmEditeurDeCircuit,"ERREUR : Nombre de porte limite atteint. L'ajout d'une porte est annulée.");
					
				}
			}

		}
		);
		
		//Bouton Ajouter Porte NOT
		JButton btnAjouterPorteNot = new JButton("Ajouter Porte NOT");
		btnAjouterPorteNot.setBounds(500, 159, 178, 23);
		frmEditeurDeCircuit.getContentPane().add(btnAjouterPorteNot);
		btnAjouterPorteNot.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(v_circuit.getEstCompose().size() < 50){
					Commande command_ajoutPorteNOT = new CommandeAjouterPorteNot(v_circuit);								
					command_ajoutPorteNOT.execute();
					myCombo.addItem(v_circuit.getEstCompose().get(v_circuit.getEstCompose().size()-1).getNom());
				} else {
					JOptionPane.showMessageDialog(frmEditeurDeCircuit,"ERREUR : Nombre de porte limite atteint. L'ajout d'une porte est annulée.");
				}
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
				
				if(nomPorte != null && (v_circuit.getTypeObjet(nomPorte) == CircuitImpl.typeObject.Porte_AND || 
										 v_circuit.getTypeObjet(nomPorte) == CircuitImpl.typeObject.Porte_OR ||
										 v_circuit.getTypeObjet(nomPorte) == CircuitImpl.typeObject.Porte_NOT)){						
					id = v_circuit.RechercherPorteParNom(nomPorte).getID();
					supprimerPorte(id, nomPorte);
				} else {
					JOptionPane.showMessageDialog(frmEditeurDeCircuit,"Ceci n'est pas une porte valide. Sélectionner une porte dans le tableau.");					
				}					
			}

		}
		);
		
		//Renommer un signal
		JButton btnRenameSignal = new JButton("Renommer Entree/Sortie");
		btnRenameSignal.setBounds(500, 181, 178, 23);
		btnRenameSignal.setEnabled(true);
		frmEditeurDeCircuit.getContentPane().add(btnRenameSignal);
		btnRenameSignal.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				
				Signal v_Signal = null; 
				String v_oldName = ""; 
				String v_newName = ""; 
				
				boolean v_valideName = false; 
				
				while(!v_valideName){
				
					v_oldName = (String)JOptionPane.showInputDialog(
		                    frmEditeurDeCircuit,
		                    "Quelle entree/sortie souhaitez-vous renommé ?",
		                    "Entree/Sortie a renommé",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    null,
		                    "");
					
					if(v_oldName == null) return; 
					
					for(Signal s : v_circuit.getEstDefinitPar()){
						
						if(s.getNom().compareTo(v_oldName) == 0){
							v_valideName = true; 
							v_Signal = s; 
						}
					}
					
					if(!v_valideName){
						JOptionPane.showMessageDialog(frmEditeurDeCircuit,"ERREUR : Nom d'entree/sortie introuvable");

					}
				}
				
				
				v_valideName = false;
				while(!v_valideName){
					
					v_valideName = true;
					v_newName = (String)JOptionPane.showInputDialog(
		                    frmEditeurDeCircuit,
		                    "Quelle nouveau nom souhaitz-vous donner à " + v_oldName,
		                    "Entree/Sortie a renommé",
		                    JOptionPane.PLAIN_MESSAGE,
		                    null,
		                    null,
		                    "");
					
					if(v_newName == null) return; 
					
					for(Signal s : v_circuit.getEstDefinitPar()){
						
						if(s.getNom().compareTo(v_newName) == 0){
							v_valideName = false; 
							JOptionPane.showMessageDialog(frmEditeurDeCircuit,"Le nom " + v_newName + " existe déjà !");
						}
					}
					
					if(v_newName.length() > 5){
						v_valideName = false; 
						JOptionPane.showMessageDialog(frmEditeurDeCircuit,"Le nom d'une entree/sortie ne doit pas être de plus de 5 charactères alphanumériques.");

					}
				}
				
				v_Signal.setNom(v_newName);

				updateScrollList(myCombo);
			}
			
			
		});
		
		//Mettre à jour les liens du circuit
		JButton btnMiseAJour = new JButton("Mise a jour des liens");
		btnMiseAJour.setBounds(500, 245, 178, 23);		
		frmEditeurDeCircuit.getContentPane().add(btnMiseAJour);
		btnMiseAJour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					faireLesLiens();
			}

		}
		);
		
		//Calculer la table de vérité
		JButton btnCalculer = new JButton("Calculer la table");
		btnCalculer.setBounds(500, 290, 178, 23);		
		frmEditeurDeCircuit.getContentPane().add(btnCalculer);
		btnCalculer.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					faireLesLiens();
					CommandeCalculer command_calcul = new CommandeCalculer(v_circuit);
					command_calcul.execute();
					
			}

		}
		);
		
					    
				    JScrollPane scrollPane = new JScrollPane();
				    scrollPane.setBounds(22, 11, 452, 427);
				    frmEditeurDeCircuit.getContentPane().add(scrollPane);
				    table = new JTable();				   
				    table.setModel(new DefaultTableModel(
				    	new Object[100][100],
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
	
	private void chargerTable(){
		CircuitImpl.typeObject typePorte;
		int id_entree1 = -2;
		int id_entree2 = -2;
		int id_sortie1 = -2;	
		String nomPorte;
		
		for(int i= 0; i < v_circuit.getEstCompose().size(); ++i){
			typePorte = v_circuit.getTypeObjet(v_circuit.getEstCompose().get(i).getNom());
			
			if (typePorte == CircuitImpl.typeObject.Porte_AND){
				Porte_ANDImpl p = (Porte_ANDImpl) v_circuit.getEstCompose().get(i);
				id_entree1 = p.getEntree1();
				id_entree2 = p.getEntree2();
				id_sortie1 = p.getSortie1();	
				nomPorte = p.getNom();
			} else if (typePorte == CircuitImpl.typeObject.Porte_OR){
				Porte_ORImpl p = (Porte_ORImpl) v_circuit.getEstCompose().get(i);
				id_entree1 = p.getEntree1();
				id_entree2 = p.getEntree2();
				id_sortie1 = p.getSortie1();
				nomPorte = p.getNom();
			} else {
				Porte_NOTImpl p = (Porte_NOTImpl) v_circuit.getEstCompose().get(i);
				id_entree1 = p.getEntree1();				
				id_sortie1 = p.getSortie1();
				id_entree2 = -2;
				nomPorte = p.getNom();
			}
			
			for(int j = 0; j < v_circuit.getEstDefinitPar().size(); ++j){
				int caseVide = caseVide();
				if(v_circuit.getEstDefinitPar().get(j).getID() == id_entree1){
					table.setValueAt(v_circuit.getEstDefinitPar().get(j).getNom(), caseVide, 0);
					table.setValueAt(nomPorte, caseVide, 1);
				} else if(v_circuit.getEstDefinitPar().get(j).getID() == id_entree2){
					table.setValueAt(v_circuit.getEstDefinitPar().get(j).getNom(), caseVide, 0);
					table.setValueAt(nomPorte, caseVide, 1);
				} else if(v_circuit.getEstDefinitPar().get(j).getID() == id_sortie1){
					table.setValueAt(nomPorte, caseVide, 0);
					table.setValueAt(v_circuit.getEstDefinitPar().get(j).getNom(), caseVide, 1);
				}
			}
			
			for(int j = 0; j < v_circuit.getEstCompose().size(); ++j){
				int caseVide = caseVide();
				if(v_circuit.getEstCompose().get(j).getID() == id_entree1){
					table.setValueAt(v_circuit.getEstCompose().get(j).getNom(), caseVide, 0);
					table.setValueAt(nomPorte, caseVide, 1);
				} else if(v_circuit.getEstCompose().get(j).getID() == id_entree2){
					table.setValueAt(v_circuit.getEstCompose().get(j).getNom(), caseVide, 0);
					table.setValueAt(nomPorte, caseVide, 1);
				} 
			}
		}			
	}
	
	private int caseVide(){
		for(caseVide = 0; table.getValueAt(caseVide, 0) != null; ++caseVide){
			
		}
		return caseVide;
	}
	
	private void clearTable(){
	    for (int i = 0; i < table.getRowCount(); i++) {
	        for (int j = 0; j < table.getColumnCount(); j++) {
	            table.setValueAt(null, i, j);
	        }
	    }
	}
	
	private void faireLesLiens(){
		for(int i = 0; i < table.getRowCount(); ++i){
			if(table.getValueAt(i, 0) != null){
				if(table.getValueAt(i, 1) != null){
					Commande command_ajoutLien = new CommandeAjouterLien(v_circuit, table.getValueAt(i, 0).toString(), table.getValueAt(i, 1).toString());						
					command_ajoutLien.execute();
				}
			}
		}		
	}

	private void supprimerSignal(int idSignal, String nomSignal){
		Commande command_suppSignal = new CommandeSupprimerSignal(v_circuit, idSignal);						
		command_suppSignal.execute();
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
		Commande command_suppPorte = new CommandeSupprimerPorte(v_circuit, idPorte);						
		command_suppPorte.execute();
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

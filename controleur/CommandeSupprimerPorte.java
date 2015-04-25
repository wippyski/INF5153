package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;
import editeurcircuit.Porte_AND;
import editeurcircuit.Porte_NOT;
import editeurcircuit.Porte_OR;
import editeurcircuit.TypePorte;
import editeurcircuit.TypeSignal;
import editeurcircuit.impl.CircuitImpl.typeObject;

public class CommandeSupprimerPorte implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int porte_id;
	private typeObject type;
	private String nom;
	private int entree1 = -1;
	private int entree2 = -1;
	private int sortie = -1;

	public CommandeSupprimerPorte(Circuit v_circuit, Historique v_historique,
			int id) {
		this.circuit = v_circuit;
		this.historique = v_historique;
		this.porte_id = id;
	}

	@Override
	public void execute() {
		this.nom = circuit.RechercherPorteParID(porte_id).getNom();
		this.type = circuit.getTypeObjet(this.nom);

		if (this.type.equals(typeObject.Porte_AND)) {
			Porte_AND newPorte = (Porte_AND) circuit
					.RechercherPorteParID(porte_id);
			this.entree1 = newPorte.getEntree1();
			this.entree2 = newPorte.getEntree2();
			this.sortie = newPorte.getSortie1();

		} else {
			if (this.type.equals(typeObject.Porte_OR)) {
				Porte_OR newPorte = (Porte_OR) circuit
						.RechercherPorteParID(porte_id);
				this.entree1 = newPorte.getEntree1();
				this.entree2 = newPorte.getEntree2();
				this.sortie = newPorte.getSortie1();
			} else {
				Porte_NOT newPorte = (Porte_NOT) circuit
						.RechercherPorteParID(porte_id);
				this.entree1 = newPorte.getEntree1();
				this.sortie = newPorte.getSortie1();
			}
		}
		circuit.SupprimerPorte(porte_id);
		circuit.setSauvegarder(false);
		circuit.Valider();
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
	}

	@Override
	public void unexecute() {
		int tempid;
		String lien;
		if (this.type.equals(typeObject.Porte_AND)) {
			tempid = circuit.AjouterPorte(TypePorte.AND);
			Porte_AND newPorte = (Porte_AND) circuit
					.RechercherPorteParID(tempid);
			newPorte.setID(this.porte_id);
			newPorte.setEntree1(this.entree1);
			newPorte.setEntree2(this.entree2);
			newPorte.setSortie1(this.sortie);
			newPorte.setNom(this.nom);			
			if (this.entree1 != -1) {
				if (circuit.RechercherPorteParID(this.entree1) != null) {
					lien = circuit.RechercherPorteParID(this.entree1).getNom();
					circuit.ajouterLien(lien, this.nom);
				} else {
					lien = circuit.RechercherSignalParID(this.entree1).getNom();
					circuit.ajouterLien(lien, this.nom);
				}
			}
			if (this.entree2 != -1) {
				if (circuit.RechercherPorteParID(this.entree2) != null) {
					lien = circuit.RechercherPorteParID(this.entree2).getNom();
					circuit.ajouterLien(lien, this.nom);
				} else {
					lien = circuit.RechercherSignalParID(this.entree2).getNom();
					circuit.ajouterLien(lien, this.nom);
				}
			}
			if (this.sortie != -1) {
				if (circuit.RechercherPorteParID(this.sortie) != null) {
					lien = circuit.RechercherPorteParID(this.sortie).getNom();
					circuit.ajouterLien(this.nom, lien);
				} else {
					lien = circuit.RechercherSignalParID(this.sortie).getNom();
					circuit.ajouterLien(this.nom, lien);
				}
			}

		} else {
			if (this.type.equals(typeObject.Porte_OR)) {
				tempid = circuit.AjouterPorte(TypePorte.OR);
				Porte_OR newPorte = (Porte_OR) circuit
						.RechercherPorteParID(tempid);
				newPorte.setID(this.porte_id);
				newPorte.setEntree1(this.entree1);
				newPorte.setEntree2(this.entree2);
				newPorte.setSortie1(this.sortie);
				newPorte.setNom(this.nom);
				if (this.entree1 != -1) {
					if (circuit.RechercherPorteParID(this.entree1) != null) {
						lien = circuit.RechercherPorteParID(this.entree1)
								.getNom();
						circuit.ajouterLien(lien, this.nom);
					} else {
						lien = circuit.RechercherSignalParID(this.entree1)
								.getNom();
						circuit.ajouterLien(lien, this.nom);
					}
				}
				if (this.entree2 != -1) {
					if (circuit.RechercherPorteParID(this.entree2) != null) {
						lien = circuit.RechercherPorteParID(this.entree2)
								.getNom();
						circuit.ajouterLien(lien, this.nom);
					} else {
						lien = circuit.RechercherSignalParID(this.entree2)
								.getNom();
						circuit.ajouterLien(lien, this.nom);
					}
				}
				if (this.sortie != -1) {
					if (circuit.RechercherPorteParID(this.sortie) != null) {
						lien = circuit.RechercherPorteParID(this.sortie)
								.getNom();
						circuit.ajouterLien(this.nom, lien);
					} else {
						lien = circuit.RechercherSignalParID(this.sortie)
								.getNom();
						circuit.ajouterLien(this.nom, lien);
					}
				}
			} else {
				tempid = circuit.AjouterPorte(TypePorte.NOT);
				Porte_NOT newPorte = (Porte_NOT) circuit
						.RechercherPorteParID(porte_id);
				newPorte.setID(this.porte_id);
				newPorte.setEntree1(this.entree1);
				newPorte.setSortie1(this.sortie);
				newPorte.setNom(this.nom);
				if (this.entree1 != -1) {
					if (circuit.RechercherPorteParID(this.entree1) != null) {
						lien = circuit.RechercherPorteParID(this.entree1)
								.getNom();
						circuit.ajouterLien(lien, this.nom);
					} else {
						lien = circuit.RechercherSignalParID(this.entree1)
								.getNom();
						circuit.ajouterLien(lien, this.nom);
					}
				}
				if (this.sortie != -1) {
					if (circuit.RechercherPorteParID(this.sortie) != null) {
						lien = circuit.RechercherPorteParID(this.sortie)
								.getNom();
						circuit.ajouterLien(this.nom, lien);
					} else {
						lien = circuit.RechercherSignalParID(this.sortie)
								.getNom();
						circuit.ajouterLien(this.nom, lien);
					}
				}
			}
		}
		circuit.Valider();
	}

}

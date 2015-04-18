package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.MementoCommande;
import editeurcircuit.TypePorte;
import editeurcircuit.Historique;

public class CommandeAjouterPorteNot implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int id;
	private String nom;

	public CommandeAjouterPorteNot(Circuit v_circuit, Historique v_historique) {
		this.circuit = v_circuit;
		this.historique = v_historique;
	}

	@Override
	public void execute() {
		int tempid;
		if (this.id == 0) {
			this.id = circuit.AjouterPorte(TypePorte.NOT);
			this.nom = circuit.RechercherPorteParID(this.id).getNom();
			MementoCommande memento = new MementoCommande();
			memento.setAction(this);
			historique.getPileUndo().add(memento);
		} else {
			tempid = circuit.AjouterPorte(TypePorte.NOT);
			circuit.RechercherPorteParID(tempid).setID(this.id);
			circuit.RechercherPorteParID(this.id).setNom(this.nom);
		}
		circuit.setSauvegarder(false);
	}

	@Override
	public void unexecute() {
		circuit.SupprimerPorte(this.id);
	}
}
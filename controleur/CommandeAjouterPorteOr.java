package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;
import editeurcircuit.TypePorte;

public class CommandeAjouterPorteOr implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int id;
	private String nom;

	public CommandeAjouterPorteOr(Circuit v_circuit, Historique v_historique) {
		this.circuit = v_circuit;
		this.historique = v_historique;
	}

	@Override
	public void execute() {
		int tempid;
		if (this.id == 0) {
			this.id = circuit.AjouterPorte(TypePorte.OR);
			this.nom = circuit.RechercherPorteParID(this.id).getNom();
			MementoCommande memento = new MementoCommande();
			memento.setAction(this);
			historique.getPileUndo().add(memento);
		} else {
			tempid = circuit.AjouterPorte(TypePorte.OR);
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
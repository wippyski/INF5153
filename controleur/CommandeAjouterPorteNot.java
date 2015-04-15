package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.MementoCommande;
import editeurcircuit.TypePorte;
import editeurcircuit.Historique;

public class CommandeAjouterPorteNot implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int id;

	public CommandeAjouterPorteNot(Circuit v_circuit, Historique v_historique) {
		this.circuit = v_circuit;
		this.historique = v_historique;
	}

	@Override
	public void execute() {
		this.id = circuit.AjouterPorte(TypePorte.NOT);
		circuit.setSauvegarder(false);
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
	}

	@Override
	public void unexecute() {
		circuit.SupprimerPorte(this.id);
	}
}
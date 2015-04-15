package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;
import editeurcircuit.TypeSignal;

public class CommandeAjouterEntree implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int id;

	public CommandeAjouterEntree(Circuit v_circuit, Historique v_historique) {
		this.circuit = v_circuit;
		this.historique = v_historique;
	}

	@Override
	public void execute() {
		this.id = circuit.AjouterSignal(TypeSignal.ENTREE);
		circuit.setSauvegarder(false);
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
	}

	@Override
	public void unexecute() {
		circuit.SupprimerSignal(this.id);
	}
}

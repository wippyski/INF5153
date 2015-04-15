package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;

public class CommandeSupprimerSignal implements Commande {

	private Circuit circuit;
	private int signal_id;
	private Historique historique;

	public CommandeSupprimerSignal(Circuit v_circuit, Historique v_historique,
			int id) {
		this.circuit = v_circuit;
		this.historique = v_historique;
		this.signal_id = id;
	}

	@Override
	public void execute() {
		circuit.SupprimerSignal(signal_id);
		circuit.setSauvegarder(false);
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
}

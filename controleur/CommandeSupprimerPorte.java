package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;

public class CommandeSupprimerPorte implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int porte_id;

	public CommandeSupprimerPorte(Circuit v_circuit, int id,
			Historique v_historique) {
		this.circuit = v_circuit;
		this.historique = v_historique;
		this.porte_id = id;
	}

	@Override
	public void execute() {
		circuit.SupprimerPorte(porte_id);
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

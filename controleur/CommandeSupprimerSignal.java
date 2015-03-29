package controleur;

import editeurcircuit.Circuit;

public class CommandeSupprimerSignal implements Commande {
	
	private Circuit circuit;
	private int signal_id;
	
	public CommandeSupprimerSignal(Circuit v_circuit, int id) {
		this.circuit = v_circuit;
		this.signal_id = id;
	}

	@Override
	public void execute() {
				
		System.out.println("Supprimer signal");
		circuit.SupprimerSignal(signal_id);
	}
}

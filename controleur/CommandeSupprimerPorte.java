package controleur;

import editeurcircuit.Circuit;

public class CommandeSupprimerPorte implements Commande {
	
	private Circuit circuit;
	private int porte_id;
	
	public CommandeSupprimerPorte(Circuit v_circuit, int id) {
		this.circuit = v_circuit;
		this.porte_id = id;
	}

	@Override
	public void execute() {
				
		System.out.println("Supprimer Porte");
		circuit.SupprimerPorte(porte_id);
		circuit.setSauvegarder(false);
	}
}

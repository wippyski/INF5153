package controleur;

import editeurcircuit.Circuit;

public class CommandeQuitter implements Commande{

	private Circuit circuit;
	
	public CommandeQuitter(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

		
	@Override
	public void execute() {
		System.exit(0);	
	}
}	
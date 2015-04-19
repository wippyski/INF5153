package controleur;

import editeurcircuit.Circuit;

public class CommandeCalculer implements Commande {
	
	private Circuit circuit;
	
	public CommandeCalculer(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {				
				circuit.calculerTable(); 
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
}

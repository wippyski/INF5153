package editeurcircuit.vue;

import editeurcircuit.Circuit;

public class CommandeQuitter implements Commande{

	private Circuit circuit;
	
	public CommandeQuitter(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

		
	@Override
	public void execute() {
		if(circuit.isSauvegarder()){
			System.exit(0);
		} else {
			System.out.println("Sauvegarder d'abord le circuit en cours (à faire)");
		}		
	}
}	
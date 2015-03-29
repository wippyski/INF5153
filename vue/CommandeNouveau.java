package vue;

import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;

public class CommandeNouveau implements Commande{

	private Circuit circuit;
	
	public CommandeNouveau(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

		
	@Override
	public void execute() {
		if(circuit.isSauvegarder()){
			EditeurVue.v_circuit = EditeurcircuitFactory.eINSTANCE.createCircuit();
		} else {
			System.out.println("Sauvegarder d'abord le circuit en cours (à faire)");
		}		
	}
	
}

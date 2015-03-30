package controleur;

import vue.EditeurVue;
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
			circuit = EditeurcircuitFactory.eINSTANCE.createCircuit();
			circuit.setSauvegarder(true);	
			System.out.println("Test");
		} else {
			System.out.println("Sauvegarder d'abord le circuit en cours (à faire)");
		}		
	}
	
	public Circuit execute2() {
			circuit = EditeurcircuitFactory.eINSTANCE.createCircuit();
			circuit.setSauvegarder(true);	
			System.out.println("Test");
			
			return circuit; 
	}
}

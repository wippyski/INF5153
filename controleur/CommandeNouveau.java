package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.EditeurcircuitFactory;
import editeurcircuit.TypeSignal;

public class CommandeNouveau implements Commande{

	private Circuit circuit;
	
	public CommandeNouveau(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

		
	@Override
	public void execute() {
			
	}
	
	public Circuit execute2() {
			circuit = EditeurcircuitFactory.eINSTANCE.createCircuit();
			circuit.setSauvegarder(true);	

			// Ajout des signals réglementaires
			circuit.AjouterSignal(TypeSignal.ENTREE);
			circuit.AjouterSignal(TypeSignal.ENTREE);
			circuit.AjouterSignal(TypeSignal.SORTIE);
			
			return circuit; 
	}


	@Override
	public void unexecute() {		
		
	}
}

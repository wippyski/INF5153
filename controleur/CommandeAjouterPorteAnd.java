package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.TypePorte;

public class CommandeAjouterPorteAnd implements Commande {
	
	private Circuit circuit;
	
	public CommandeAjouterPorteAnd(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
				
		System.out.println("Ajouter porte AND");
		circuit.AjouterPorte(TypePorte.AND);
	}
}

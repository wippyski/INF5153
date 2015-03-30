package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.TypePorte;

public class CommandeAjouterPorteNot implements Commande {
	
	private Circuit circuit;
	
	public CommandeAjouterPorteNot(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
				
		System.out.println("Ajouter porte NOT");
		circuit.AjouterPorte(TypePorte.NOT);
		circuit.setSauvegarder(false);
	}
}
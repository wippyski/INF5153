package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.TypePorte;

public class CommandeAjouterPorteOr implements Commande {
	
	private Circuit circuit;
	
	public CommandeAjouterPorteOr(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
						
		circuit.AjouterPorte(TypePorte.OR);
		circuit.setSauvegarder(false);
	}
}
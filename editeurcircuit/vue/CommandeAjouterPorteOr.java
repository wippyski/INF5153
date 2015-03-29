package editeurcircuit.vue;

import editeurcircuit.Circuit;
import editeurcircuit.TypePorte;

public class CommandeAjouterPorteOr implements Commande {
	
	private Circuit circuit;
	
	public CommandeAjouterPorteOr(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
				
		System.out.println("Ajouter porte OR");
		circuit.AjouterPorte(TypePorte.OR);
	}
}
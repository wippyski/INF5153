package controleur;
import editeurcircuit.Circuit;
import editeurcircuit.TypeSignal;


public class CommandeAjouterEntree implements Commande {
	
	private Circuit circuit;
	
	public CommandeAjouterEntree(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {				
		
		circuit.AjouterSignal(TypeSignal.ENTREE);
		circuit.setSauvegarder(false);
	}
}

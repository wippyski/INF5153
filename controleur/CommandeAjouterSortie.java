package controleur;
import editeurcircuit.Circuit;
import editeurcircuit.TypeSignal;


public class CommandeAjouterSortie implements Commande {
	
	private Circuit circuit;
	
	public CommandeAjouterSortie(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {				
	
		circuit.AjouterSignal(TypeSignal.SORTIE);
		circuit.setSauvegarder(false);
	}
}

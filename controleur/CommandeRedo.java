package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;

public class CommandeRedo implements Commande {

	private Circuit circuit;
	private Historique historique;

	public CommandeRedo(Circuit circuit, Historique historique) {
		super();
		this.circuit = circuit;
		this.historique = historique;
	}

	@Override
	public void execute() {
		MementoCommande nextMemento = historique.getPileRedo().pop();		
		Commande nextCommande = nextMemento.getAction();		
		nextCommande.execute();
	}

	@Override
	public void unexecute() {
		

	}

}

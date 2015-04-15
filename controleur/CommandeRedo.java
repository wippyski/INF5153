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
		System.out.println(nextMemento.getAction().toString());
		Commande nextCommande = nextMemento.getAction();
		historique.getPileUndo().add(nextMemento);
		nextCommande.execute();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub

	}

}

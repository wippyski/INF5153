package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;

public class CommandeUndo implements Commande {

	private Circuit circuit;
	private Historique historique;

	public CommandeUndo(Circuit circuit, Historique historique) {
		super();
		this.circuit = circuit;
		this.historique = historique;
	}

	@Override
	public void execute() {
		
		if(historique.getPileUndo().size() > 0){
			MementoCommande lastMemento = historique.getPileUndo().pop();
			Commande lastCommande = lastMemento.getAction();
			historique.getPileRedo().add(lastMemento);
			lastCommande.unexecute();
		}
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub

	}

	

}

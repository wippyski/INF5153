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

		if (nextCommande instanceof CommandeModifierNom) {
			CommandeModifierNom nextCommande1 = (CommandeModifierNom) nextCommande;
			nextCommande1.redo();
		} else {
			if (nextCommande instanceof CommandeAjouterLien) {
				CommandeAjouterLien nextCommande1 = (CommandeAjouterLien) nextCommande;
				nextCommande1.redo();
			} else {
				nextCommande.execute();
			}
		}

		historique.getPileUndo().add(nextMemento);

	}

	@Override
	public void unexecute() {

	}

}

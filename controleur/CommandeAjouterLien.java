package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;

public class CommandeAjouterLien implements Commande {

	private Circuit circuit;
	private String aGauche;
	private String aDroite;
	private Historique historique;

	public CommandeAjouterLien(Circuit v_circuit, Historique v_historique,
			String gauche, String droite) {
		this.circuit = v_circuit;
		this.historique = v_historique;
		this.aGauche = gauche;
		this.aDroite = droite;
	}

	@Override
	public void execute() {
		circuit.ajouterLien(aGauche, aDroite);
		circuit.setSauvegarder(false);
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

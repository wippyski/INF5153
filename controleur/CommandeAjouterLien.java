package controleur;

import editeurcircuit.Circuit;

public class CommandeAjouterLien implements Commande {

	private Circuit circuit;
	private String aGauche;
	private String aDroite;
	
	public CommandeAjouterLien(Circuit v_circuit, String gauche, String droite) {
		this.circuit = v_circuit;
		this.aGauche = gauche;
		this.aDroite = droite;
	}
	
	@Override
	public void execute() {
		System.out.println("Ajout lien!");
		circuit.ajouterLien(aGauche, aDroite);		
	}

}

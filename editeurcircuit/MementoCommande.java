package editeurcircuit;

import controleur.Commande;

public class MementoCommande {

	private Commande action;
	private int id;

	public MementoCommande() {
		super();
	}

	public MementoCommande(Commande action, int id) {
		super();
		this.action = action;
		this.id = id;
	}

	public Commande getAction() {
		return action;
	}

	public void setAction(Commande action) {
		this.action = action;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

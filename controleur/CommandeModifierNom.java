package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;

public class CommandeModifierNom implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int id;
	private String oldnom;
	private String newnom;

	public CommandeModifierNom(Circuit circuit, Historique historique, int id,
			String nom) {
		super();
		this.circuit = circuit;
		this.historique = historique;
		this.id = id;
		this.newnom = nom;
	}

	@Override
	public void execute() {
		historique.getPileRedo().clear();
		this.oldnom = circuit.RechercherSignalParID(this.id).getNom();
		circuit.RechercherSignalParID(this.id).setNom(this.newnom);
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
		circuit.setSauvegarder(false);
		circuit.reconstruireTable();
	}

	public void redo() {
		historique.getPileRedo().clear();
		this.oldnom = circuit.RechercherSignalParID(this.id).getNom();
		circuit.RechercherSignalParID(this.id).setNom(this.newnom);
		circuit.setSauvegarder(false);
		circuit.reconstruireTable();
	}

	@Override
	public void unexecute() {
		circuit.RechercherSignalParID(this.id).setNom(this.oldnom);
		circuit.reconstruireTable();
	}

}

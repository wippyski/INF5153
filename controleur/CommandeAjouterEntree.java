package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;
import editeurcircuit.TypePorte;
import editeurcircuit.TypeSignal;

public class CommandeAjouterEntree implements Commande {

	private Circuit circuit;
	private Historique historique;
	private int id;
	private String nom;

	public CommandeAjouterEntree(Circuit v_circuit, Historique v_historique) {
		this.circuit = v_circuit;
		this.historique = v_historique;
	}

	@Override
	public void execute() {
		historique.getPileRedo().clear();
		int tempid;
		if (this.id == 0) {
			this.id = circuit.AjouterSignal(TypeSignal.ENTREE);			
			this.nom = circuit.RechercherSignalParID(this.id).getNom();
			MementoCommande memento = new MementoCommande();
			memento.setAction(this);
			historique.getPileUndo().add(memento);
		} else {
			tempid = circuit.AjouterSignal(TypeSignal.ENTREE);
			circuit.RechercherSignalParID(tempid).setID(this.id);
			circuit.RechercherSignalParID(this.id).setNom(this.nom);
		}
		circuit.setSauvegarder(false);
		circuit.Valider();
		circuit.reconstruireTable();
	}

	@Override
	public void unexecute() {
		circuit.SupprimerSignal(this.id);
		circuit.Valider();
		circuit.reconstruireTable();
	}


}

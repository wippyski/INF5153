package controleur;

import editeurcircuit.Circuit;
import editeurcircuit.Historique;
import editeurcircuit.MementoCommande;
import editeurcircuit.Porte_AND;
import editeurcircuit.TypeSignal;
import editeurcircuit.impl.CircuitImpl.typeObject;

public class CommandeSupprimerSignal implements Commande {

	private Circuit circuit;
	private int signal_id;
	private Historique historique;
	private String nom;
	private int port;
	private TypeSignal type;

	public CommandeSupprimerSignal(Circuit v_circuit, Historique v_historique,
			int id) {
		this.circuit = v_circuit;
		this.historique = v_historique;
		this.signal_id = id;
	}

	@Override
	public void execute() {
		this.nom = circuit.RechercherSignalParID(signal_id).getNom();
		this.port = circuit.RechercherSignalParID(signal_id).getLien();
		this.type = circuit.RechercherSignalParID(signal_id).getType();
		circuit.SupprimerSignal(signal_id);
		MementoCommande memento = new MementoCommande();
		memento.setAction(this);
		historique.getPileUndo().add(memento);
		circuit.setSauvegarder(false);
	}

	@Override
	public void unexecute() {
		int tempid;
		String lien;
		tempid = circuit.AjouterSignal(this.type);
		circuit.RechercherSignalParID(tempid).setID(this.signal_id);
		circuit.RechercherSignalParID(this.signal_id).setNom(this.nom);
		circuit.RechercherSignalParID(this.signal_id).setType(this.type);
		circuit.RechercherSignalParID(this.signal_id).setLien(this.port);
		if (this.type.equals(typeObject.Signal_SORTIE)) {
			if (circuit.RechercherPorteParID(this.port) != null) {
				lien = circuit.RechercherPorteParID(this.port).getNom();
				circuit.ajouterLien(lien, this.nom);
			} else {
				lien = circuit.RechercherSignalParID(this.port).getNom();
				circuit.ajouterLien(lien, this.nom);
			}
		} else {
			if (circuit.RechercherPorteParID(this.port) != null) {
				lien = circuit.RechercherPorteParID(this.port).getNom();
				circuit.ajouterLien(this.nom, lien);
			} else {
				lien = circuit.RechercherSignalParID(this.port).getNom();
				circuit.ajouterLien(this.nom, lien);
			}
		}
	}

	
}

package editeurcircuit;

import java.util.Stack;

public class Historique {

	private Stack<MementoCommande> pileUndo;	
	private Stack<MementoCommande> pileRedo;

	public Historique() {
		this.pileUndo = new Stack<MementoCommande>();
		this.pileRedo = new Stack<MementoCommande>();
	}

	public void viderPiles() {
		this.pileUndo.clear();
		this.pileRedo.clear();
	}

	public Stack<MementoCommande> getPileUndo() {
		return pileUndo;
	}

	public void setPileUndo(Stack<MementoCommande> pileUndo) {
		this.pileUndo = pileUndo;
	}

	public Stack<MementoCommande> getPileRedo() {
		return pileRedo;
	}

	public void setPileRedo(Stack<MementoCommande> pileRedo) {
		this.pileRedo = pileRedo;
	}

}

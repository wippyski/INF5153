package controleur;

public class CommandeQuitter implements Commande{

	@Override
	public void execute() {
		System.exit(0);	
	}

	@Override
	public void unexecute() {		
		
	}

	
}	
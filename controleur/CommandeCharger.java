package controleur;

import java.awt.Component;
import java.io.File;
import java.util.Map;

import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;





import editeurcircuit.Circuit;
import editeurcircuit.impl.CircuitImpl; 


public class CommandeCharger implements Commande {

	private Circuit circuit;
	private File file; 
	
	public CommandeCharger(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
		try{			
		  	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String,Object> m = reg.getExtensionToFactoryMap();
			m.put("editeurcircuit", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
			URI fileURI = URI.createFileURI(file.getAbsolutePath());
			Resource v_circuitResource = resSet.getResource(fileURI,true);
			circuit = (Circuit)v_circuitResource.getContents().get(0);			
			circuit.setSauvegarder(true);
			((CircuitImpl) circuit).resetID();
			circuit.Valider();
			circuit.reconstruireTable();
			for(int i = 0; i<circuit.getEstDefinitPar().size(); ++i){
				System.out.println(circuit.getEstDefinitPar().get(i).toString());
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog( (Component) null,"ERREUR : Nom de fichier invalide.");
		}
	}
	
	public Circuit execute2(File file) {
		
		try{
			//Fonctionne, car on retourne un nouveau circuit
		  	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String,Object> m = reg.getExtensionToFactoryMap();
			m.put("editeurcircuit", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();
			URI fileURI = URI.createFileURI(file.getAbsolutePath());
			Resource v_circuitResource = resSet.getResource(fileURI,true);
			circuit = (Circuit)v_circuitResource.getContents().get(0);			
			circuit.setSauvegarder(true);	
			circuit.resetID();
			circuit.Valider();
			circuit.reconstruireTable();
		} catch (Exception e) {
			JOptionPane.showMessageDialog( (Component) null,"ERREUR : Nom de fichier invalide.");
		}
		
			return circuit; 
	}

	@Override
	public void unexecute() {		
		
	}

	

}

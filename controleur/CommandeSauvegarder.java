package controleur;


import java.awt.Component;
import java.io.File;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;



import editeurcircuit.Circuit;

public class CommandeSauvegarder implements Commande {

	private Circuit circuit;
	
	public CommandeSauvegarder(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
		JFileChooser fc = new JFileChooser();
		if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
		  File file = fc.getSelectedFile();			  
		  try {						
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String,Object> m = reg.getExtensionToFactoryMap();
			m.put("editeurcircuit", new XMIResourceFactoryImpl());
			ResourceSet resSet = new ResourceSetImpl();		
			URI fileURI = URI.createFileURI(file.getAbsolutePath());
			Resource v_circuitResource = resSet.createResource(fileURI);
			v_circuitResource.getContents().add(circuit);
			v_circuitResource.save(null);
			circuit.setSauvegarder(true);
		  } catch (Exception e) {
			  JOptionPane.showMessageDialog( (Component) null,"ERREUR : Nom de fichier invalide. (Le fichier doit être de forme \"xxx.editeurcircuit\" ");
		  }
		}
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}	
}

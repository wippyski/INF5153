package editeurcircuit.vue;


import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.swing.JFileChooser;

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
			System.out.println(file.getName());
			genererXMI(circuit, file.getName());		
			
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
		}
		
	}
	
	public static void genererXMI(Circuit rootObj, String instanceFileName) throws IOException{		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("editeurcircuit", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();		
		URI fileURI = URI.createFileURI(new File(instanceFileName).getAbsolutePath());		
		Resource v_circuitResource = resSet.createResource(fileURI);
		v_circuitResource.getContents().add(rootObj);
		v_circuitResource.save(null);
		
	}
	
}
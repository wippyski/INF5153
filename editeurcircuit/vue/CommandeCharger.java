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

public class CommandeCharger implements Commande {

	private Circuit circuit;
	
	public CommandeCharger(Circuit v_circuit) {
		this.circuit = v_circuit;
	}

	@Override
	public void execute() {
		JFileChooser fc = new JFileChooser();
		if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		  File file = fc.getSelectedFile();			  
		  circuit = loadCircuit(file.getName());
		  EditeurVue.v_circuit = circuit;
		}			
	}
	
	public static Circuit loadCircuit(String instanceFileName){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String,Object> m = reg.getExtensionToFactoryMap();
		m.put("editeurcircuit", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		URI fileURI = URI.createFileURI(new File(instanceFileName).getAbsolutePath());
		Resource v_circuitResource = resSet.getResource(fileURI,true);
		Circuit v_circuit = (Circuit)v_circuitResource.getContents().get(0);
		return v_circuit;
	}

}

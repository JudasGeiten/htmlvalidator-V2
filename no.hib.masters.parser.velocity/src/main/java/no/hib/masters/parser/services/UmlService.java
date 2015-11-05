package no.hib.masters.parser.services;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import model.ModelPackage;

public class UmlService {
	
	private ResourceSet resourceSet;
	
	public UmlService() {
		resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		resourceSet.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
	}

}

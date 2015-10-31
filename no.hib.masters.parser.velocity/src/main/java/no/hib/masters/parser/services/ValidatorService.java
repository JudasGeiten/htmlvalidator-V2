package no.hib.masters.parser.services;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import no.hib.masters.model.htmldoc.htmlDoc.*;

public class ValidatorService {
	
	private ResourceSet resourceSet;

	public ValidatorService() {
		resourceSet =  new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
		(Resource.Factory.Registry.DEFAULT_EXTENSION, 
		 new XMIResourceFactoryImpl());

		resourceSet.getPackageRegistry().put
			(HtmlDocPackage.eNS_URI, 
			 HtmlDocPackage.eINSTANCE);
	}

	public boolean ValidateModel(String path) {
		try{
			Resource resource = resourceSet.getResource(URI.createURI(path), true);
			
			for (EObject eObject : resource.getContents()) {
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					printDiagnostic(diagnostic, "");
					return false;
				}
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		return true;
	}
	
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
}
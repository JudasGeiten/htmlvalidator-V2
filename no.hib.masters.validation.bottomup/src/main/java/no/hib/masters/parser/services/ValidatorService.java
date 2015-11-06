package no.hib.masters.parser.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import model.ModelPackage;

public class ValidatorService {

	private ResourceSet resourceSet;

	public ValidatorService() {
		resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		resourceSet.getPackageRegistry().put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);

	}

	public ArrayList<Diagnostic> ValidateModel(String path) {
		ArrayList<Diagnostic> res = new ArrayList<Diagnostic>();
		try {
			Resource resource = resourceSet.getResource(URI.createURI(path), true);
			for (EObject eObject : resource.getContents()) {
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
				res.add(diagnostic);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	public void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}

	public void ValidateModelwithConstraints() throws IOException, ParserException {
		EPackage.Registry registry = new EPackageRegistryImpl();
		registry.put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		EcoreEnvironmentFactory environmentFactory = new EcoreEnvironmentFactory(registry);
		// OCL ocl = OCL.newInstance(environmentFactory);

		OCL<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, EClass, EObject> ocl;
		ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);

		// get an OCL text file via some hypothetical API

		InputStream in = new FileInputStream(getClass().getResource("/constrast.ocl").getPath());

		Map<String, Constraint> constraintMap = new HashMap<String, Constraint>();

		// parse the contents as an OCL document
		try {
			OCLInput document = new OCLInput(in);

			List<Constraint> constraints = ocl.parse(document);
			for (Constraint next : constraints) {
				constraintMap.put(next.getName(), next);

				OCLExpression<EClassifier> body = next.getSpecification().getBodyExpression();
				System.out.printf("%s: %s%n", next.getName(), body);
			}
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}

		// model model = getLibrary(); // get library from a hypothetical source

		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl.createOCLHelper();

		// use the constraints defined in the OCL document

		// use the getBooks() additional operation to find a book
		helper.setContext(ModelPackage.Literals.LABEL);
		OCLExpression<EClassifier> query = helper.createQuery("constrastRatio >= 7");

		// Book book = (Book) ocl.evaluate(library, query);
		// System.out.printf("Got book: %s%n", book);

		// use the unique_title constraint to validate the book
		// System.out.printf("Validate book: %b%n", ocl.check(book,
		// constraintMap.get("unique_title")));
	}
}

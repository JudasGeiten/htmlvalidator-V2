package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.eclipse.emf.common.util.Diagnostic;
import org.junit.Before;
import org.junit.Test;

import no.hib.masters.parser.services.ValidatorService;

public class ValidatorServiceTest {

	private ValidatorService service;
	
	@Before
	public void setUp() throws Exception {
		service = new ValidatorService();
	}

	@Test
	public void ValidateValidModelTest() {
		ArrayList<Diagnostic> res = service.ValidateModel("generated-files/valid.xmi");
		for(Diagnostic diag : res)
		{
			for(Diagnostic child : diag.getChildren())
			{
				service.printDiagnostic(child, " ");
			}
			assertTrue(diag.getChildren().size() == 0);
		}
	}
	
	@Test
	public void ValidateInvalidModelTest(){
		ArrayList<Diagnostic> res = service.ValidateModel("generated-files/invalid.xmi");
		boolean modelContainsError = false;
		for(Diagnostic diag : res)
		{
			if(diag.getChildren().size() > 0)
			{
				modelContainsError = true;
			}
		}
		
		assertTrue(modelContainsError);
	}
	
	@Test
	public void ValidateGeneratedOutput(){
		ArrayList<Diagnostic> res = service.ValidateModel("generated-files/generatedHTML.xmi");
		for(Diagnostic diag : res)
		{
			for(Diagnostic child : diag.getChildren())
			{
				service.printDiagnostic(child, " ");
			}
			assertTrue(diag.getChildren().size() == 0);
		}
	}
	
	@Test
	public void ValidateModelUsingOCLConstraint(){
		try{
			service.ValidateModelwithConstraints();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}

package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.Diagnostic;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;

import no.hib.masters.parser.services.ReportService;
import no.hib.masters.parser.services.ValidatorService;

public class ValidatorServiceTest {

	private ValidatorService service;
	
	@Before
	public void setUp() throws Exception {
		service = new ValidatorService();
	}

	@Test
	public void ValidateValidModelTest() {
		List<Diagnostic> res = service.ValidateModel("generated-files/valid.xmi");
		
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
		List<Diagnostic> res = service.ValidateModel("generated-files/invalid.xmi");
		
		
		try {
			Document doc = ReportService.CreateReport(res);
			ReportService.WriteXmlToFile(doc);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
		List<Diagnostic> res = service.ValidateModel("generated-files/generatedHTML.xmi");
		for(Diagnostic diag : res)
		{
			for(Diagnostic child : diag.getChildren())
			{
				service.printDiagnostic(child, " ");
			}
			assertTrue(diag.getChildren().size() == 0);
		}
	}

}

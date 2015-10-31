package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import javax.xml.validation.Schema;

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
	public void ValidateModelTest() {
		String path = "generated-files/generated.xmi";
		assertTrue(service.ValidateModel(path));
	}

}

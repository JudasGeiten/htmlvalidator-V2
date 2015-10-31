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
		String path = getClass().getResource("/generatedResult.xmi").getPath();
		assertTrue(service.ValidateModel(path));
	}

}

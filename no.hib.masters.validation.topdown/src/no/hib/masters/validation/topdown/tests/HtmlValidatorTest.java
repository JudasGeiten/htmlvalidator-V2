package no.hib.masters.validation.topdown.tests;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.xquery.XQException;

import org.junit.Before;
import org.junit.Test;

import no.hib.masters.validation.acceleo.validator.HtmlValidator;

public class HtmlValidatorTest {

	private HtmlValidator validator;
	
	@Before
	public void setUp() throws Exception {
		validator = new HtmlValidator();
	}


	@Test
	public void testValidateHtml() {
		try {
			validator.ValidateHtml("html-files/index.html");
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

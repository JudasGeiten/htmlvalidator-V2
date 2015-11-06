package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import no.hib.masters.parser.services.UtilService;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class UtilServiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStringToXml() {
		String string = "<parent><child>child 1</child><child>child 2</child></parent>";
		
		try {
			Document doc = UtilService.ToXml(string);
			assertTrue(doc != null);
			assertTrue(doc.getFirstChild().getChildNodes().getLength() == 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			assertTrue(false);
		}

	}

}

package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import no.hib.masters.parser.services.ParserService;
import no.hib.masters.parser.services.UtilService;

public class ParserServiceTest {

	private ParserService service;
	
	@Before
	public void setUp() throws Exception {
		String filecontents = UtilService.ReadFile(getClass().getResource("/index.html").getPath());
		Document doc = UtilService.ToXml(filecontents);
		service = new ParserService(doc);
	}

	@Test
	public void testGetAllInputNodes() {
		NodeList res = service.getNodeOfType("input");
		assertTrue(res.getLength() == 2);
	}
	
	@Test
	public void testGetAllLabels(){
		NodeList res = service.getNodeOfType("label");
		assertTrue(res.getLength() == 2);
	}

}

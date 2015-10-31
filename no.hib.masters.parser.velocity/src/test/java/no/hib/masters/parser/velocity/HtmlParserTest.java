package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import no.hib.masters.parser.domain.IParser;
import no.hib.masters.parser.services.UtilService;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class HtmlParserTest {

	private IParser htmlParser;
	
	@Before
	public void setUp() throws Exception {
		htmlParser = new HtmlParser();
	}
	
	@Test
	public void testExtractRawModelToXml()
	{
		try{
			Document doc = htmlParser.ExtractRawModel(getClass().getResource("/index.html").getPath());
			
			assertTrue(doc != null);
			assertTrue(doc.getChildNodes().getLength() > 0);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			assertTrue(false);
		}
	}
	
	@Test
	public void testHtmlParser()
	{
		Document rawModel = null;
		
		try{
			rawModel = htmlParser.ExtractRawModel(getClass().getResource("/index.html").getPath());
			String derivedModel = htmlParser.Parse(rawModel);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			assertTrue(false);
		}

		
	}
}

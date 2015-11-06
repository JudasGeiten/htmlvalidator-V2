package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import no.hib.masters.parser.domain.IParser;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.Document;

public class HtmlParserTest {

	private IParser htmlParser;

	@Before
	public void setUp() throws Exception {
		htmlParser = new HtmlParser();
	}

	@Test
	public void testExtractRawModelToXml() {
		try {
			Document doc = htmlParser.ExtractRawModel(getClass().getResource("/index.html").getPath());

			assertTrue(doc != null);
			assertTrue(doc.getChildNodes().getLength() > 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertTrue(false);
		}
	}

	@Test
	public void testHtmlParser() {
		Document rawModel = null;

		try {
			rawModel = htmlParser.ExtractRawModel(getClass().getResource("/index.html").getPath());
			String derivedModel = htmlParser.Parse(rawModel);
			htmlParser.WriteXmiToFile(derivedModel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertTrue(false);
		}
	}
	
	@Ignore
	@Test
	public void testHtmlParserWithLargeHtmlDocument() {
		Document rawModel = null;

		try {
			rawModel = htmlParser
					.ExtractRawModel(getClass().getResource("/begrunnelseForKaraktersetting.html").getPath());
			String derivedModel = htmlParser.Parse(rawModel);
			htmlParser.WriteXmiToFile(derivedModel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertTrue(false);
		}

	}
}

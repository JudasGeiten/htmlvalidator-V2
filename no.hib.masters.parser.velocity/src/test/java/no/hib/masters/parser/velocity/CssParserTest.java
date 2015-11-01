package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;

import no.hib.masters.parser.domain.IParser;

public class CssParserTest {

	private IParser cssParser;

	@Before
	public void setUp() throws Exception {
		cssParser = new CssParser();
	}

	@Test
	public void testCssParser() {
		Document rawModel = null;

		try {
			rawModel = cssParser.ExtractRawModel(getClass().getResource("/index.html").getPath());
			String derivedModel = cssParser.Parse(rawModel);
			cssParser.WriteXmiToFile(derivedModel);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertTrue(false);
		}
	}

}

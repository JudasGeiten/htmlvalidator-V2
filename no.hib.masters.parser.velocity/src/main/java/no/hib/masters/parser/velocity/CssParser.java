package no.hib.masters.parser.velocity;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import no.hib.masters.parser.domain.IParser;
import no.hib.masters.parser.services.ParserService;
import no.hib.masters.parser.services.UtilService;

public class CssParser implements IParser {

	private ParserService service;

	public String Parse(Document doc) {
		service = new ParserService(doc);
		Element styleElement = null;
		try {
			styleElement = (Element) service.getNodeOfType("style").item(0);
		} catch (Exception e) {
			return "";
		}

		HashMap<String, HashMap<String,String>> rules = GetCssRules(styleElement.getTextContent());
		// String[] styles =
		// styleElement.getTextContent().replace("/\s/g",'').replace(/^.*{([^}]+)}.*/,'$1').match(/([^;]+)/g);

		return "";
	}

	private HashMap<String, HashMap<String,String>> GetCssRules(String content) {
		HashMap<String, HashMap<String,String>> res = new HashMap<String,HashMap<String,String>>();

		Matcher matcher = Pattern.compile("([^\\}\\{]+)(\\{[^\\}]+\\})", Pattern.DOTALL | Pattern.MULTILINE)
				.matcher(content);

		while (matcher.find()) {
			String selector = matcher.group(1);
			String definition = matcher.group(2);
			
			res.put(selector, GetCssDefinition(definition));
		}

		return res;
	}

	private HashMap<String,String> GetCssDefinition(String definition) {
		HashMap<String,String> res = new HashMap<String,String>();
		String[] defArray = definition.split(";", -1);
		for(int i = 0; i < defArray.length; i++){
			String[] cssRule = defArray[i].split(":");
			if(cssRule.length > 1)
			{
				res.put(cssRule[0], cssRule[1]);
			}

		}
		return res;
	}

	public void WriteXmiToFile(String xmi) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("generated-files/generatedCSS.xmi", "UTF-8");
			writer.println(xmi);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Document ExtractRawModel(String uri) {
		Document res = null;
		try {
			String fileContents = UtilService.ReadFile(uri);
			res = UtilService.ToXml(fileContents);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

}

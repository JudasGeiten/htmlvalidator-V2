package no.hib.masters.parser.velocity;

import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.eclipse.emf.common.util.Diagnostic;
import org.w3c.dom.Document;

import no.hib.masters.parser.services.ReportService;
import no.hib.masters.parser.services.ValidatorService;

public class Main {

	public static void main(String[] args) {
		//Setup) Create parser and validator
		HtmlParser parser = new HtmlParser();
		ValidatorService validator = new ValidatorService();
		
		//1) Extract raw model from html document
		Document rawModel = parser.ExtractRawModel("htmldoc/index.html");
		
		//2) Parse raw model in order to obtain derived model
		String derivedModel = parser.Parse(rawModel);
		
		//3) Store derived model as xmi file (for demonstration purposes)
		parser.WriteXmiToFile(derivedModel, "index_html");
		
		//4) Validate derived model
		List<Diagnostic> results = validator.ValidateModel("generated-files/index_html.xmi");
		
		//5) Store results of validation in xml document
		try {
			Document doc = ReportService.CreateReport(results);
			ReportService.WriteXmlToFile(doc);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

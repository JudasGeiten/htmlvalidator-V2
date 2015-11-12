package no.hib.masters.parser.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.emf.common.util.Diagnostic;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ReportService {

	public static Document CreateReport(List<Diagnostic> diags) throws ParserConfigurationException {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		// root elements
		Document doc = docBuilder.newDocument();
		Element rootElement = doc.createElement("results");
		doc.appendChild(rootElement);

		CreateResultNode(diags, doc, rootElement);

		return doc;
	}

	private static void CreateResultNode(List<Diagnostic> diags, Document doc, Element rootElement) {
		for (Diagnostic diag : diags) {
			Element resultNode = doc.createElement("result");

			Element errorMsgNode = doc.createElement("errorMessage");
			Element elementNode = doc.createElement("element");

			errorMsgNode.appendChild(doc.createTextNode(diag.getMessage()));
			elementNode.appendChild(doc.createTextNode(diag.getSource()));

			resultNode.appendChild(errorMsgNode);
			resultNode.appendChild(elementNode);

			rootElement.appendChild(resultNode);

			for (Diagnostic child : diag.getChildren()) {
				CreateResultNode(diag.getChildren(), doc, rootElement);
			}

		}
	}

	public static void WriteXmlToFile(Document doc) throws TransformerException {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("results/results.xml"));
		transformer.transform(source, result);
	}

}

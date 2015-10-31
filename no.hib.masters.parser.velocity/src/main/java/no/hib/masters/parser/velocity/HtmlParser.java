package no.hib.masters.parser.velocity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

import no.hib.masters.parser.domain.IParser;
import no.hib.masters.parser.services.ParserService;
import no.hib.masters.parser.services.UtilService;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class HtmlParser implements IParser {

	private VelocityEngine ve;
	private ParserService service;
	
	public HtmlParser() {
		ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "file");
		ve.setProperty("file.resource.loader.description", "Velocity File Resource Loader");
		ve.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
		ve.setProperty("file.resource.loader.path", "./templates");
		ve.setProperty("file.resource.loader.cache", "false");
		ve.setProperty("file.resource.loader.modificationCheckInterval", "0");
		ve.init();
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

	public String Parse(Document doc) {

		if (doc != null) {
			VelocityContext context = AddElementsToContext(doc);
			context.put("service", service);
			Template template = ve.getTemplate("xmi.vm");
			
			StringWriter sw = new StringWriter();
			template.merge(context, sw);

			return sw.toString();
		}

		return "";
	}

	public void WriteXmiToFile(String xmi) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("generated-files/generated.xmi", "UTF-8");
			writer.println(xmi);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private VelocityContext AddElementsToContext(Document doc) {
		service = new ParserService(doc);
		VelocityContext context = new VelocityContext();

		NodeList formSteps = service.getNodeOfType("form");
		// Vector<Node> forms = new Vector<Node>();
		HashMap<Node, Collection<Element>> steps = new HashMap<Node, Collection<Element>>();

		for (int i = 0; i < formSteps.getLength(); i++) {
			Node node = formSteps.item(i);

			Collection<Element> coll = new ArrayList<Element>();

			HashMap<String, String> relationshipMap = new HashMap<String, String>();

			NodeList inputs = service.getChildNodesOfType(node, "input");
			NodeList labels = service.getChildNodesOfType(node, "label");

			for (int j = 0; j < labels.getLength(); j++) {
				Element labelNode = (Element) labels.item(j);
				
				if (labelNode.getAttributes().getNamedItem("for") == null)
				{
					labelNode.setAttribute("for", "");
				}
				
				if (labelNode.getAttributes().getNamedItem("id") == null)
				{
					labelNode.setAttribute("id", "");
				}
				
				if (labelNode.getAttributes().getNamedItem("for").getNodeValue() != "") {
					
					if(labelNode.getAttributes().getNamedItem("id").getNodeValue() == "")
					{
						labelNode.setAttribute("id", UtilService.GenerateRandomElementID());
					}
					
					relationshipMap.put(labelNode.getAttributes().getNamedItem("for").getNodeValue(),
							labelNode.getAttributes().getNamedItem("id").getNodeValue());

				}

				coll.add(labelNode);
			}

			for (int j = 0; j < inputs.getLength(); j++) {
				Element inputNode = (Element) inputs.item(j);
				
				
				if (inputNode.getAttributes().getNamedItem("id") == null)
				{
					inputNode.setAttribute("id", "");
				}
				
				if (inputNode.getAttributes().getNamedItem("id").getNodeValue() != "" 
						&& relationshipMap.containsKey(inputNode.getAttributes().getNamedItem("id").getNodeValue())) {
					
					inputNode.setAttribute("labelledBy", 
							relationshipMap.get(inputNode.getAttributes().getNamedItem("id").getNodeValue()));
				}
				else
				{
					inputNode.setAttribute("labelledBy", "");
				}
				
				
				if(inputNode.getAttributes().getNamedItem("id") == null)
				{
					inputNode.setAttribute("id", "");
				}
				
						
				coll.add(inputNode);
			}

			steps.put(node, coll);
		}

		context.put("formSteps", steps);
		context.put("formId", "BK0395");
		return context;
	}

}

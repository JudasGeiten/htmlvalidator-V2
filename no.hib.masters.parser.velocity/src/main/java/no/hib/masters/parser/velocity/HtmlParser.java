package no.hib.masters.parser.velocity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
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
	
	public Document ExtractRawModel(String uri)
	{
		Document res = null;
		try{
			String fileContents = UtilService.ReadFile(uri);
			res =  UtilService.ToXml(fileContents);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return res;
	}
	
	public String Parse(Document doc) {
		
		if(doc != null)
		{

			VelocityContext context = AddElementsToContext(doc);
			Template template = ve.getTemplate("xmi.vm");

			StringWriter sw = new StringWriter();

			template.merge( context, sw );
			
			System.out.println(sw.toString());
			return sw.toString();
		}
		
		return "";
	}

	public void WriteXmiToFile(String xmi) {
		
	}
	
	private VelocityContext AddElementsToContext(Document doc)
	{
		service = new ParserService(doc);
		VelocityContext context = new VelocityContext();
		
		NodeList formSteps = service.getNodeOfType("form");
		//Vector<Node> forms = new Vector<Node>();
		HashMap<Node, Collection<Node>> steps = new HashMap<Node, Collection<Node>>(); 
		
		for(int i = 0; i < formSteps.getLength(); i++)
		{
			Node node = formSteps.item(i);
			
			Collection<Node> coll = new ArrayList<Node>();
			NodeList inputs = service.getChildNodesOfType(node, "input");
			NodeList labels = service.getChildNodesOfType(node, "label");
			
			for(int j = 0; j < inputs.getLength(); j++){
				Node inputNode = inputs.item(j);
				coll.add(inputNode);
			}
			
			for(int j = 0; j < labels.getLength(); j++){
				Node labelNode = labels.item(j);
				coll.add(labelNode);
			}
			
			steps.put(node, coll);
		}
		
		context.put("formSteps", steps);
		context.put("formId", "BK0395");
		return context;
	}
	
	
}

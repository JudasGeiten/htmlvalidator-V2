package no.hib.masters.parser.services;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserService {
	
	private Document doc;
	
	public ParserService(Document doc)
	{
		this.doc = doc;
	}
	
	public ParserService()
	{
	}
	
	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public NodeList getNodeOfType(String tagname)
	{
		return doc.getElementsByTagName(tagname);
	}
	
	public NodeList getChildNodesOfType(Node node, String childTag)
	{	
		Element element = (Element) node;
		return element.getElementsByTagName(childTag);
	}

}

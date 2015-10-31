package no.hib.masters.parser.domain;

import org.w3c.dom.Document;

public interface IParser {
	public String Parse(Document doc);
	public void WriteXmiToFile(String xmi);
	public Document ExtractRawModel(String uri);
}

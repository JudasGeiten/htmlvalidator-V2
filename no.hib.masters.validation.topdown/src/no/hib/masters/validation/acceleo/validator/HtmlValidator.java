package no.hib.masters.validation.acceleo.validator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.xquery.*;

import javax.xml.namespace.QName;
import net.xqj.basex.BaseXXQDataSource;

public class HtmlValidator {

	public HtmlValidator() {

	}

	public String ValidateHtml(String htmlUri) throws XQException, IOException {
		XQDataSource xqs = new BaseXXQDataSource();
		xqs.setProperty("serverName", "localhost");
		xqs.setProperty("port", "1984");
		XQConnection conn = xqs.getConnection("admin", "admin");

		String input = GetFileContents(htmlUri).replace("<!DOCTYPE html>", "");
		String query = GetFileContents("src-gen/modelRules.xq");
		FileOutputStream output = new FileOutputStream("results/results.xml");

		XQPreparedExpression expr = conn.prepareExpression(query);

		expr.bindDocument(new QName("doc"), input, null, null);

		XQSequence result = expr.executeQuery();
		result.writeSequence(output, null);
		result.close();
		output.close();
		expr.close();
		conn.close();
		
		return GetFileContents("results/results.xml");
	}

	private String GetFileContents(String path) {
		String res = "";
		try {
			byte[] encoded = Files.readAllBytes(Paths.get(path));
			res = new String(encoded);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}

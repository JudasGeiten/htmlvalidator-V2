package no.hib.masters.validation.acceleo;

import java.io.IOException;
import javax.xml.xquery.XQException;
import no.hib.masters.validation.acceleo.validator.HtmlValidator;

public class Main {

	public static void main(String[] args) {
		HtmlValidator validator = new HtmlValidator();
		try {
			validator.ValidateHtml("html-files/index.html");
		} catch (XQException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

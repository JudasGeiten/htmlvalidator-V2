package no.hib.masters.parser.services;

import java.awt.Color;
import java.util.HashMap;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class StyleService {
	private HashMap<String, HashMap<String, String>> CssStyles;

	public StyleService(HashMap<String, HashMap<String, String>> styles) {
		CssStyles = styles;
	}

	public HashMap<String, String> getStyleNode(String selector) {
		return CssStyles.get(selector);
	}

	public double CalculateConstrastRatio(String backgroundColor, String fontColor) {
		double L1 = getLumiance(Color.decode(backgroundColor).getRed(),  Color.decode(backgroundColor).getGreen(), Color.decode(backgroundColor).getBlue());
		double L2 = getLumiance(Color.decode(fontColor).getRed(),  Color.decode(fontColor).getGreen(), Color.decode(fontColor).getBlue());
		
		return (double) Math.round(((L2 + 0.05) / (L1 + 0.05)) * 10) / 10;
	}
	
	private double getLumiance(double red, double green, double blue)
	{
		double l = 0;
		double r, g, b;
		
		r = getColorValue(red);
		g = getColorValue(green);
		b = getColorValue(blue);

		l =  (0.2126 * r) + (0.7152 * g) + (0.0722 * b);
		
		return l;
		
	}
	
	private double getColorValue(double color){
		double c = color / 255;
		double res = 0;
		
		if(c  <=  0.03928)
			res = c / 12.92;
		else
			res = Math.pow(((c +0.055) / 1.055), 2.4);
		
		return res;
	}
}

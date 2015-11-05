package no.hib.masters.parser.velocity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import no.hib.masters.parser.services.StyleService;

public class StyleServiceTest {

	private StyleService service;

	@Before
	public void SetUp() {
		service = new StyleService(null);
	}

	@Test
	public void ValidateInvalidConstrastRatiotest() {
		double res = service.CalculateConstrastRatio("#008888", "#0088dd");
		System.out.println(res);
		assertTrue(res < 7);
	}
	
	@Test
	public void ValidateValidConstrastRatiotest() {
		double res = service.CalculateConstrastRatio("#000000", "#ffffff");
		System.out.println(res);
		assertTrue(res > 7);
	}

}

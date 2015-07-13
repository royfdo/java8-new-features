package java8.defaultinterfacemethod;

/**
 * Test class to check interface default method behavior.
 * 
 * @author roy
 */
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class VisaServiceTest {

	private static final String PASSPORT_NUMBER = "N090897";
	private static VisaService australianVisaService = null;
	private static VisaService sriLankanVisaService = null;

	@BeforeClass
	public static void setUp() {
		australianVisaService = new AustralianVisaServiceImpl();
		sriLankanVisaService = new SriLankanVisaServiceImpl();
	}

	@Test
	public void testGetApplicationCurrency() {
		assertEquals("AUD", australianVisaService.getApplicationCurrency());
		assertEquals("USD", sriLankanVisaService.getApplicationCurrency());
	}

	@Test
	public void testGetVisaStatus() {
		assertEquals("PR Granted", australianVisaService.getVisaStatus(PASSPORT_NUMBER));
		assertEquals("Approved", sriLankanVisaService.getVisaStatus(PASSPORT_NUMBER));
	}

}

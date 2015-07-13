package java8.defaultinterfacemethod;

/**
 * Australian Visa service implementation.
 * 
 * @author roy
 */
public class AustralianVisaServiceImpl implements VisaService {

	/*
	 * Overriding default implementation
	 * 
	 * @see java8.defaultinterfacemethod.VisaService#getApplicationCurrency()
	 */
	@Override
	public String getApplicationCurrency() {
		return "AUD";
	}

	@Override
	public String getVisaStatus(String passportNumber) {
		// TODO : Visa selection logic should go here.
		return "PR Granted";
	}

}

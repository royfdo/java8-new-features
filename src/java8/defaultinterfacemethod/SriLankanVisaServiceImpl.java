package java8.defaultinterfacemethod;

/**
 * Sri Lankan visa service implementation.
 * 
 * @author roy
 *
 */
public class SriLankanVisaServiceImpl implements VisaService {

	@Override
	public String getVisaStatus(String passportNumber) {
		// TODO : visa validation logic should go here.
		return "Approved";
	}

}

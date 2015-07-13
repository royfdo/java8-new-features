package java8.defaultinterfacemethod;

public interface VisaService {
	
	default String getApplicationCurrency() {
		return "USD";
	}
	
	String getVisaStatus(String passportNumber);

}

package Adapters;



import Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result =	soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					  customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		  return result;
	}

}

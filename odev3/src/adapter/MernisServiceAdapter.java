package adapter;

import abstracts.GamerCheckService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean gamerCheckRealPerson(Gamer gamer) {
		
		KPSPublicSoap check = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			result = check.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getAge());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}

}

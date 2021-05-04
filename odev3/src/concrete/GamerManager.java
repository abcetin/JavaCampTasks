package concrete;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckService checkService;
	
	public GamerManager(GamerCheckService checkService) {
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) {
		if(checkService.gamerCheckRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() + " Kayýt iþlemi baþarýlý");
		}else {
			System.out.println(gamer.getFirstName() + " Gerçek bir kiþi olduðunuz doðrulanamadý!");
		}
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" baþarýyla silinmiþtir.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" bilgileriniz baþarýyla güncellendi.");
		
	}

}

package concrete;

import abstracts.GameService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " : " + gamer.getNickName() + " kütüphanenize eklenmiþtir. ");
		
	}

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName()+ " kampanyasý " + campaign.getCampaignDate()+" tarihinde baþarýyla yayýnlanmýþtýr.");
		
	}

	@Override
	public void updateCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName()+ " kampanyasýnýn güncelleme iþlemi baþarýyla gerçekleþmiþtir.");
		
	}

	@Override
	public void deleteCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName() + " kampanyasý silinmiþtir");
		
	}

}

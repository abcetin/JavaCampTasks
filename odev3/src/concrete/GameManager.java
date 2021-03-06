package concrete;

import abstracts.GameService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void sellGame(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " : " + gamer.getNickName() + " kütüphanenize eklenmiştir. ");
		
	}

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName()+ " kampanyası " + campaign.getCampaignDate()+" tarihinde başarıyla yayınlanmıştır.");
		
	}

	@Override
	public void updateCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName()+ " kampanyasının güncelleme işlemi başarıyla gerçekleşmiştir.");
		
	}

	@Override
	public void deleteCampaign(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " : " + campaign.getCampaignName() + " kampanyası silinmiştir");
		
	}

}

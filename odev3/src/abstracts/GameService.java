package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface GameService {
	
	void sellGame(Game game, Gamer gamer);
	
	void addCampaign(Game game, Campaign campaign);

	void updateCampaign(Game game, Campaign campaign);

	void deleteCampaign(Game game, Campaign campaign);
	
	
}

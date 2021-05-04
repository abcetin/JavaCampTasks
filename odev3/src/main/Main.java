package main;

import java.sql.Date;

import adapter.MernisServiceAdapter;
import concrete.GameManager;
import concrete.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(1, "Abdullah", "ÇETÝN", "123456", "tulpars", 1996, "cetin@cetin.com");
		Game game = new Game(1, "En gerçekçi oyun", "Dünyadaki en gerçekçi oyun");
		Campaign campaign = new Campaign(1, "Mükkemmel Kampanya", new Date(2021-5-4));
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		
		System.out.println("--------------------------------------------");
		
		
		GameManager gameManager = new GameManager();
		
		gameManager.sellGame(game, gamer);
		gameManager.addCampaign(game, campaign);
		gameManager.updateCampaign(game, campaign);
		gameManager.deleteCampaign(game, campaign);

	}

}

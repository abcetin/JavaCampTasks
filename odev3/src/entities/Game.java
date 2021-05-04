package entities;

public class Game implements Entity {
	int id;
	String gameName;
	String detail;
	
	public Game(int id, String gameName, String detail) {
		
		this.id = id;
		this.gameName = gameName;
		this.detail = detail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}

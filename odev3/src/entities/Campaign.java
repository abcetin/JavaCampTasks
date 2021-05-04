package entities;

import java.sql.Date;

public class Campaign implements Entity {
	
	int id;
	String campaignName;
	Date campaignDate;
	
	public Campaign(int id, String campaignName, Date campaignDate) {
		
		this.id = id;
		this.campaignName = campaignName;
		this.campaignDate = campaignDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Date getCampaignDate() {
		return campaignDate;
	}

	public void setCampaignDate(Date campaignDate) {
		this.campaignDate = campaignDate;
	}
}

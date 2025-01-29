package com.pinnacle.ipl.team;

public class Team {
	private String TeamID;
	private String TeamName;
	private String OwnerName;

	public Team(String teamID, String teamName, String ownerName) {
		TeamID = teamID;
		TeamName = teamName;
		OwnerName = ownerName;
	}

	public String getTeamID() {
		return TeamID;
	}

	public void setTeamID(String teamID) {
		TeamID = teamID;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

}

package com.pinnacle.ipl.player;

public class Player {
	private String PlayerID;
	private String PlayerName;
	private String Nationality;
	private String Role;
	private String TeamID;

	public Player(String playerID, String playerName, String nationality, String role, String teamID) {
		super();
		PlayerID = playerID;
		PlayerName = playerName;
		Nationality = nationality;
		Role = role;
		TeamID = teamID;
	}

	public String getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(String playerID) {
		PlayerID = playerID;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getTeamID() {
		return TeamID;
	}

	public void setTeamID(String teamID) {
		TeamID = teamID;
	}

}

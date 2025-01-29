package com.pinnacle.ipl.match;

public class Match {
	private String MatchID;
	private String Date;
	private String Venue;
	private String Team1id;
	private String Team2id;
	private String Result;

	public Match(String matchID, String date, String venue, String team1id, String team2id, String result) {
		MatchID = matchID;
		Date = date;
		Venue = venue;
		Team1id = team1id;
		Team2id = team2id;
		Result = result;
	}

	public String getMatchID() {
		return MatchID;
	}

	public void setMatchID(String matchID) {
		MatchID = matchID;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getVenue() {
		return Venue;
	}

	public void setVenue(String venue) {
		Venue = venue;
	}

	public String getTeam1id() {
		return Team1id;
	}

	public void setTeam1id(String team1id) {
		Team1id = team1id;
	}

	public String getTeam2id() {
		return Team2id;
	}

	public void setTeam2id(String team2id) {
		Team2id = team2id;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

}

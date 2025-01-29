package com.pinnacle.ipl.performance;


public class Performance {
	private String PerformanceID;
	private int Runs;
	private int Balls;
	private int Wickets;
	private float Overs;
	private String PlayerID;
	private String MatchID;

	public Performance(String performanceID, int runs, int balls, int wickets, double overs, String playerID,
			String matchID) {
		super();
		PerformanceID = performanceID;
		Runs = runs;
		Balls = balls;
		Wickets = wickets;
		Overs = (float) overs;
		PlayerID = playerID;
		MatchID = matchID;
	}

	public String getPerformanceID() {
		return PerformanceID;
	}

	public void setPerformanceID(String performanceID) {
		PerformanceID = performanceID;
	}

	public int getRuns() {
		return Runs;
	}

	public void setRuns(int runs) {
		Runs = runs;
	}

	public int getBalls() {
		return Balls;
	}

	public void setBalls(int balls) {
		Balls = balls;
	}

	public int getWickets() {
		return Wickets;
	}

	public void setWickets(int wickets) {
		Wickets = wickets;
	}

	public float getOvers() {
		return Overs;
	}

	public void setOvers(float overs) {
		Overs = overs;
	}

	public String getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(String playerID) {
		PlayerID = playerID;
	}

	public String getMatchID() {
		return MatchID;
	}

	public void setMatchID(String matchID) {
		MatchID = matchID;
	}

}

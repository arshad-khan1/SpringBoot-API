package com.pinnacle.ipl.team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeamService {
	Team t1 = new Team("t1", "Chennai Super King", "Kalanithi Maran");
	Team t2 = new Team("t2", "Mumbai Indians", "Nita Ambani");
	Team t3 = new Team("t3", "Rajasthan Royals", "Manoj Badale");
	
	private final List<Team> teams = new ArrayList<>(Arrays.asList(t1, t2, t3));
	
	public List<Team> getAllTeams(){
		return teams;
	}
	
	public Team getTeam(String id) {
	       return teams.stream()
	           .filter(t -> id.equals(t.getTeamID()))
	           .findFirst()
	           .orElse(null); 
	   }
	   
	   public void addTeam(Team team) {
	       teams.add(team);
	   }
	   
	   public void deleteTeam(String id) {
	       teams.removeIf(t -> t.getTeamID().equals(id));		
	   }
	   
	   public void updateTeam(String id, Team updatedTeam) {
	       for (int i = 0; i < teams.size(); i++) {
	           Team current = teams.get(i);
	           if (current.getTeamID().equals(id)) {
	               teams.set(i, updatedTeam);
	               return; 	           }
	       }
	   }
}

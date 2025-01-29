package com.pinnacle.ipl.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	private final List<Player> players = new ArrayList<>(Arrays.asList(
	        new Player("play1", "Virat Kohli", "India", "Batsman", "T001"),
	        new Player("play2", "Jasprit Bumrah", "India", "Bowler", "T002")
	    ));

	    public List<Player> getAllPlayers() {
	        return players;
	    }

	    public Player getPlayer(String id) {
	        return players.stream()
	            .filter(p -> id.equals(p.getPlayerID()))
	            .findFirst()
	            .orElse(null);
	    }

	    public void addPlayer(Player player) {
	        players.add(player);
	    }

	    public void deletePlayer(String id) {
	        players.removeIf(p -> p.getPlayerID().equals(id));
	    }

	    public void updatePlayer(String id, Player updatedPlayer) {
	        for (int i = 0; i < players.size(); i++) {
	            Player current = players.get(i);
	            if (current.getPlayerID().equals(id)) {
	                players.set(i, updatedPlayer);
	                return; 
	            }
	        }
	    }
}

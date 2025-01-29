package com.pinnacle.ipl.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@Autowired
    private PlayerService playerService; 

    @RequestMapping(value = "/players") 
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();	
    }
	
    @RequestMapping(value = "/players/{id}") 
    public Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);
    }
	
    @RequestMapping(value = "/players", method = RequestMethod.POST) 
    public void addPlayer(@RequestBody Player player) { 
        playerService.addPlayer(player);
    }
	
    @RequestMapping(value = "/players/{id}", method = RequestMethod.DELETE) 
    public void deletePlayer(@PathVariable String id) {
        playerService.deletePlayer(id);
	}
	
    @RequestMapping(value = "/players/{id}", method = RequestMethod.PUT) 
	public void updatePlayer(@PathVariable String id, @RequestBody Player player) { 
	    playerService.updatePlayer(id, player);
	}
}

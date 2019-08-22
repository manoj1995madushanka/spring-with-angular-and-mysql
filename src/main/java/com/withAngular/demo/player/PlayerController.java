package com.withAngular.demo.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// using controller
/*
 * @Controller public class PlayerController {
 * 
 * 
 * @RequestMapping(value = "/message") // localhost:8080/message
 * 
 * @ResponseBody // because controller only accept by this type of data formats
 * public String getMessage() { return "Hi there"; } }
 */

// using restcontroller it is not require response body
@RestController
public class PlayerController {
	
	// inject to playerservice
	@Autowired
	private PlayerService playerservice;
	
	
	@RequestMapping(value = "/message") // localhost:8080/message
	// @ResponseBody // because controller only accept by this type of data formats
	public String getMessage() {
		return "Hi there";
	}
	
	// get all players from rest api
	@RequestMapping(value = "/players", method= RequestMethod.GET) //localhost:8080/players
	public List<Player> getPlayers(){
		return playerservice.getAllThePlayers();
	} 
	
	// get single player using id by rest api
	@RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
	public Player getPlayerById(@PathVariable int id) {  // pathvariable set parameter value to url id
		return playerservice.getPalyer(id);
	}
	
	// handle POST request
	
	@RequestMapping(value = "/players/save", method=RequestMethod.POST)
	public void savePlayer(@RequestBody Player player) {  // the RequestBody pass the player object to the url
		playerservice.savePlayer(player);
	}
	
	// handle PUT request
	@RequestMapping(value = "/players/update", method= RequestMethod.PUT)
	public void updatePlayer(@RequestBody Player player) {
		playerservice.updatePlayer(player);
	}
	
	// handle delete request
	@RequestMapping(value = "/players/delete/{id}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable int id) {
		playerservice.deletePlayer(id);
	}
}


package com.withAngular.demo.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withAngular.demo.Player;


@Service
// service enable auto wirering it means dependency injection
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	List<Player> list = new ArrayList<>();
	
	public PlayerService() {
		System.out.println("Service layer created");
		/*
		 * list.add(new Player(1,"Manoj")); list.add(new Player(2,"Salla"));
		 * list.add(new Player(3,"Sachintha"));
		 */
	}
	
	// return all the players
	public List<Player> getAllThePlayers(){
		/* return list; */
		List<Player> playerList = new ArrayList<>();
		playerRepository.findAll().forEach(playerList::add);
		return playerList;
		
	}
	
	//return single player
	public Player getPlayer(int id) {
		/*
		 * for (Player p: list) { if(p.getId() == id) { return p; } } return null;
		 */
		Optional<Player> optionalPlayer = playerRepository.findById(id);
		if(optionalPlayer.isPresent()) {
			return optionalPlayer.get();
		}
		return null;
	}
	
	//save the player
	public void savePlayer(Player player) {
		/* list.add(player); */
		playerRepository.save(player);
	}
	
	// update the player
	public void updatePlayer(Player player) {
		/*
		 * for(Player p: list) { if(p.getId() == player.getId()) {
		 * p.setPlayerName(player.getPlayerName()); } }
		 */
		playerRepository.save(player);
	}
	
	// delete the player
	public void deletePlayer(int id) {
		/* list.remove(id); */
		playerRepository.deleteById(id);
	}

}

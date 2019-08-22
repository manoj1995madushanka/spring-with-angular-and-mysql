package com.withAngular.demo.player;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
// service enable auto wirering it means dependency injection
public class PlayerService {
	
	List<Player> list = new ArrayList<>();
	
	public PlayerService() {
		System.out.println("Service layer created");
		list.add(new Player(1,"Manoj"));
		list.add(new Player(2,"Salla"));
		list.add(new Player(3,"Sachintha"));
	}
	
	// return all the players
	public List<Player> getAllThePlayers(){
		return list;
	}
	
	//return single player
	public Player getPalyer(int id) {
		for (Player p: list) {
			if(p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	//save the player
	public void savePlayer(Player player) {
		list.add(player);
	}
	
	// update the player
	public void updatePlayer(Player player) {
		for(Player p: list) {
			if(p.getId() == player.getId()) {
				p.setPlayerName(player.getPlayerName());
			}
		}
	}
	
	// delete the player
	public void deletePlayer(int id) {
		list.remove(id);
	}

}

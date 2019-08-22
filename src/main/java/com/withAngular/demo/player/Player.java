package com.withAngular.demo.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// @Table(name=PLAYER) when table name different from the class name
public class Player {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private int id;
	// @Column(name = "PlayerName") when db table column name different from the
	// property name assigned below
	private String playerName;
	
	// getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}

package com.withAngular.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.withAngular.demo.Team;

@Entity
// @Table(name=PLAYER) when table name different from the class name
public class Player {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private int id;
	// @Column(name = "PlayerName") when db table column name different from the
	// property name assigned below
	private String playerName;
	private String preference;
	@Column(name= "match_played")
	private int matchPlayed;
	private int runs;
	private int wickets;
	@Column(name= "highest_score")
	private int highestScore;
	@Column(name="best_wicket")
	private String bestWicket;
	private int fifties;
	private int centuries;
	private int thirties;
	private int catches;
	private int stumpings;
	private int fours;
	private int sixes;
	@Column(name = "strike_rate")
	private double strikeRate;
	private double average;
	
	@ManyToOne(targetEntity = Team.class)
	@JoinColumn(name= "team_id")
	private Team team;
	
	// getters and setters
	
	public Player(int id, String playername, String preference, int matchplayed, int runs, int wickets, int highestscore, String bestWicket, int fifties, int centuries, int thirties, int caches, int stumpings,int fours, int sixes, double strikerate, double average) {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setPlayerName(playername);
		this.setPreference(preference);
		this.setMatchPlayed(matchplayed);
		this.setRuns(runs);
		this.setWickets(wickets);
		this.setHighestScore(highestscore);
		this.setBestWicket(bestWicket);
		this.setFifties(fifties);
		this.setCenturies(centuries);
		this.setThirties(thirties);
		this.setCatches(caches);
		this.setStumpings(stumpings);
		this.setFours(fours);
		this.setSixes(sixes);
		this.setStrikeRate(strikerate);
		this.setAverage(average);
	}
	public int getId() {
		return id;
	}
	public String getPreference() {
		return preference;
	}
	public void setPreference(String preference) {
		this.preference = preference;
	}
	public int getMatchPlayed() {
		return matchPlayed;
	}
	public void setMatchPlayed(int matchPlayed) {
		this.matchPlayed = matchPlayed;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	public String getBestWicket() {
		return bestWicket;
	}
	public void setBestWicket(String bestWicket) {
		this.bestWicket = bestWicket;
	}
	public int getFifties() {
		return fifties;
	}
	public void setFifties(int fifties) {
		this.fifties = fifties;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getThirties() {
		return thirties;
	}
	public void setThirties(int thirties) {
		this.thirties = thirties;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
	}
	public int getStumpings() {
		return stumpings;
	}
	public void setStumpings(int stumpings) {
		this.stumpings = stumpings;
	}
	public int getFours() {
		return fours;
	}
	public void setFours(int fours) {
		this.fours = fours;
	}
	public int getSixes() {
		return sixes;
	}
	public void setSixes(int sixes) {
		this.sixes = sixes;
	}
	public double getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(double strikeRate) {
		this.strikeRate = strikeRate;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
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


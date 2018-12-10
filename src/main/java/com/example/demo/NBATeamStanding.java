package com.example.demo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
class team{
	@JsonProperty("ID")
	public String ID;
	@JsonProperty("City")
	public String City;
	@JsonProperty("Name")
	public String Name;
	@JsonProperty("Abbreviation")
	public String Abbreviation;
	
	
}


class teamstandingsentry{
	 team team;
	 Long rank;
	public team getTeam() {
		return team;
	}
	public void setTeam(team team) {
		this.team = team;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "teamstandingsentry [team=" + team + ", rank=" + rank + "]";
	}	
}

@Data
class overallteamstandings{
	public String lastUpdatedOn;
	@JsonProperty("teamstandingsentry")
	public ArrayList<teamstandingsentry> teamstandingsentries;
	public ArrayList<teamstandingsentry> getTeamstandingsentries() {
		// TODO Auto-generated method stub
		return teamstandingsentries;
	}
}

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NBATeamStanding {
	public overallteamstandings overallteamstandings;

	public overallteamstandings getOverallteamstandings() {
		// TODO Auto-generated method stub
		return overallteamstandings;
	}
	
}

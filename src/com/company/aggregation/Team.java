package com.company.aggregation;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private String teamName;

    public Team(ArrayList<Player> players, String teamName) {
        this.players = players;
        this.teamName = teamName;
    }

    public int getPlayers() {
        return players.size();
    }

    public String getTeamName() {
        return teamName;
    }
}

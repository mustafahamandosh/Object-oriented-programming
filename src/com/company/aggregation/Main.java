package com.company.aggregation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> redPlayers = new ArrayList<>();
        redPlayers.add(0, new Player(1, "Harris", "Red"));
        redPlayers.add(1, new Player(2, "Carol", "Red"));

        ArrayList<Player> bluerPlayers = new ArrayList<>();
        bluerPlayers.add(0, new Player(3, "Johnny", "Blue"));
        bluerPlayers.add(1, new Player(4, "Tim", "Blue"));

        Team redTeam = new Team(redPlayers, "Red");
        Team blueTeam = new Team(bluerPlayers, "Blue");
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(redTeam);
        teams.add(blueTeam);
    }
}

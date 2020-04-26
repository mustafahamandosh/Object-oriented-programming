package com.company.aggregation;

public class Player {
    private int id;
    private String team;
    private String name;

    public Player(int id, String team, String name) {
        this.id = id;
        this.team = team;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }
}

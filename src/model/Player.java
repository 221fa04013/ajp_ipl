package model;

public class Player {
    private int playerId;
    private String name;
    private String team;
    private String role;
    private int runs;
    private int wickets;

    public Player(int playerId, String name, String team, String role, int runs, int wickets) {
        this.playerId = playerId;
        this.name = name;
        this.team = team;
        this.role = role;
        this.runs = runs;
        this.wickets = wickets;
    }

    public void updateStats(int runs, int wickets) {
        this.runs += runs;
        this.wickets += wickets;
    }

    public String toString() {
        return name + " (" + team + ") - " + role + ", Runs: " + runs + ", Wickets: " + wickets;
    }

    // Getters and Setters
    public int getPlayerId() {
        return playerId;
    }

    public String getTeam() {
        return team;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }
}

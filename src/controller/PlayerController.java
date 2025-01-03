package controller;

import java.util.ArrayList;
import java.util.List;
import model.Player;

public class PlayerController {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayerStats(int playerId, int runs, int wickets) {
        for (Player player : players) {
            if (player.getPlayerId() == playerId) {
                player.updateStats(runs, wickets);
                break;
            }
        }
    }

    public List<Player> getTeamPlayers(String teamName) {
        List<Player> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getTeam().equalsIgnoreCase(teamName)) {
                teamPlayers.add(player);
            }
        }
        return teamPlayers;
    }

    public Player getTopPlayer(String category) {
        Player topPlayer = null;
        if ("scorer".equalsIgnoreCase(category)) {
            topPlayer = players.stream().max((p1, p2) -> Integer.compare(p1.getRuns(), p2.getRuns())).orElse(null);
        } else if ("wicket-taker".equalsIgnoreCase(category)) {
            topPlayer = players.stream().max((p1, p2) -> Integer.compare(p1.getWickets(), p2.getWickets())).orElse(null);
        }
        return topPlayer;
    }
}

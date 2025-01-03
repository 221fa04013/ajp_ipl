package view;

import java.util.List;
import model.Player;

public class PlayerView {
    public void displayPlayer(Player player) {
        System.out.println(player);
    }

    public void displayTeam(String teamName, List<Player> players) {
        System.out.println("Team: " + teamName);
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void displayTopPlayer(Player topPlayer, String category) {
        System.out.println("Top " + category + ": " + topPlayer);
    }
}

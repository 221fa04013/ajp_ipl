import controller.PlayerController;
import model.Player;
import view.PlayerView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlayerController controller = new PlayerController();
        PlayerView view = new PlayerView();

        // Add players
        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 640, 0));
        controller.addPlayer(new Player(2, "Jasprit Bumrah", "MI", "Bowler", 120, 27));

        // Update stats
        controller.updatePlayerStats(1, 60, 0);

        // Display team roster
        List<Player> teamPlayers = controller.getTeamPlayers("RCB");
        view.displayTeam("RCB", teamPlayers);

        // Display top scorer
        Player topScorer = controller.getTopPlayer("scorer");
        view.displayTopPlayer(topScorer, "scorer");
    }
}

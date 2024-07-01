package mini2.view;
/**Class: Adventure
 * @author Chiamaka Ekwegh
 * @version 3.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The Adventure class serves as the entry point for starting the text-based adventure game.
 * It initializes the game controller and begins the gameplay loop.
 */
import mini2.controller.GameController;
public class Adventure {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.playGame();
    }
}

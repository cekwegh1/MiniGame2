package mini2.controller;
/**Class: Commands
 * @author Chiamaka Ekwegh
 * @version 2.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The Commands class handles player inputs and executes actions in the game,
 * such as moving between rooms and managing items. It updates the game state
 * based on these actions.
 */
import java.util.Scanner;

public class Commands {
    private GameController gameController;
    private Scanner scanner;

    public Commands(GameController gameController) {
        this.gameController = gameController;
        this.scanner = new Scanner(System.in);
    }

    public void processCommands() {
        gameController.playGame();
    }
}
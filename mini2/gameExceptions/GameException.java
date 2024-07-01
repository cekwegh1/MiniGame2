package mini2.gameExceptions;
/**Class: GameExceptions
 * @author Chiamaka Ekwegh
 * @version 2.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The GameException class represents exceptions that can occur during the execution of the game.
 * It extends the base Exception class to provide custom error handling for game-related issues.
 */
public class GameException extends Exception {

    public GameException() {
        super();
    }

    public GameException(String message) {
        super(message);
    }

    public GameException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameException(Throwable cause) {
        super(cause);
    }
}

package mini2.controller;
/**Class: GameController
 * @author Chiamaka Ekwegh
 * @version 5.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The GameController class is responsible for controlling the main game loop. It initializes
 * the game, processes user commands, and updates the game state based on those commands.
 * The class interacts with RoomDB to retrieve room information, Player to manage player
 * inventory, and other components to facilitate game play.
 */
import mini2.model.RoomDB;

import java.util.Scanner;

public class GameController {
    private RoomDB roomDB;
    private Room currentRoom;
    private Player player;
    private Scanner scanner;

    public GameController() {
        roomDB = RoomDB.getInstance();
        player = new Player();
        scanner = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("Welcome to my adventure game. You will proceed through rooms based upon your entries.");
        System.out.println("You can navigate by using the entire direction or just the first letter.");
        System.out.println("You can also use Look and interact with items by typing get <item>.");
        System.out.println("To exit the game, enter X");

        // Start the game in the beginning room
        currentRoom = roomDB.getRoomByID(1);
        if (currentRoom == null) {
            System.err.println("Error: Starting room not found.");
            return;
        }

        while (true) {
            // Display current room information
            System.out.println(currentRoom.getName());
            System.out.println(currentRoom.getDescription());
            currentRoom.displayExits();
            currentRoom.displayItems();

            // Check for game completion
            if (currentRoom.getName().equals("Finish")) {
                System.out.println("Congratulations! You have completed the journey through my maze.");
                break;
            }

            // Prompt for user input
            System.out.print("> ");
            String command = scanner.nextLine().trim().toUpperCase();

            // Handle commands
            if (command.equals("X")) {
                System.out.println("Exiting the game.");
                break;
            } else if (command.startsWith("GET ")) {
                String itemName = command.substring(4).trim();
                boolean itemFound = false;
                for (Item item : currentRoom.getItems()) {
                    if (item.getName().equalsIgnoreCase(itemName)) {
                        player.addItem(item);
                        currentRoom.removeItem(item);
                        System.out.println("You picked up: " + itemName);
                        itemFound = true;
                        break;
                    }
                }
                if (!itemFound) {
                    System.out.println("Item not found in this room.");
                }
            } else {
                // Assume it's a direction command
                Room nextRoom = navigate(command);
                if (nextRoom == null) {
                    System.out.println("Invalid direction. Please try again.");
                } else {
                    currentRoom = nextRoom;
                }
            }
        }

        // Clean up resources
        scanner.close();
    }

    private Room navigate(String command) {
        for (Exit exit : currentRoom.getExits()) {
            if (exit.getDirection().equalsIgnoreCase(command) || exit.getDirection().startsWith(command)) {
                return roomDB.getRoomByID(exit.getTargetRoomID());
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.playGame();
    }
}
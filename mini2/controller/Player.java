package mini2.controller;
/**Class: Player
 * @author Chiamaka Ekwegh
 * @version 2.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The Player class allows adding and removing items from the inventory. It provides methods
 * to retrieve the current inventory of the player.
 */
import java.util.ArrayList;

public class Player {
    private ArrayList<Item> inventory;

    public Player() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }
}

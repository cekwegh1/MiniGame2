package mini2.controller;
/**Class: Item
 * @author Chiamaka Ekwegh
 * @version 3.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The Item class provides methods to retrieve the item's ID, name, and description.
 * It is used to manage the player's inventory and interact with items found in rooms.
 */
public class Item {
    private int itemID;
    private String name;
    private String description;

    public Item(int itemID, String name, String description) {
        this.itemID = itemID;
        this.name = name;
        this.description = description;
    }

    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getItemName() {
        // TODO Auto-generated method stub
        return null;
    }

}
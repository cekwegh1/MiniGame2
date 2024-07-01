package mini2.controller;
/**Class: Room
 * @author Chiamaka Ekwegh
 * @version 4.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The Room class provides methods to set and retrieve information about the room, including
 * its ID, name, description, and exits to other rooms. It also allows adding and retrieving
 * items present in the room.
 */
import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomID;
    private String name;
    private String description;
    private boolean visited;
    private List<Exit> exits;

    public Room(int roomID) {
        this.roomID = roomID;
        this.exits = new ArrayList<>();
    }

    public int getRoomID() {
        return roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Exit> getExits() {
        return exits;
    }

    public void addExit(Exit exit) {
        exits.add(exit);
    }

    public void displayItems() {
        System.out.println("Items in this room:");
        for (Item item : getItems()) {
            System.out.println(item.getName() + ": " + item.getDescription());
        }
    }

    public void displayExits() {
        System.out.println("Exits:");
        for (Exit exit : exits) {
            System.out.println(exit.getDirection());
        }
    }

    //list to store items in the room
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}

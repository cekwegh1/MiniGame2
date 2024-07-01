package mini2.model;
/**Class: ItemDB
 * @author Chiamaka Ekwegh
 * @version 5.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The ItemDB class manages the collection of items available in the game.
 * It provides methods to read items from a file, retrieve items by their IDs,
 * and maintain a singleton instance for access throughout the game.
 */
import mini2.controller.Item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ItemDB {
    private static ItemDB instance;
    private ArrayList<Item> items;

    private ItemDB() {
        items = new ArrayList<>();
        readItemsFromFile("items.txt");
    }

    public static ItemDB getInstance() {
        if (instance == null) {
            instance = new ItemDB();
        }
        return instance;
    }

    private void readItemsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader("items.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                int itemID = Integer.parseInt(line.trim());
                String itemName = reader.readLine().trim();
                String itemDescription = reader.readLine().trim();
                items.add(new Item(itemID, itemName, itemDescription));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Item getItemByID(int itemID) {
        for (Item item : items) {
            if (item.getItemID() == itemID) {
                return item;
            }
        }
        return null;
    }
}

package mini2.model;
/**Class: RoomDB
 * @author Chiamaka Ekwegh
 * @version 6.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The RoomDB class is responsible for loading rooms from a file, storing them in memory,
 * and providing methods to access these rooms during gameplay. It ensures that there is
 * only one instance of the room database (singleton pattern) to maintain consistency
 * and efficiency in room management.
 */
import mini2.controller.Exit;
import mini2.controller.Room;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class RoomDB {
    private static RoomDB instance;
    private ArrayList<Room> rooms;

    private RoomDB() {
        rooms = new ArrayList<>();
        readRoomsFromFile("rooms.txt");
    }

    public static RoomDB getInstance() {
        if (instance == null) {
            instance = new RoomDB();
        }
        return instance;
    }

    private void readRoomsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                int roomID = Integer.parseInt(line.trim());
                String name = br.readLine().trim();
                StringBuilder descriptionBuilder = new StringBuilder();
                while (!(line = br.readLine()).equals("----")) {
                    descriptionBuilder.append(line.trim()).append(" ");
                }
                String description = descriptionBuilder.toString().trim();

                Room room = new Room(roomID);
                room.setName(name);
                room.setDescription(description);
                rooms.add(room);

                while (!(line = br.readLine()).equals("----")) {
                    String[] parts = line.split(" ");
                    String direction = parts[0].trim();
                    int targetRoomID = Integer.parseInt(parts[1].trim());
                    room.addExit(new Exit(direction, targetRoomID));
                }

                // Randomly add items to rooms
                if (roomID == 2) {
                    room.addItem(ItemDB.getInstance().getItemByID(1)); // Add Torch to room 2
                }
                if (roomID == 3) {
                    room.addItem(ItemDB.getInstance().getItemByID(2)); // Add Coin to room 3
                }
                if (roomID == 6) {
                    room.addItem(ItemDB.getInstance().getItemByID(3)); // Add Rusty Sword to room 6
                }

                System.out.println("Loaded room: " + roomID + " - " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Room getRoomByID(int roomID) {
        for (Room room : rooms) {
            if (room.getRoomID() == roomID) {
                return room;
            }
        }
        System.out.println("Room with ID " + roomID + " not found.");
        return null;
    }

    public void updateRoom(Room room) {
    }

    public String getMap() {
        StringBuilder map = new StringBuilder();
        for (Room room : rooms) {
            map.append(room.getRoomID()).append(": ").append(room.getName()).append("\n");
        }
        return map.toString();
    }
}


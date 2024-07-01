package mini2.controller;
/**Class: Exit
 * @author Chiamaka Ekwegh
 * @version 2.0
 * Course: ITEC 3860  Summer 2024
 * Written: June 30, 2024
 * The Exit class encapsulates information about an exit in a room, including
 * the direction of the exit (e.g., "NORTH", "SOUTH") and the ID of the room
 * that the exit leads to. It provides methods to access the direction and target room ID.
 */
public class Exit {
    private String direction;
    private int targetRoomID;

    public Exit(String direction, int targetRoomID) {
        this.direction = direction;
        this.targetRoomID = targetRoomID;
    }

    public String getDirection() {
        return direction;
    }

    public int getTargetRoomID() {
        return targetRoomID;
    }

    public int getRoomID() {
        // TODO Auto-generated method stub
        return 0;
    }
}

Overview:

This Java-based text adventure game simulates a journey through various rooms of a maze-like cave system. Players navigate through rooms, interact with items, and ultimately aim to reach the final room to complete the game.

Files Included:

Source Code Files:

Commands.java: Handles player inputs and game actions.
Exit.java: Represents exits from rooms to other rooms.
GameController.java: Controls the game flow, room navigation, and game state.
Item.java: Defines items that can be interacted with in the game.
Player.java: Manages the player's inventory.
Room.java: Represents individual rooms in the game.
GameException.java: Custom exception class for handling game-related errors.
ItemDB.java: Manages items available in the game.
RoomDB.java: Manages rooms and their details.

Text Files:

items.txt: Contains details of items available in the game (item ID, name, description).
Location: Place this file in the same directory as the compiled Java classes (/Users/chiamakaekwegh/IdeaProjects/MiniGame2/Items.txt).
rooms.txt: Describes each room in the game (room ID, name, description, exits).
Location: Place this file in the same directory as the compiled Java classes (/Users/chiamakaekwegh/IdeaProjects/MiniGame2/rooms.txt).

Instructions:

Running the Game:

1) Compile the Java files using javac
2) Run the game using IntelliJ

Gameplay:

1) Follow on-screen instructions to navigate through rooms (NORTH, SOUTH, EAST, WEST, etc.).
2) Use get <item> to interact with items in rooms.
3) Reach the "Finish" room (Room ID: 10) to complete the game.

File Locations:

Ensure items.txt and rooms.txt are correctly located in the same directory as the compiled java classes for the game to access room and item details.

Error Handling:

If the game fails to find items.txt or rooms.txt, ensure these files are in the correct location as specified.

Customization:

Modify items.txt and rooms.txt to change game items and room descriptions, respectively.

Example Output: 

/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50514:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/chiamakaekwegh/IdeaProjects/MiniGame2/out/production/MiniGame2 mini2.controller.GameController
Loaded room: 1 - Beginning
Loaded room: 2 - Entrance
Loaded room: 3 - Cavern
Loaded room: 4 - Spooky Cave
Loaded room: 5 - Rushing River
Loaded room: 6 - Second level
Loaded room: 7 - Dead End
Loaded room: 8 - Cavern of Bones
Loaded room: 9 - Impending Doom
Loaded room: 10 - Finish
Welcome to my adventure game. You will proceed through rooms based upon your entries.
You can navigate by using the entire direction or just the first letter.
You can also use Look and interact with items by typing get <item>.
To exit the game, enter X
Beginning
You are standing at the end of a road before a dark and dank cave. The forest is covering the road lending a dark and spooky aspect to the road. You hear a low wailing that seems to be coming from the cave.
Exits:
WEST
Items in this room:
> w
Entrance
You have entered a dark, low cave that seems to lead to a slightly larger cavern to the west. Strangely you see a faint glow coming from the east.
Exits:
EAST
WEST
Items in this room:
Torch: A guttering torch that sheds a little light.
> get torch
You picked up: TORCH
Entrance
You have entered a dark, low cave that seems to lead to a slightly larger cavern to the west. Strangely you see a faint glow coming from the east.
Exits:
EAST
WEST
Items in this room:
> w
Cavern
You enter a large cavern. You are surprised to find that the walls of the cave are glowing so you have no problem seeing the large stalactites that have formed. To the south you hear the sound of rushing water. To the north you hear strange sounds that sound like someone with a broken heart. You see as set of stairs at the west end of the cavern.
Exits:
EAST
NORTH
DOWN
Items in this room:
Coin: A shiny gold coin.
> get coin
You picked up: COIN
Cavern
You enter a large cavern. You are surprised to find that the walls of the cave are glowing so you have no problem seeing the large stalactites that have formed. To the south you hear the sound of rushing water. To the north you hear strange sounds that sound like someone with a broken heart. You see as set of stairs at the west end of the cavern.
Exits:
EAST
NORTH
DOWN
Items in this room:
> d
Second level
At the bottom of the stairs you see a skeleton from a previous adventurer. You really wish you had some good weapons.
Exits:
UP
NORTH
SOUTH
WEST
Items in this room:
Rusty Sword: A sword that looks like it may fall apart when you touch it.
> get rusty sword
You picked up: RUSTY SWORD
Second level
At the bottom of the stairs you see a skeleton from a previous adventurer. You really wish you had some good weapons.
Exits:
UP
NORTH
SOUTH
WEST
Items in this room:
> s
Cavern of Bones
This room is covered with the bones of previous adventurers.
Exits:
NORTH
Items in this room:
> n
Second level
At the bottom of the stairs you see a skeleton from a previous adventurer. You really wish you had some good weapons.
Exits:
UP
NORTH
SOUTH
WEST
Items in this room:
> n
Dead End
As you enter this dark and forbidding cavern you hear the roar of some enormous monster. You decide that leaving this place would be a great idea.
Exits:
SOUTH
Items in this room:
> s
Second level
At the bottom of the stairs you see a skeleton from a previous adventurer. You really wish you had some good weapons.
Exits:
UP
NORTH
SOUTH
WEST
Items in this room:
> u
Cavern
You enter a large cavern. You are surprised to find that the walls of the cave are glowing so you have no problem seeing the large stalactites that have formed. To the south you hear the sound of rushing water. To the north you hear strange sounds that sound like someone with a broken heart. You see as set of stairs at the west end of the cavern.
Exits:
EAST
NORTH
DOWN
Items in this room:
> d
Second level
At the bottom of the stairs you see a skeleton from a previous adventurer. You really wish you had some good weapons.
Exits:
UP
NORTH
SOUTH
WEST
Items in this room:
> w
Impending Doom
You feel very frightened by this room. Perhaps you need to leave quickly.
Exits:
EAST
NORTH
Items in this room:
> n
Finish
Congratulations!!! You have completed the journey through my maze.
Exits:
SOUTH
Items in this room:
Congratulations! You have completed the journey through my maze.

Process finished with exit code 0

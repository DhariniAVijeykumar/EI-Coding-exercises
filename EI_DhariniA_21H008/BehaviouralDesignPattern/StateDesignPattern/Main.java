public class Main {
    public static void main(String[] args) {
        Door door = new Door();

        // Display initial state
        door.displayState();

        // Open the door
        door.open();
        door.displayState();

        // Lock the door while it's open
        door.lock();
        door.displayState();

        // Unlock and open the door
        door.unlock();
        door.open();
        door.displayState();

        // Close the door and then lock it
        door.close();
        door.lock();
        door.displayState();
    }
}

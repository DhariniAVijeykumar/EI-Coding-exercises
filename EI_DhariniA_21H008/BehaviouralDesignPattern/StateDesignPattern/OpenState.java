public class OpenState implements State {
    private Door door;

    public OpenState(Door door) {
        this.door = door;
    }

   
    public void open() {
        System.out.println("Door is already open.");
    }

    public void close() {
        System.out.println("Closing the door...");
        door.setState(new ClosedState(door));
    }

    public void lock() {
        System.out.println("Cannot lock the door while it's open. Closing first...");
        door.close();
        door.lock();
    }

    public void unlock() {
        System.out.println("Door is already open.");
    }

    public void displayState() {
        System.out.println("Current State: Open");
    }
}

public class ClosedState implements State {
    private Door door;

    public ClosedState(Door door) {
        this.door = door;
    }

 
    public void open() {
        System.out.println("Opening the door...");
        door.setState(new OpenState(door));
    }

    public void close() {
        System.out.println("Door is already closed.");
    }

    
    public void lock() {
        System.out.println("Locking the door...");
        door.setState(new LockedState(door));
    }

    public void unlock() {
        System.out.println("Door is closed. Unlocking...");
    }

   
    public void displayState() {
        System.out.println("Current State: Closed");
    }
}

public class LockedState implements State {
    private Door door;

    public LockedState(Door door) {
        this.door = door;
    }

    
    public void open() {
        System.out.println("Cannot open the door while it's locked. Unlock first...");
        door.unlock();
        door.open();
    }

 
    public void close() {
        System.out.println("Door is already locked.");
    }

    public void lock() {
        System.out.println("Door is already locked.");
    }

  
    public void unlock() {
        System.out.println("Unlocking the door...");
        door.setState(new ClosedState(door));
    }

    public void displayState() {
        System.out.println("Current State: Locked");
    }
}

public class Door {
    private State currentState;

    public Door() {
        // Initial state
        this.currentState = new ClosedState(this);
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void open() {
        currentState.open();
    }

    public void close() {
        currentState.close();
    }

    public void lock() {
        currentState.lock();
    }

    public void unlock() {
        currentState.unlock();
    }

    public void displayState() {
        currentState.displayState();
    }
}

public interface State {
    void open();
    void close();
    void lock();
    void unlock();
    void displayState();
}

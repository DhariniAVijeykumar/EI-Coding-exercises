import java.util.LinkedList;
import java.util.Queue;

public class PrinterSpooler {
    private static PrinterSpooler instance;
    private Queue<String> printQueue;

    private PrinterSpooler() {
        printQueue = new LinkedList<>();
    }

    public static synchronized PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    public void addJob(String job) {
        printQueue.add(job);
    }

    public String printJob() {
        return printQueue.poll();
    }

    public int getQueueSize() {
        return printQueue.size();
    }
}

public class Main {
    public static void main(String[] args) {
        PrinterSpooler spooler = PrinterSpooler.getInstance();

        spooler.addJob("Print Job 1");
        spooler.addJob("Print Job 2");
        spooler.addJob("Print Job 3");

        System.out.println("Queue Size: " + spooler.getQueueSize());
        System.out.println("Printing: " + spooler.printJob());
        System.out.println("Printing: " + spooler.printJob());
        System.out.println("Queue Size: " + spooler.getQueueSize());
    }
}

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public void startComputer() {
        try {
            System.out.println("Starting computer...");
            cpu.start();
            memory.load();
            hardDrive.read();
            System.out.println("Computer started.");
        } catch (Exception e) {
            System.err.println("Error starting computer: " + e.getMessage());
        }
    }

    public void shutDownComputer() {
        try {
            System.out.println("Shutting down computer...");
            hardDrive.write();
            memory.clear();
            cpu.shutDown();
            System.out.println("Computer shut down.");
        } catch (Exception e) {
            System.err.println("Error shutting down computer: " + e.getMessage());
        }
    }
}

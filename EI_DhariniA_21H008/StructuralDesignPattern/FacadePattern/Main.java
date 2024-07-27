public class Main {
    public static void main(String[] args) {
        // Initialize subsystem classes
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hardDrive = new HardDrive();
        
        // Create facade instance
        ComputerFacade computer = new ComputerFacade(cpu, memory, hardDrive);
        
        // Use facade to start and shut down the computer
        computer.startComputer();
        computer.shutDownComputer();
    }
}

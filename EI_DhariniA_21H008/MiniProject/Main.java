import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAstronaut Daily Schedule Organizer");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Edit Task");
            System.out.println("5. Mark Task as Completed");
            System.out.println("6. View Tasks by Priority");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter start time (HH:MM): ");
                    String startTime = scanner.nextLine();
                    System.out.print("Enter end time (HH:MM): ");
                    String endTime = scanner.nextLine();
                    System.out.print("Enter priority level (High/Medium/Low): ");
                    String priority = scanner.nextLine();
                    System.out.println(manager.addTask(description, startTime, endTime, priority));
                    break;

                case "2":
                    System.out.print("Enter task description to remove: ");
                    String removeDescription = scanner.nextLine();
                    System.out.println(manager.removeTask(removeDescription));
                    break;

                case "3":
                    System.out.println(manager.viewTasks());
                    break;

                case "4":
                    System.out.print("Enter task description to edit: ");
                    String editDescription = scanner.nextLine();
                    System.out.print("Enter new start time (HH:MM): ");
                    String newStartTime = scanner.nextLine();
                    System.out.print("Enter new end time (HH:MM): ");
                    String newEndTime = scanner.nextLine();
                    System.out.print("Enter new priority level (High/Medium/Low): ");
                    String newPriority = scanner.nextLine();
                    System.out.println(manager.editTask(editDescription, newStartTime, newEndTime, newPriority));
                    break;

                case "5":
                    System.out.print("Enter task description to mark as completed: ");
                    String completeDescription = scanner.nextLine();
                    System.out.println(manager.markTaskAsCompleted(completeDescription));
                    break;

                case "6":
                    System.out.print("Enter priority level to view tasks (High/Medium/Low): ");
                    String viewPriority = scanner.nextLine();
                    System.out.println(manager.viewTasksByPriority(viewPriority));
                    break;

                case "7":
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

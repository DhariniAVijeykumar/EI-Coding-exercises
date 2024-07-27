import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;

    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public String addTask(String description, String startTime, String endTime, String priority) {
        if (!isValidTimeFormat(startTime) || !isValidTimeFormat(endTime)) {
            notifyObservers("Error: Invalid time format.");
            return "Error: Invalid time format.";
        }
        Task newTask = TaskFactory.createTask(description, startTime, endTime, priority);

        for (Task task : tasks) {
            if (isTimeConflict(task, newTask) && !task.isCompleted()) {
                notifyObservers("Error: Task conflicts with existing task '" + task.getDescription() + "'.");
                return "Error: Task conflicts with existing task '" + task.getDescription() + "'.";
            }
        }

        tasks.add(newTask);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        notifyObservers("Task added successfully. No conflicts.");
        return "Task added successfully. No conflicts.";
    }

    public String removeTask(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                tasks.remove(task);
                notifyObservers("Task removed successfully.");
                return "Task removed successfully.";
            }
        }
        notifyObservers("Error: Task not found.");
        return "Error: Task not found.";
    }

    public String viewTasks() {
        if (tasks.isEmpty()) {
            return "No tasks scheduled for the day.";
        }

        StringBuilder completedTasks = new StringBuilder();
        StringBuilder incompleteTasks = new StringBuilder();

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks.append(task.toString()).append("\n");
            } else {
                incompleteTasks.append(task.toString()).append("\n");
            }
        }

        StringBuilder output = new StringBuilder();
        if (incompleteTasks.length() > 0) {
            output.append("Incomplete Tasks:\n").append(incompleteTasks.toString());
        }
        if (completedTasks.length() > 0) {
            output.append("Completed Tasks:\n").append(completedTasks.toString());
        }

        return output.toString().trim();
    }

    public String editTask(String description, String newStartTime, String newEndTime, String newPriority) {
        if (!isValidTimeFormat(newStartTime) || !isValidTimeFormat(newEndTime)) {
            notifyObservers("Error: Invalid time format.");
            return "Error: Invalid time format.";
        }
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                task.setStartTime(newStartTime);
                task.setEndTime(newEndTime);
                task.setPriority(newPriority);
                notifyObservers("Task edited successfully.");
                return "Task edited successfully.";
            }
        }
        notifyObservers("Error: Task not found.");
        return "Error: Task not found.";
    }

    public String markTaskAsCompleted(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                task.setCompleted(true);
                notifyObservers("Task marked as completed.");
                return "Task marked as completed.";
            }
        }
        notifyObservers("Error: Task not found.");
        return "Error: Task not found.";
    }

    public String viewTasksByPriority(String priority) {
        StringBuilder output = new StringBuilder();
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                output.append(task.toString()).append("\n");
            }
        }
        return output.toString().trim().isEmpty() ? "No tasks found with priority " + priority + "." : output.toString().trim();
    }

    private boolean isTimeConflict(Task existingTask, Task newTask) {
        return newTask.getStartTime().compareTo(existingTask.getEndTime()) < 0 &&
               newTask.getEndTime().compareTo(existingTask.getStartTime()) > 0;
    }

    private boolean isValidTimeFormat(String time) {
        // Regular expression for validating time in HH:MM format
        Pattern pattern = Pattern.compile("^(?:[01]\\d|2[0-3]):[0-5]\\d$");
        Matcher matcher = pattern.matcher(time);
        return matcher.matches();
    }

    private void notifyObservers(String message) {
        // Here we can notify observers about task conflicts or updates
        System.out.println(message);
    }
}

# Coding Exercises

## Overview

This repository contains solutions for two coding exercises. The exercises demonstrate the application of various design patterns and best practices in coding. The goal is to create robust, well-documented, and maintainable code for the given problem statement.

## Exercise 1: Design Patterns

For this exercise, six different use cases are provided to demonstrate an understanding of various software design patterns.

### Use Cases

1. **Behavioral Design Patterns**
   - **Browser History Management using Memento Pattern**
     - **Overview**: Demonstrates the Memento Design Pattern applied to a web browser to manage browsing history. It allows users to navigate back and forth between previously visited webpages by storing and restoring the browser's state.

2. **Door State Management using State Pattern**
   - **Overview**: Demonstrates the State design pattern with a door management system that transitions between different states: Open, Closed, and Locked. The pattern allows the door to change its behavior based on its current state without modifying the door class.
  
3. **Game Object Cloning using Prototype Pattern**
   - **Overview**: Demonstrates the Prototype design pattern for cloning game objects, such as enemies and power-ups, with similar properties but different states. Using the Prototype pattern allows efficient creation of new instances without starting from scratch.
   
4. **Printer Spooler Singleton Pattern**
   - **Overview**: Demonstrates the Singleton design pattern through a Printer Spooler system. The Singleton pattern ensures that there is only one instance of the Printer Spooler managing the print jobs queue.
   
5. **Cake Decorator Pattern in Java**
   - **Overview**: Demonstrates the Decorator design pattern using a cake ordering system. You can add decorations to a basic cake and see the updated prices.
 
  
6. **Computer System Facade Pattern**
   - **Overview**: Demonstrates the Facade design pattern through a simple computer system. The Facade Pattern is used to simplify interactions with complex subsystems, making it easier to start and shut down the computer.
  
**How to Use**:
     1. Clone the repository to your local machine.
     2. Navigate to the project folder.
     3. Compile the Java files.
     4. Run the application.

## Exercise 2: Mini-Projects

**Astronaut Daily Schedule Organizer**
   - **Description**: A console-based application for managing astronauts' daily schedules. The application allow users to:
     - Add tasks with descriptions, start and end times, and priority levels.
     - Remove tasks.
     - View all tasks sorted by start time.
     - Validate and avoid task conflicts.
   - **Key Features**: 
     - Task management (add, remove, view)
     - Task validation for conflicts

## How to Use

1. **Run the Application**: Start the application by running the main executable file in your development environment or terminal.

2. **Add a Task**:
   - Provide the task description, start time, end time, and priority level when prompted.

3. **Remove a Task**:
   - Enter the task description to remove an existing task.

4. **View Tasks**:
   - View all tasks sorted by their start times. The application will display the list of tasks.

5. **Task Validation**:
   - The application will automatically check for any overlapping tasks when you add a new task.

## Getting Started

To use the Astronaut Schedule Organizer, download the project and run the application as described in the "How to Use" section. Follow the on-screen prompts to manage tasks.

# Door State Management using State Pattern

## Overview

This project demonstrates the State design pattern with a door management system that transitions between different states: Open, Closed, and Locked. The pattern allows the door to change its behavior based on its current state without modifying the door class.

## Files

- **`Door.java`**: The context class that maintains the current state of the door.
- **`State.java`**: The state interface defining operations for different states.
- **`OpenState.java`**: Concrete state representing the door being open.
- **`ClosedState.java`**: Concrete state representing the door being closed.
- **`LockedState.java`**: Concrete state representing the door being locked.
- **`Main.java`**: Main class demonstrating state transitions of the door.

## How to Use

1. Clone the repository to your local machine.
2. Navigate to the project folder.
3. Compile the Java files.
4. Run the application.

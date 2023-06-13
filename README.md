# Ascensor
 The code represents a simple elevator system. 


Let's go through the different classes and their functionalities:

Floor class:

Represents a floor in a building.
It has a floorNumber attribute and provides getter and setter methods for it.
The createBuilding method creates a building with a specified number of floors and returns an ArrayList of Floor objects representing each floor.
Elevator class:

Represents the elevator itself.
It has a user attribute representing the current user, an ArrayList elevatorUserList to store users in the elevator, an ArrayList floorList to store the floors in the building, an ArrayList userList to store all users in the system, and a position attribute representing the current floor position of the elevator.
Provides constructors to initialize the elevator with the necessary attributes.
The moveElevator method moves the elevator floor by floor based on a list of destination floors. It checks if any user wants to get off at the current floor and removes the floor from the destination list if so.
User class:

Represents a user in the elevator system.
It has a numPeople attribute representing the number of people in the lobby and a numFloors attribute representing the total number of floors in the building.
The start method is overridden from the Thread class and simulates the behavior of users entering the elevator system.
Main class:

Contains the main method where the program execution begins.
It prompts the user to enter the number of floors in the building and creates the building accordingly using the Floor class.
It prompts the user to enter the number of people in the lobby and simulates their entry into the system using the User class.
The code is a basic implementation of an elevator system, where users can enter the system and request elevator rides to different floors. The elevator moves floor by floor and allows users to exit at their desired floors.

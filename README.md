The Garage System is a Java-based application designed to manage parking operations efficiently. The project adheres to SOLID principles and utilizes design patterns to ensure a robust and maintainable codebase. It provides a user-friendly interface for both administrators and regular users, allowing for effective management of parking slots in a garage.

Features:

Admin Functionality:

Administrators have the capability to configure the parking slots of the garage. This includes setting up the number of slots and their dimensions to accommodate different types of vehicles.
User Functionality:

Users are presented with a menu of options for managing their parking needs. The options include:
Park In: Users can choose between two parking strategies:
First Come, First Serve: The system assigns the first available slot to the user.
Best Fit: The system searches for the most suitable slot based on the vehicle's size and type.
Park Out: Allows users to remove their vehicles from the garage, freeing up the occupied slot.
View Garage Details: Users can view a summary of the current status of the garage, including available and occupied slots.
View Total Income: Displays the total revenue generated from parking fees.
View Number of Vehicles: Shows the total number of vehicles currently parked in the garage.
Exit: Closes the application.
Approach:

The system employs two parking approaches, First Come, First Serve and Best Fit, to cater to different user needs. The implementation follows SOLID principles to ensure scalability and maintainability. Design patterns such as Strategy and Singleton are used to manage the parking logic and configuration settings, enhancing code reusability and flexibility.

Outcome:

This project provides a comprehensive solution for managing a garage's parking operations, offering both administrative control and user convenience. It is designed to be easily extendable and maintainable, making it suitable for various garage management needs.

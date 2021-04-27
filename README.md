# Comp373Proj3

Project 3: Implementing Patterns

Team Members:
Adam Smith and Neha Patel


Project Documentation:

Bridge Pattern:
The Bridge pattern decouples the main classes Facility, FacilityUse, FacilityMaintenance and Inspection from getters and setters. By using this type of pattern, an engineer can modify either class in the future without effecting the other one creating an extremely team friendly system with high testability and stability. 

Observer Pattern:

For our Observer pattern, we created a program which creates a Facility report based on the  changes to the facility observer. There are different kinds of observers that play a role in this such as the facility managers, engineers, and clients. The Observer pattern is used by means of notifying observers of availability or status change of a facility whenever the subject changes. The subject package contains the FacilityGetSetInterface interface and its implementer, “Inspection”. The observers package contains the FacilityObserver interface and implementers, “FacilityUse” and “FacilityMaintenance”. In our program there are two examples of observers: “FacilityUse” and “FacilityMaintenance”.


Visitor Pattern:

The Visitor Pattern allows the classes to become more lightweight, so instead of having three methods there would only be one. The method iterates through the array, accepting updates for each class. Without using this pattern, each class would have to use its own unique method for checking and reporting its status, which is less efficient. Each method could also be expanded so that different reports could be made depending on the situation. 

Project Description:

In this project, we will practice the implementation of design patterns.


- You need to design and implement:
    - Bridge Pattern
    - Observer Pattern
    - Visitor Pattern

- You can implement all patterns in the same implementation or separately. Implementing these patterns in your Facility Management System is a big plus.


## Supporting documents:

- Class notes and examples as well as links for patterns
- Design Patterns book by Gamma or Head First Patterns book
- Search on the web to get more information on the patterns

## Project Expectation:

- Group executed project
- Submission of Design and Code

## Project Submission and Grading:

- 15% of total grade
- Email or Submit on Sakai
- Complete documentation on what problem you solved with the patterns
- Your code OR the location of your solution for the implementation

## Project Due Date:

Submission of the Implementation: EOD 04/26/2021

LaunchModeTest
==============
This project demonstrates 3 different activity launch modes: 'standard', 'singleTop', 'singleTask'
Contains 3 Gradle Android modules:
 - AllStandard
 - AllStandardButDSingleTask
 - AllStandardButDSingleTop

Each module has 2 tasks: Task1 and Task2. Task1 contains activities: A,B,C,D; Task2: X,Y,Z.
Task2 starting from Task1.D

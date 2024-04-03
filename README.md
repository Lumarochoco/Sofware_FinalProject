# Final Project Software Design and Construction
This project is a simulator game of a fight between two Pokemon. 

## Installation

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE should understand
when you `git clone` it. The Maven POM includes the JUnit4 dependency, the Execute Maven Plugin to run the Main method and 
the Maven Javadoc Plugin. The project also implements an Observer Design Pattern.

The implementation are in the usual Maven `src` directories and the tests are in the usual Maven `test` directories :

- `src/main/java`:
    - `is.hi.rbd3.hbv202g.finalproject`: Here, you can find all the classes of the implementation part.
- `test/java`: 
    - `is.hi.rbd3.hbv202g.finalproject`: Here, you can find all the classes for testing.

## Building

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`,
  `Tests`, or `TestCase`). 

## Starting the game 

Maven :

- `mvn exec:java` runs the main methode called `App.main` and starts the game

File : 

- `run.cmd` runs the main methode called `App.main` and starts the game

## Design

UML Class Diagram :

Here, you can find the UML class diagram : [UML Classe Diagram](src/site/markdown/design.md)

## License

Here, you can find all information about the license in this file : [License](LICENSE)

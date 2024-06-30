#Magical Arena
###Overview
The Magical Arena is a simple turn-based combat game where two players, defined by their health, strength, and attack attributes, fight until one of them is defeated. The game logic includes rolling dice to determine attack and defense outcomes, with the attacker's damage being reduced by the defender's strength. The game continues until one player's health reaches zero.

###Project Structure
my-magical-arena
|-- src
|   |-- main
|   |   `-- java
|   |       `-- SwiggyAsde
|   |           |-- model
|   |           |   `-- Player.java
|   |           `-- services
|   |               |-- MagicalArena.java
|   |               `-- MagicalArenaImpl.java
|   `-- test
|       `-- java
|           `-- SwiggyAsde
|               `-- AppTest.java
`-- pom.xml
`-- README.md


###Prerequisites
<ul>
  Java 8 or higher
  Maven 3.6 or higher
</ul>

###Setup and Build
####1. Clone the repository: git clone https://github.com/bhooshanmate/Magical-Arena/tree/master
####2. Build the project using Maven: mvn clean install 


##Running the Application

The main entry point of the application is the MagicalArena class located in src/main/java/SwiggyAsde/services/MagicalArenaImpl.java. To run the application, execute the following command:
mvn exec:java -Dexec.mainClass="SwiggyAsde.services.MagicalArenaImpl"


###Running Tests
mvn test














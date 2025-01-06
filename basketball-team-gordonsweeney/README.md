[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17404551&assignment_repo_type=AssignmentRepo)
# BasketBallTeam

## **Directions**

The goal of this project is to model a basketball team with a Player class that represents a basketball player,
a Bench class that represents a collection of Players that are available to play and a Team made up 5 players chosen from the Bench. Your classes should work with the supplied Runner. *Do not change the Runner. If it doesn't work, change your code.* 

### **Player Class**

1. Create a Player class that has the following instance variables
  * a String called name (name of the Player)
  * an int called number (the Player number)
  * a double called fgp (the field goal percentage of the Player)
2. Write a single constructor that takes parameters for each of the instance variables and uses them for initialization.
3. Write get methods for all the variables.
4. Do *not* make set methods (you can't change a Players name).
5. Write a toString() method that returns all Player data in a meaningful String.
  
### **Bench Class**

1. Create a Bench class that has an ArrayList that holds objects of type Player
2. Write a constructor that has no parameters and initializes the ArrayList.
3. Write an addPlayer() method that takes a Player object as a parameter and adds it to the ArrayList.

### Bench Class Methods

1. A getRandomPlayer() method that has a Player return type and no parameters. The method should select a random Player from the bench, remove them from the bench list and return them.
2. A getMostAccurate() method that has a Player return type and no parameters. The method should find the Player in the bench that has the highest fgp, remove them from the bench list and return them.
3. A swapPlayer() method that has a Player return type and takes a Player parameter. The method should find the Player on the bench that has the next highest number from the Player parameter, remove them from the bench list and return them. If there is no Player with a higher number than the Player parameter then the method should return the last Player on the bench list. The method should also put the Player parameter back on the bench.
  
### **Team Class**

1. Create a Team class that has the following instance variables:
  * an ArrayList named team that holds objects of type Player
  * a Bench object named bench
2. Write a constructor that takes a Bench parameter to initialize the bench instance variable and initializes the ArrayList. The constructor should also call getRandomPlayer() on the Bench object 5 times and add the 5 random players to the team.

### Team Class Methods

1. Write a changePlayer() method that has a void return type and takes an int parameter. The method should remove a player at the index given as the parameter from the team and replace them with a new player from the bench by using the swapPlayer() method. The old player should be placed back on the bench and the new player should occupy the same index on the team as the old player.
2. Write an improveShooting() method that finds the worst shooter on the team (lowest fgp) and replaces them with the best shooter on the bench using the getMostAccurate() method. This method has no return value and no parameters.
3. Write a toString() method so you can print out the team. It should make use of the Player toString() method.
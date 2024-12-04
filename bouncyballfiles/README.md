[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16727638&assignment_repo_type=AssignmentRepo)
# BouncyBalls

## Assignment Description

  The supplied code draws an animated bouncing ball with a random color. Read through the code and see how all the pieces fit together. If you left or right click on the window it will print out the x and y position of the mouse cursor when you clicked. The BouncyBalls class implements the Runnable interface which requires that the class @Overrides the run() method and the MouseListener interface which requires all of the mouse methods.

## Tasks

1. Add an ArrayList of Ball objects to the BouncyBalls class to replace the single Ball object. 
  * When you left click on the window it should make a new Ball object at that point and add it to the ArrayList.
  * The Ball should bounce three times and then it should be removed from the ArrayList.
  * The paintComponent() method should iterate over the ArrayList and call move() and draw() on all the Balls.
  * You will have to make modifications to the Ball class to get this to work as specified.
 2. When you right click on the window it should make a new Ball object at that point but this ball should have a random value for vx (horizontal velocity) that is in the range [-40, 40]. It should also be removed from the ArrayList after bouncing three times off of either wall (e.g. left, right, left, remove).
  *  You will need to modify the move() method in Ball so that the ball will
  * move in the horizontal direction (note that gravity does not affect the horizontal motion)
  * bounce off of the right and left walls
    
## Challenges

If you want a more difficult challenge try these two problems.
1. Implement the MouseWheelListener interface and make the animation speed up or slow down as you scroll the mouse wheel (relatively easy).
2. Make the balls collide and bounce off of each other (difficult).

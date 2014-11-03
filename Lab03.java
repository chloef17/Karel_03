/**
*
* Description of the program goes here  // provide a brief description
*
* @author Chloe  
* @version 3.11.14 // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

    public static void main(String[] args) {
    Display.openWorld("maps/mountain.map");
    Display.setSize(16, 16);
    Display.setSpeed(15);
            
   Climber riley = new Climber();
   Climber boo = new Climber();
            
  riley.turnRight();
   boo.turnRight();
  riley.move();
   boo.move();
  riley.turnLeft();
   boo.turnLeft();
  riley.climbUpRight();
   boo.climbUpRight();
  riley.climbUpRight();
   boo.climbUpRight();
  riley.climbUpRight();
   boo.climbUpRight();
  riley.turnAround();
   boo.turnAround();
  riley.climbDownRight();
   boo.climbDownRight();
  riley.climbDownRight();
   boo.climbDownRight();
  riley.pickBeeper();
   boo.turnAround();
  riley.turnAround();
   boo.climbUpLeft();
  riley.climbUpLeft();
   boo.climbUpLeft();
  riley.climbUpLeft();
   boo.turnAround();
  riley.turnAround();
   boo.climbDownLeft();
  riley.climbDownLeft();
   boo.climbDownLeft();
  riley.climbDownLeft();
   boo.climbDownLeft();
  riley.climbDownLeft();
   boo.turnRight();
  riley.turnRight();
   boo.move();
  riley.move();
   boo.turnRight();
  riley.turnRight();                
   }   
}
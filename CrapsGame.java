// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;
  private int result = 0;


  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total)
  {
    point = 0;
    if (point == 0 && total==2 || total==3 || total==12){
      result = -1;
      point = 0;
    }
    if (point == 0 && total==7 || total==11){
      result = 1;
      point = 0;
    }
    if (point == 0 && total==4 || total==5 || total==6 || total==8 || total ==9 || total == 10){
      result = 0;
      point = total;
    }
    if (point != 0 && total ==point){
      result = 1;
      point = 0;
      }
    if (point != 0 && total ==7){
      result = -1;
      point = 0;
      }
    else
      point = total;
   
    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}
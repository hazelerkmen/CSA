public class TwoSpinners {
    /** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
 	public int spin(int min, int max)
 	{
            int result = 0;
     	    //add code here
            if (min == 1){
                result = (int) (Math.random()*max) + 1;
    	        return result;
            }
            if (min > 1){
                result = (int) (Math.random()*(max - (min-1)) + min);
                return result;
            }
            else
                return 100;
            
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
   	    // add code here
        int playerSpin = spin(1,10);
        System.out.println("Player Spin #1: " + playerSpin);
        int computerSpin = spin(2,8);
        System.out.println("Computer Spin #1: " + computerSpin);
        int difference = playerSpin - computerSpin;
        //int differenceComputer = computerSpin - playerSpin;
        if (playerSpin > computerSpin && difference > 1){
            System.out.println("You win! " + difference + " points.");
        }
        if (playerSpin > computerSpin && difference == 1){
            System.out.println("You win! 1 point.");
        }
        if (playerSpin < computerSpin && difference < -1){
            System.out.println("You lose. " + difference + " points.");
        }
        if (playerSpin < computerSpin && difference == -1){
            System.out.println("You lose. -1 point.");
        }
        if (playerSpin == computerSpin){
            int playerSpin2 = spin(1,10);
            System.out.println("Player Spin #2: " + playerSpin2);
            int computerSpin2 = spin(2,8);
            System.out.println("Computer Spin #2: " + computerSpin2);
            if (playerSpin + playerSpin2 > computerSpin + computerSpin2){
                System.out.println("You win! 1 point.");
            }
            if (playerSpin + playerSpin2 < computerSpin + computerSpin2){
                System.out.println("You lose. -1 point.");
            }
            if (playerSpin + playerSpin2 == computerSpin + computerSpin2){
                System.out.println("Tie. 0 points.");
            }
        }  	
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
                System.out.println(" ");
     	      }
 	  }

}

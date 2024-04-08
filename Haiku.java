public class Haiku{
    
    private int numLines = 3;

    public int getSyllables(int k){
        if (k==2){
            return 7;
        }
        return 5;
    }

    public void printRhythm(){
        System.out.println("ta-ta-ta-ta-ta");
        System.out.println("ta-ta-ta-ta-ta-ta-ta");
        System.out.println("ta-ta-ta-ta-ta");

    }
   

}
public class Haiku extends Poem{
    
    public Haiku(){
        super(3);
    }

    public int getSyllables(int k){
        if (k==2){
            return 7;
        }
        return 5;
    }

    public void printRhythm(){
        for(int i=1; i<=3; i++){
            addTa(getSyllables(i));
            System.out.println("");
        }

    }
   

}
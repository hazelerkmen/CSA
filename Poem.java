public class Poem{
    private int numLines;

    public Poem(int l){
        numLines=l;
    }

    public int getNumLines(){
        return numLines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");
    }

    public void addTa(int syl){
        for(int i=1; i<syl; i++){
            System.out.print("ta-");
        }
        System.out.print("ta");
    }
}
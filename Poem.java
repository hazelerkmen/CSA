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
}
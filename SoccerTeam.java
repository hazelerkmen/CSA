public class SoccerTeam{

    private int w;
    private int l;
    private int t;
    
    private static int games;
    private static int goals;

    public static void main(String[] args){

    }

    public SoccerTeam(){
        this.w = 0;
        this.l = 0;
        this.t=0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        games++;
        goals+=myScore+otherScore;
        if(myScore==otherScore){
            this.t++;
            other.t++;
        }
        else{
            if(myScore>otherScore){
                this.w++;
                other.l++;
            }
            else{
                this.l++;
                other.w++;
            }
        }
    }

    public int getPoints(){
        return (w*3) + t; 
    }

    public void reset(){
        w=0;
        l=0;
        t=0;
    }

    public static int getGames(){
        return games;
    }
    public static int getGoals(){
        return goals;
    }
    public static void startTournament(){
        games=0;
        goals=0;
    }

}
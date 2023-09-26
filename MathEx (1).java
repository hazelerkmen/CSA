public class MathEx{
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(1234));
        System.out.println(swap(123456));
        System.out.println(timeLeft(1,15,4,36));
        timeLeft(1,15,4,36);
    }

        public static int swap(int x){
            int y = x/10%10;
            int z = x%100%10;
            int u = x-x%100;
            return u + z*10 + y;

    }

    public static int timeLeft(int curHour, int curMin, int depHour, int depMin){
        // int hourLeft=((depMin*60+depHour-curHour*60-curMin)/60);
        // int minLeft=(hourLeft%60);
        // System.out.println(hourLeft + " hours and " + minLeft + " minutes");
        System.out.println("test")
    }
}
    
public class MathEx{
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(1234));
        System.out.println(swap(123456));
        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6,22));
        System.out.println(dayOfWeek(5,4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));
    }

        public static int swap(int x){
            int y = x/10%10;
            int z = x%100%10;
            int u = x-x%100;
            return u + z*10 + y;

    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int p=(depHour*60+depMin)-(curHour*60+curMin);
        int hoursLeft=p/60;
        int minLeft=p%60;
        System.out.println(hoursLeft + " hours and " + minLeft + " minutes");

    }

public static int dayOfWeek(int januaryFirst, int day){
    int stepOne = (day+6)%7 + januaryFirst;
    int answer = stepOne - stepOne/7*7; 
    return answer;
}

}
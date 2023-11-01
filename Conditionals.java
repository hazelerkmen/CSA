public class Conditionals {
    public static void main(String [] args)
    {
        System.out.println("Chimp Trouble");
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble(false, false));
        System.out.println(chimpTrouble(true, false));
        System.out.println(chimpTrouble(false, true));

        System.out.println("\nNegatives and Positives");
        System.out.println(negPos(1,-1,false));
        System.out.println(negPos(-1,1,false));
        System.out.println(negPos(1,1,false));
        System.out.println(negPos(-1,-1,false));
        System.out.println(negPos(-4,-5,true));
        System.out.println(negPos(-4,5,true));
        System.out.println(negPos(4,5,true));
        System.out.println(negPos(4,-5,true));

        System.out.println("\nPick Up Phone");
        System.out.println(pickUpPhone(false, false, true));
        System.out.println(pickUpPhone(true, true, true));
        System.out.println(pickUpPhone(true, true, false));
        System.out.println(pickUpPhone(false, true, false));
        System.out.println(pickUpPhone(true, false, false));
        System.out.println(pickUpPhone(false, false, false));

        System.out.println("\nAlarm");
        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm (0, false));
        System.out.println(setAlarm (2, true));
        System.out.println(setAlarm (4, true));
        System.out.println(setAlarm (6, true));

        System.out.println("\nOnes Digit Same");
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame (23, 19, 12));
        System.out.println(onesDigitSame (23, 19, 3));
        System.out.println(onesDigitSame (423, 13, 3));
        System.out.println(onesDigitSame (23, 29, 25));

        System.out.println("\nBlackjack");
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
        System.out.println(blackjack(17, 9));
        System.out.println(blackjack(12, 18));

    }

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile)
    {
        if (aSmile == bSmile){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean negPos(int x, int y, boolean trueOrFalse)
    {
        if (trueOrFalse == false){
            if (x*y < 0)
                return true;
            else
                return false;
        }
        if (trueOrFalse == true){
            if (x<0 && y<0)
                return true;
            
            else
                return false;
        }
        return false;
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if (isAsleep == true){
            return false;
        }
        if (isMorning && isMom == true){
            return true;
        }
        else if (isMorning == true){
            return false;
        }
        else
            return true;
    }

    public static String setAlarm(int dayOfWeek, boolean isVacation)
    {
        if (isVacation == true){
            if (dayOfWeek>=1 && dayOfWeek<=5)
                return "10:00";
            else 
                return "off";
        }
        if (isVacation == false){
            if (dayOfWeek>=1 && dayOfWeek<=5)
                return "7:00";
            else
                return "10:00";
        }
        return "error";
    }

    public static boolean onesDigitSame(int a, int b, int c)
    {
        int a1 = a%10;
        int b1 = b%10;
        int c1 = c%10;
        if (a1 == b1 || a1 == c1 || c1 == b1){
            return true;
        }
        return false;
    }

    public static int blackjack(int x, int y){
        int xNew = 21 - x;
        int yNew = 21 - y;
        if (xNew<0 && yNew<0){
            return 0;
        }
        else if (xNew<0 && yNew>0){
            return y;
        }
        else if (xNew>0 && yNew<0){
            return x;
        }
        else if (xNew>=yNew){
            return y;
        }
        else if (xNew<=yNew){
            return x;
        }
        return 0;
    }
}

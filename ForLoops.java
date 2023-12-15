public class ForLoops {
    public static void main(String[] args){
        ForLoops fl = new ForLoops();
        System.out.println(fl.addEvens(6));
        System.out.println(fl.addEvens(2));
        System.out.println(fl.addEvens(11));
        System.out.println("");
        printSquaresBack(8);
        printSquaresBack(1);
        printSquaresBack(2);
        System.out.println("");
        sillyNumbers();
        System.out.println("");
        sillyNumbers2();
        System.out.println("");
        dollarsAndStars();
    }

    public int addEvens(int n){
        int i;
        int sum=0;
        for (i=2; i<=n; i+=2){
            sum+=i;
        }
        return sum;
    }

    public static void printSquaresBack(int n){
        int i;
        for (i=n; i>=1; i--){
            System.out.print(i*i + " ");
        }
        System.out.println("");
    }

    public static void sillyNumbers(){
        for (int i=1; i<=3; i++){
            for (int j=0; j<=9; j++){
                System.out.print("" + j + j + j);
            }
            System.out.println("");
        }
    }

    public static void sillyNumbers2(){
        for (int i=1; i<=4; i++){
            int repetitions;
            int number=9;
            int x=9;
            for (int count=1; count<=9; count++){
                for (repetitions=x; repetitions>=1; repetitions--){
                    System.out.print(number);
                }
                x--;
                number--;
            }
            System.out.println("");
        }
    } 
    
    public static void dollarsAndStars(){
        int repetition=0;
        int repetition2=7;
        for (int i=1; i<=7; i++){
            int repetition3=2*repetition2;            
            for (int j=repetition; j>0; j--){ 
                System.out.print("*");
            }
            for (int j=repetition2; j>0; j--){
                System.out.print("$");
            }
            for (int j=repetition3; j>0; j--){
                System.out.print("*");
            }
            for (int j=repetition2; j>0; j--){
                System.out.print("$");       
            }
            for (int j=repetition; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
            repetition+=2;
            repetition2--;
        }
    }
}   
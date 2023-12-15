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
//doing 7 lines of code
//first print 7 $, 14 *, then 7$
// next print 2*, 6 $, 12 *, then 6$
        int first=0;
        int second=7;
        int third=2*second;
        for (int i=1; i<=4; i++){
            int characters;
            int characters2;
            for (characters=1; characters<=first; characters+=1){
                System.out.print("*");
            }
            for (characters2=characters; characters2<second; characters2++){
                System.out.print("$");
            }
                

            first+=2;
            second--;
            System.out.println("");
        }
    }

}
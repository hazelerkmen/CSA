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
            for (int j=9; j>=1; j--){
                System.out.print("9");
            }
            for (int k=8; k>=1; k--){
                System.out.print("8");
            }
            for (int l=7; l>=1; l--){
                System.out.print("7");
            }
        System.out.println("");
        }   
    }
}

public class Factorial {
    public static void main(String[] args){
        Factorial f = new Factorial();
        //for (int n=1; n<=20; n++){
        //    System.out.println(f.calcFactorial(n));
       //}
        double e = f.calcE();
        System.out.printf("e is %2.3f\n", e);
    }

    public long calcFactorial(int n){
        int multiply = n-1;
        long sum = n;
        while (multiply>1){
            sum*=multiply;
            multiply--;
        }
        return sum;
    }
 
    public double calcE(){
        double olde=1.0;
        double e=2.0;
        int oldeF=1;
        int eF=2;
        while (e-olde>0.001){
            olde+=1.0/(calcFactorial(oldeF));
            e+=1.0/(calcFactorial(eF));
            oldeF++;
            eF++;
        }
        return e;
    }

    public double calcEX(){
        double olde=0.0;
        double e=1.0;
        int x;
    }


}

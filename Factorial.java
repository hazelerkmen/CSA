public class Factorial {
    public static void main(String[] args){
        Factorial f = new Factorial();
        for (int n=1; n<=20; n++){
            System.out.println(f.calcFactorial(n));
       }
        double e = f.calcE();
        System.out.printf("e is %2.3f\n", e);
        for (int n=1; n<=5; n++){
            double e2 = f.calcEX(n);
            System.out.printf("e to the power of " + n + " is %2.3f \n", e2);
        }

    }

    public long calcFactorial(int n){
        long sum;
        if (n==0){
            sum = 1;
        }
        else{
            int multiply = n-1;
            sum = n;
            while (multiply>1){
                sum*=multiply;
                multiply--;
        }
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

    public double calcEX(int x){
        double olde=0.0;
        double e=1.0;
        int y = 0;
        int y2 = 1;
        while (e-olde>0.001){
            olde+=1.0*Math.pow(x,y)/(calcFactorial(y));
            y++;
            e+=1.0*Math.pow(x,y2)/(calcFactorial(y2));
            y2++;
        }
        return e;
    }


}

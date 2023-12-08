public class Factorial {
    public static void main(String[] args){
        Factorial f = new Factorial();
        for (int n=1; n<=20; n++){
            System.out.println(f.calcFactorial(n));
        }
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


}

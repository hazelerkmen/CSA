public class WhileLoops {
    public static void main(String[] args){
        WhileLoops p = new WhileLoops();
        System.out.println(p.addOdds(3));
        System.out.println(p.addOdds(5));
        System.out.println(p.addOdds(12));
        System.out.println("\n" + p.sumDigits(24));
        System.out.println(p.sumDigits(101));
        System.out.println(p.sumDigits(5234612));
        System.out.println("\n" + p.howManyYears(111.2,120));
        System.out.println(p.howManyYears(111.2,150));
        System.out.println("");
        printSum(6);
        System.out.println("");
        printSum(8);
        System.out.println("");
        printSum(11);
        System.out.println("\n");
        System.out.println(p.isPerfectSquare(25));
        System.out.println(p.isPerfectSquare(144));
        System.out.println(p.isPerfectSquare(26));        
    }

    public int addOdds(int n){
        int sum = 0;
        if (n%2 == 0){
            n--;
        }
        while (n>=1){
            sum+=n;
            n-=2;
        }
        return sum;
            
        }

    public int sumDigits(int x){
        int sum = 0;
        while (x>0){
            sum+=x%10;
            x/=10;    
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        double pop = startpop;
        int years = 0;
        while (pop<endpop){
            pop+=(pop*0.0113);
            years++;
        }
        return years;
    }

    public static void printSum(int n){
        int sum = 1;
        int add = 1;
        System.out.print("1");
        while (add<n){
            add++;
            sum+=add;
            System.out.print(" + " + add);
        }
        System.out.print(" = " + sum);
        
    }

    public boolean isPerfectSquare(int n){
        int sum = 1;
        int odd = 1;
        while (sum<n){
            odd+=2;
            sum+=odd;
        }
        if (sum==n){
            return true;
        }
        else
            return false;
    }
    }
    


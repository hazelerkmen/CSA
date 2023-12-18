public class AdvancedLoops {
    public static void main(String[] args){
        AdvancedLoops al=new AdvancedLoops();
        eights();
        alternate(5);
        System.out.println("");
        alternate(6);
    }

    public static void eights(){
        int i;
        int j;
        int a;
        int b=0;
        for (i=8; i>=2; i-=2){
            for (a=b; a>0; a--){
                System.out.print(" ");
            }
            for (j=i; j>=1; j--){
                System.out.print(i);
            }
            b++;
            System.out.println("");
        }
    }

    public static void alternate(int n){
        for (int i=1; i<=n; i++){
            if (i==1 || i%2!=0){
                for (int j=1; j<=i; j++){
                    System.out.print(j);
                }
            }
            else{
                for (int j=i; j>=1; j--){
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }

    public void isosceles(int height){
        int characters = 2*height-1;
        for (i=1; i<=height; i++){
            
        }
    }
}
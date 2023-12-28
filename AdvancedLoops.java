public class AdvancedLoops {
    public static void main(String[] args){
        AdvancedLoops al=new AdvancedLoops();
        eights();
        alternate(5);
        alternate(6);
        System.out.println("");
        al.isosceles(5);
    }

    public static void eights(){
        for (int i=8; i>=2; i-=2){
            for (int a=(8-i)/2; a>0; a--){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(i);
            }
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
        System.out.println("");
    }

    public void isosceles(int height){
        int x=1;
        for (int i=height; i>0; i--){
            for (int j=(i-1); j>0; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=x; k++){
                System.out.print(k);
            }
            x++;
            System.out.println("");
        }
    }
}
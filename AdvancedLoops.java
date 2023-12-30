public class AdvancedLoops {
    public static void main(String[] args){
        AdvancedLoops al=new AdvancedLoops();
        al.eights();
        al.alternate(5);
        al.alternate(6);
        al.isosceles(5);
        al.isosceles(3);
        al.upSideDown(9, 5);
        al.upSideDown(5,2);
    }

    public void eights(){
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

    public void alternate(int n){
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
        for (int i=1; i<=height; i++){
            for (int j=height-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(k);
            }
            for (int h=i-1; h>0; h--){
                System.out.print(h);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void upSideDown(int big, int small){
        for (int i=big; i>=small; i--){
            for (int j=big-i; j>0; j--){
                System.out.print(" ");
            }
            for (int k=i; k>=small; k--){
                System.out.print(k);
            }
            for (int h=small+1; h<=i; h++){
                System.out.print(h);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
public class MathEx{
    public static void main(String [] args){
        System.out.println(swap(123));
        System.out.println(swap(1234));
        System.out.println(swap(123456));
    }

        public static int swap(int x){
            int y = x/10%10;
            int z = x%100%10;
            int b = x-x%100;
            return b + z*10 + y;

    }
}

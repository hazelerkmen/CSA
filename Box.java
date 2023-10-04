public class Box {
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean hasALid;

    // contructor - creates/initializes an instant
    // of a class
    public Box(double l, double w, double h, String c, boolean lid){
        length = l;
        width = w;
        height = h;
        color = "purple";
        hasALid = true;
// default constructor 
    }
    public Box(){
        length = 1.0;
        width = 1.0;
        height = 1.0;
        color = "white";
        hasALid = false;
    }

    public static void main(String[] args){
        // create an instance
        Box b1 = new Box(6.5, 8.3, 9.4, "brown", false);
        Box b2 = new Box(3.6, 2.8, 7.4);
        Box b3 = new Box();
    }
}

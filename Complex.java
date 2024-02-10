public class Complex {
public static void main(String[] args){
    Complex c1 = new Complex(2,3);
    Complex c2 = new Complex(-4,-5);
    Complex c3 = new Complex(-4,5);
    Complex c4 = new Complex(5,-6);
    Complex c5 = new Complex(7);
    Complex c6 = new Complex(0.0,9);

    System.out.println(c1.multiply(-2.0));
    System.out.println(c2.add(10.0));
    System.out.println(c3.multiply(c4));
    System.out.println(c3.add(c4));
    System.out.println(c5.toString());
    System.out.println(c6.toString());
    System.out.println(c1.abs());
    System.out.println(c5.add(c6));
    System.out.println(c5.multiply(c6));
    System.out.println(c4.abs());
    System.out.println(c6.add(1.0));
    System.out.println(c5.multiply(2.0));
}


private double a;
private double b;

public Complex(double firstCoeff){
    a=firstCoeff;
}

public Complex(double firstCoeff, double secondCoeff){
    a=firstCoeff;
    b=secondCoeff;
}

public double abs(){
    return Math.sqrt((a*a)+(b*b));
}

public Complex add(Complex other){
    double n = this.a+other.a;
    double n1 = this.b+other.b;
    return new Complex(n,n1);
}

public Complex add(double d){
    double n = a+d;
    double n1 = b+d;
    return new Complex(n,n1);
}

public String toString(){
    return a+" + " + b + "i";
}

public Complex multiply(Complex other){
    double n=a*other.a-(b*other.b);
    double n1=a*other.b+(b*other.a);
    return new Complex(n,n1);
}

public Complex multiply(double d){
    double n =a*d;
    double n1=b*d;
    return new Complex(n,n1);
}

}

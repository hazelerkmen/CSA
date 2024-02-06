public class Complex {
    //The Complex class should contain the following:
//- 2 instance variables (attributes)
//- 2 constructors (use this to call one from the other)
// toString() method
//- abs() method
//- 2 add methods
//- 2 mult methods
//- in main(), 6 complex number instances containing a mix of positive and negative values. 
//One of the complex should have only a real part and one should have only an imaginary part.

private double firstCoeff;
private double secondCoeff;

public Complex(double a){
    firstCoeff=a;
    secondCoeff=0.0;
}

public Complex(double a, double b){
    firstCoeff=a;
    secondCoeff=b;
}

public double abs(){
    return Math.sqrt((firstCoeff*firstCoeff)+(secondCoeff*secondCoeff));
}


}

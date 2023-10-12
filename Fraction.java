public class Fraction{
    private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
    public Fraction(){
        numerator = 3;
        denominator = 4;
    }


	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO  subtract()
    public Fraction subtract(Fraction other){
        int n = this.numerator*other.denominator - this.denominator*other.numerator;
        int d = this.denominator * other.getDenom();

		Fraction result = new Fraction(n,d);
		return result;

    }
	
	// TODO multiply()
	public Fraction multiply(Fraction other){

	int n = this.numerator*other.numerator;
	int d = this.denominator*other.denominator;
	Fraction result = new Fraction(n,d);
	return result;

	}

	
	// TODO toString()
    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }

	
	// TODO reciprocal()
	public Fraction reciprocal(Fraction other){
		int n = numerator;
		int d = denominator;
		Fraction result = new Fraction(d,n);
		return result;
	}
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);
        Fraction f4 = f1.subtract(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		//Add code to multiply f1 and f2 here
		Fraction f8 = f1.multiply(f2);
		System.out.println("3/4 * 4/5 = " + f8);
		
		//Add code to call reciprocal here
		Fraction f9 = f1.reciprocal(f1);
		System.out.println("The reciprocal of 3/4 is " + f9);
		
		// create 2 new fractions and add them here.
		Fraction f5 = new Fraction(1,9);
		Fraction f6 = new Fraction(5,6);
		Fraction f7 = f5.add(f6);
		System.out.println("1/9 + 5/6 = " + f7);
		

	}

}

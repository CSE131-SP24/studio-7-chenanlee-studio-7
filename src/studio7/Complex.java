package studio7;

public class Complex {

	private double a;
	private double b;
	public Complex (double a, double b) {
		this.a = a;
		this.b = b;
	}
		
	public Complex sum(Complex complex2) {
		double realSum = a + complex2.a;
		double imaginarySum = b + complex2.b;
		return new Complex(realSum, imaginarySum);
		
	}
	public Complex product(Complex complex2) {
		double realProduct = a * complex2.a - b * complex2.b;
		double imaginaryProduct = a * complex2.b + b * complex2.a;
		return new Complex(realProduct, imaginaryProduct);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex one = new Complex(2, 5);
		Complex two = new Complex(1, 3);
		System.out.println(one.sum(two));
		System.out.println(one.product(two));
	}
	@Override
	public String toString() {
		return a + " + " + b + "i";
	}

}

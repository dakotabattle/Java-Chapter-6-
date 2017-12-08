package Lesson6;

public class Exercise4 {
//"Multadd"
	public static void main(String[] args) {
		
		double log10 = multadd(2.0, 3.14 / 4, 0.0);
		double log20 = (multadd(4.0, 3.14 / 4, 0.0)) / 2;
		
		System.out.println(log10 + log20);
		
		System.out.println(expSum(2.0));
		
	}

	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}
	
	public static double expSum(double x) {
		return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
	}
	
}

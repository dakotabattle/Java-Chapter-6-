package Lesson6;

public class Exercise9 extends Exercise8 {

	public static void main(String[] args) {
		System.out.println(power(8.0, 1));
	}
	public static double power(double x, int n) {
		if(n == 0) {
			return x;
		}else {
			return x * power(x, n - 1);
		}
	}

}
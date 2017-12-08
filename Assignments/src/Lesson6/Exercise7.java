package Lesson6;

public class Exercise7 extends Exercise6 {

		public static void main(String[] args) {
			checkEven(101);
		}
		
		
		public static void checkEven(int a) {
			if(a % 2 == 0) {
				System.out.println("It needs to be odd!");
			}else {
				oddSum(a);
			}
		}
		
		
		public static void oddSum(int n) {
			if(n == 1) {
				System.out.println(n);
			}else {
				oddSum(n - 2);
				System.out.println(n);
			}
		}
	}


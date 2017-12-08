package Lesson6;

public class Exercise3 extends Exercise1 {

	public static void main(String[] args) {
		System.out.println(isTriangle(1, 2, 7));

	}
	
	private static boolean isTriangle(int a, int b, int c)
	{
		if ((a + b) * 2 < c || (a + c) * 2 < b || (b + c) * 2 < a)
		{
			return false;
		}
		return true;
	}
}

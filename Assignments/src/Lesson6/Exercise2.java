package Lesson6;

public class Exercise2 {
	
	public static void main(String[] args) {
		System.out.println(isDivisible(4, 2));
		
	}
	
	//Checks whether n is evenly divided by m / does this by ensuring there is a remainder of zero, and if there is a remainder it returns false
	private static boolean isDivisible(int n, int m)
	{
		if (n%m == 0)
		{
			return true;
		}
		return false;
	}
}

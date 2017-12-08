package Lesson6;

public class Exercise6 extends Exercise1 {

	public static void main(String[] args) {
		// prod() end up with m=1 and n=2
		// This sets recurse to 24, making result 24 after the assignment, then prints 24 as the final int.
		System.out.println(prod(1, 4));
	}

	public static int prod(int m, int n) {
	    //checks if m and n are equal
		if (m == n) {
			//If so, returns n
	        return n;
	    } else {
	    	//otherwise, invokes itself again, but this time with n - 1 as  the second parameter and follows this in a loop fashion
	    	// multiplies n by recurse after, and returns eventual result
	        int recurse = prod(m, n - 1);
	        int result = n * recurse;
	        //finally returns the end resulting integer
	        return result;
	    }
	}
}


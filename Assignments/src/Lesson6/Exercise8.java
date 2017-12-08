package Lesson6;

public class Exercise8 extends Exercise7 {

	public static void main(String[] args) {
		System.out.println(ack(0, 2));
	}
	public static int ack(int a, int b) {
		if(a == 0) {
			return b + 1;
		}else if(a > 0 && b == 0) {
			return ack(a - 1, 1);
		}else {
			return ack(a - 1, ack(a, b - 1));
		}
	}

}
package codingTest01;

import java.util.Scanner;

public class Divide {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		double divide;
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("a = " + a + "," + "b =" + b);
		divide = (double)a/b;
		
		System.out.println(divide);
	}
}
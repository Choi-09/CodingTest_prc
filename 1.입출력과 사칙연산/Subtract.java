package codingTest01;

import java.util.Scanner;

public class Subtract {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum;
		
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("a = " + a + "," + "b =" + b);
		sum = a+b;
		
		System.out.println(sum);
	}
}
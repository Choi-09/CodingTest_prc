package codingTest01;

import java.util.Scanner;

public class Multiply {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int multiply;
		
		a = sc.nextInt();
		b = sc.nextInt();
		multiply = a*b;
		
		System.out.println(multiply);
	}
}
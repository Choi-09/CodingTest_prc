package codingTest01;

import java.util.Scanner;

public class Add {
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int sum;
		
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a-b;
		
		System.out.println(sum);
	}
}
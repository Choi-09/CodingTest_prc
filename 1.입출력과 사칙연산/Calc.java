package codingTest01;
import java.util.Scanner;

public class Calc {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        int sum;
        int subtract;
        int multiply;
        int divide;
        double modulus;
        
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        subtract = a-b;
        multiply = a*b;
        divide = a/b;
        modulus = (double)a%b;
        
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulus);
    }
}

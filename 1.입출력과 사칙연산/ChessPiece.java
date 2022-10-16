package codingTest01;

import java.util.Scanner;

public class ChessPiece {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);
        
        int piece;
        int[] chessPiece = {1,1,2,2,2,8};
        int[] check = new int[6];            
        
        for(int i=0; i<chessPiece.length; i++) {   
        piece = sc.nextInt();
        if(piece<=0) {
        	check[i] = chessPiece[i] + piece;
        } else {
        	check[i] = chessPiece[i] - piece;
        }
        System.out.print(check[i]+" ");
        }
    }
}

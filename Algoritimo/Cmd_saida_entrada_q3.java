package Algoritimo;

import java.util.Scanner;

public class Cmd_saida_entrada_q3 {
	   public static void main(String [] args) {
		     Scanner scan = new Scanner(System.in);
		     System.out.println("Declare os valores inteiros de A B C e D!");
		     int A = scan.nextInt();
		     int B = scan.nextInt();
		     int C = scan.nextInt();
		     int D = scan.nextInt();
		     System.out.print("A diferença do produto AB e CD é igual a: "+(A*B-C*D)+".");   
		}
}

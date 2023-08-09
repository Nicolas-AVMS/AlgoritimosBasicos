package Algoritimo;

import java.util.Scanner;

public class Cmd_saida_entrada_q2 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Declare um número inteiro");
		 int num = scan.nextInt();
		 System.out.print("O quadrado de "+num+" é igual a "+(num*num)+".");
		}
}

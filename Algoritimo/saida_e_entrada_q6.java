package Algoritimo;

import java.util.Scanner;

public class saida_e_entrada_q6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Declare as 3 notas!");
		float n1 = scan.nextFloat();
		float n2 = scan.nextFloat();
		float n3 = scan.nextFloat();
		float m = (n1*2+n2*3+n3*5)/10;
		System.out.print("A media deste aluno é "+m+".");
	}
}

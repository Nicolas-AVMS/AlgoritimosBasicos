package Algoritimo;

import java.util.Scanner;

public class Questao_01_Vetor {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num[] = new int[29];
		for (int i = 0; i<=29; i++) {
			System.out.println("Declare um numero inteiro!");
			num[i] = scan.nextInt();
			System.out.println(num[i]);
		}
	}
}

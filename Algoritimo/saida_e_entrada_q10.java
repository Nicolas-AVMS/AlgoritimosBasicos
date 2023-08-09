package Algoritimo;

import java.util.Scanner;

public class saida_e_entrada_q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor do saque!");
		int saque = scan.nextInt();
		int n100 = (saque/100);
		int n50 = (saque%100)/50;
		int n20 = (((saque%100)%50)/20);
		int n10 = ((((saque%100)%50)%20)/10);
		int n5 = (((((saque%100)%50)%20)%10)/5);
		int n1 = (((((saque%100)%50)%20)%10)%5);
		System.out.println("Você receberá "+n100+" notas de 100, "+n50+" notas de 50, " +n20 + "notas de 20, "+n10+" notas de 10, "+n5+" notas de 5, " + n1 + "notas de 1.");
	}
}

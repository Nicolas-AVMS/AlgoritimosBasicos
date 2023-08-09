package Algoritimo;

import java.util.Scanner;

public class saida_e_entrada_q9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantos dias você tem?");
		int idade = scan.nextInt();
		int anos = idade/365;
		int meses = (idade%365)/30;
		int dias = 	(idade%365)%30;	
		System.out.print("Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias!");
	}
}

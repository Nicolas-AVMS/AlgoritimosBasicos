package Algoritimo;

import java.util.Scanner;

public class Entrada_e_saida {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Olá, Mundo!");
		System.out.println("Qual é o seu nome?");
		String nome = ler.next();
		System.out.print(nome);
	}

}

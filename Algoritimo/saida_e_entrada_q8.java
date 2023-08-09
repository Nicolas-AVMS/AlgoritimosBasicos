package Algoritimo;

import java.util.Scanner;

public class saida_e_entrada_q8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Quantos quilômetros você rodou com o carro e quantos litros o carro consumiu?");
		float km = scan.nextFloat();
		float litros = scan.nextFloat();
		System.out.println("O consumo do carro foi de "+km/litros+"km/L.");
	}
}

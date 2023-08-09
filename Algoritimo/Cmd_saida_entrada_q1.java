package Algoritimo;

import java.util.Scanner;

public class Cmd_saida_entrada_q1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual foi o valor da compra?");
		double compra = ler.nextDouble();
		System.out.println("Qual é a porcentagem do garçom?");
		double gorjeta = ler.nextDouble();
		double Total = (compra+gorjeta*compra/100);
		System.out.print("O valor total é R$"+Total+".");
	}
}

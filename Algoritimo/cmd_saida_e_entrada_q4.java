package Algoritimo;

import java.util.Scanner;

public class cmd_saida_e_entrada_q4 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner (System.in);
		    System.out.println("Qual é a quantidade de coelhos?");
		    int quant = scan.nextInt();
		    double custo = quant*0.70/18+10;
		    System.out.print("O custo para criar "+quant+" coelhos é de R$"+custo+".");
	}
}

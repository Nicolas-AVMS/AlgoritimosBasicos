package Algoritimo;

import java.util.Scanner;

public class saida_e_entrada_q5 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner (System.in);
		    System.out.println("Declare o valor da dívida, a taxa de juros e o tempo (dias) de dívida.");
		    double valor = scan.nextDouble();
		    double juros = scan.nextDouble();
		    int tempo = scan.nextInt();
		    double P = valor + (valor*juros/100*tempo);
		    System.out.print("O valor da dívida é R$"+P+"."); 
		    }
}

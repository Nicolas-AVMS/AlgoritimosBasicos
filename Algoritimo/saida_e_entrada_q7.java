package Algoritimo;

import java.util.Scanner;

public class saida_e_entrada_q7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Declare o numero do funcionario, as horas e os minutos trabalhados, e o valor da hora.");
		byte num = scan.nextByte();
		int horas = scan.nextInt();
		byte minutos = scan.nextByte();
		float valorh = scan.nextFloat();
		horas = horas*60+minutos;
		double salario = horas*(valorh/60);
		System.out.print("O salario do funcionario "+num+"é R$"+salario+".");
	}
}

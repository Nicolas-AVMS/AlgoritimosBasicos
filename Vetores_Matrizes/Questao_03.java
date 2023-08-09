package Vetores_Matrizes;
import java.util.Scanner;
public class Questao_03 {
	public static void main(String[] args) {
		Double notas[] = new Double[4];
		Scanner scan = new Scanner (System.in);
		Double media = 0.0;
		for (int i=0; i<notas.length; i++) {
			System.out.println("Digite a nota!");
			notas[i] = scan.nextDouble();
			media += notas[i];
		}
		media /= 4;
		for (int i=0; i<notas.length; i++) {
			System.out.println("as notas foram:"+ notas[i] +" | ");

		}
		System.out.println("e a média é igual a:"+media);
	}
}

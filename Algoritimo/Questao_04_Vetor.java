package Algoritimo;
import java.util.Scanner;

public class Questao_04_Vetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= 0;
		int nn=60;
		do {
			n = scan.nextInt();
			System.out.print(n/nn+":"+n%nn);
		}while(n!=-1);
	}
}

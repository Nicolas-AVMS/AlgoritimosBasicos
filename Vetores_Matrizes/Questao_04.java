package Vetores_Matrizes;
import java.util.Scanner;

public class Questao_04 {
	public static void main(String[] args) {
		int par[] = new int[20];
		int impar[] = new int [20];
		int n[] = new int [20];
		Scanner scan = new Scanner (System.in);
		int indp =0;
		int indi =0;
		for(int i=0;i<n.length;i++) {
			System.out.println("Digite um número!");
			n[i] = scan.nextInt();
		}
		for (int i=0;i<n.length;i++) {
			if(n[i]%2==0) {
				par[i]=n[i];
				indp++;
			} else {
				i--;
			}
		}
		for (int i=0;i<n.length;i++) {
			if(n[i]%2!=0) {
				impar[i]=n[i];
				indp++;
			} else {
				i--;
			}
		}
		System.out.print("Os números pares são:");
		for(int i=0; i<indp;i++) {
			System.out.print(par[i]+" | ");
		}
		System.out.println();
		System.out.print("Os números ímpares são:");
		for(int i=0; i<indi;i++) {
			System.out.print(impar[i]+" | ");
		}
	}
}

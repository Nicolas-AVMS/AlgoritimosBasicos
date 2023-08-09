package Algoritimo;

import java.util.Scanner;

public class Questao_01 {
	
	public static void main(String[] args) {
		int vetor[] = new int[20];
		Scanner scan = new Scanner(System.in);
		int num;
		int i = 0;
		int k = 0;
		int prox;
		do {
			System.out.println("Digite um número inteiro! Para sair digite 0");
			num = scan.nextInt();
			vetor[i] = num;
			i++;
		}while(num!=0 & i < 20);
		int menor = vetor[0];
		for(int j=1;j<i;j++) {
			if(menor>vetor[j]) {
				menor=vetor[j];
				for(k=j++;k<i--;k++) {
					vetor[k]=menor;
					if(k++ == 20) {
						k=-1;
					}
					prox = k++;
					vetor[k++]=vetor[k];
				}
			}
		}
		for(int l = 0; l<20;l++) {
			System.out.println(" |"+vetor[l]+"| ");
		}
	}
}


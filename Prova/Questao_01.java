package Prova;
//Discente Nícolas Andrew Matrícula: 2022002257

import java.util.Scanner;

public class Questao_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Scanner input = new Scanner (System.in);
		byte menu;
		byte opcao;
		int A[] = new int[50];
		int B[] = new int[50];
		int i;
		int j;
		int maior, maior2, maior3, maior4;
		byte qtdA=0;
		byte qtdB=0;
		byte cont=0;
		byte cont2=0;
		byte qtdM=0;
		do {
			System.out.println("___________________________________________________________");
			System.out.println("===========================MENU============================");
			System.out.println("___________________________________________________________");
			System.out.println("1. Inserir Vetores \n"
						  	  +"2. Listar Vetores \n"
						  	  +"3. Gerar dois maiores numeros \n"
						  	  +"4. Gerar Vetor Repetido \n"
						  	  +"5. Gerar Vetor Diferença \n"
						  	  +"6. Sair \n"
						  	  +"DIGITE A OPÇÃO DESEJADA!");
			menu = scan.nextByte();
			switch(menu) {
				case 1:
					System.out.println("Quantos valores deseja digitar para o Vetor A?");
					qtdA = scan.nextByte();
					if(qtdA<1|qtdA>50) {
						do {
							System.out.println("Valor inválido! Digite um número de 1 até 50.");
							System.out.println("Quantos valores deseja digitar para o Vetor A?");
							qtdA = scan.nextByte();
						}while (qtdA<1|qtdA>50);
					}
					
					System.out.println("Digite os valores do Vetor A!");
					for(i=0; i<qtdA;i++) {
						A[i]=input.nextInt();
					}
					System.out.println("Quantos valores deseja digitar para o Vetor B?");
					qtdB = scan.nextByte();
					if(qtdB<1|qtdB>50) {
						do {
							System.out.println("Valor inválido! Digite um número de 1 até 50.");
							System.out.println("Quantos valores deseja digitar para o Vetor B?");
							qtdB = scan.nextByte();
						}while (qtdB<1|qtdB>50);
					}
					
					System.out.println("Digite os valores do conjunto B!");
					for(i=0; i<qtdB;i++) {
						B[i]=input.nextInt();
					}
					if(qtdA>qtdB) {
						qtdM=qtdA;
					} else {
						qtdM=qtdB;
					}
					System.out.println("Valores preenchidos!");
					break;
				case 2:
					System.out.print("A:{");
					for(i=0;i<qtdA;i++) {
						System.out.print(A[i]+", ");
					}
					System.out.println("};");
					System.out.print("B:{");
					for(i=0;i<qtdB;i++) {
						System.out.print(B[i]+", ");
					}
					System.out.println("};");
					break;
				case 3:
					//Mostra os dois maiores numeros de cada vetor
					//Vetor A
					maior = A[0];
					for(j=1;j<qtdA;j++) {
						if(maior<A[j]) {
							maior = A[j];
						} 
					}
					maior2 = A[0];
					for(j=1;j<qtdA;j++) {
						if(maior2<A[j] & A[j] != maior) {
							maior2 = A[j];
						} 
					}
					System.out.println("Os maiores números do Vetor A são: "+maior+" e "+maior2+".");
					//Vetor B
					maior3 = B[0];
					for(j=1;j<qtdB;j++) {
						if(maior3<B[j]) {
							maior3 = B[j];
						} 
					}
					maior4 = B[0];
					for(j=1;j<qtdB;j++) {
						if(maior4<B[j] & B[j] != maior3) {
							maior4 = B[j];
						} 
					}
					System.out.println("Os maiores números do Vetor B são: "+maior3+" e "+maior4+".");
					break;
				case 4:
					//Mostra os valores que se repetem nos dois vetores
					int R[] = new int[qtdA+qtdB];
					//Vetor A
					for(i=0; i<qtdA;i++) {
						for(j=0; j<qtdB;j++) {
							if(A[i]==B[j]) {
								for(int k = 0; k<qtdA+qtdB;k++){
									if(A[i]!=R[k]){
										cont2++;
									}
								}
								if(cont2==qtdA+qtdB){
									R[cont] = B[j];
									cont++;
								}
								cont2=0;
							}
						}
					}
						System.out.println("Os numeros que se repetem nos Vetores A e B são: ");
						for(i=0;i<cont;i++) {
							System.out.print(" |"+R[i]+"| ");
					}
					System.out.println();
					cont=0;
					break;	
				case 5:
					//Mostra a diferença A-B ou B-A.
					int difAB[]=new int [qtdA];
					int difBA[]=new int [qtdB];
					System.out.println("Para obter a diferença A - B digite 1 e para obter a deiferença B - A digite 2.");
					opcao = scan.nextByte();
					switch(opcao) {
					case 1:
						System.out.print("A diferença é AB:{");
							for(j=0;j<qtdM;j++){
								for(i=0;i<qtdB;i++) {
									if(A[cont2]!=B[i]) {
										cont++;
									}
								}
								if(cont==qtdB && cont2<qtdA) {
									difAB[j]=A[cont2];
									System.out.print(" |"+difAB[j]+"| ");
								} 
								if(cont2!=qtdB){
									j--;
								}
								cont=0;
								cont2++;
								if(cont2>49){
									cont2--;
									j=qtdM;
								}
							}	
						System.out.println("}.");
						cont2=0;
						break;
					case 2:
						System.out.print("A diferença é BA:{");
						for(j=0;j<qtdM;j++){
							for(i=0;i<qtdA;i++) {
								if(B[cont2]!=A[i]) {
									cont++;
								}
							}
							if(cont==qtdA && cont2<qtdB) {
								difBA[j]=B[cont2];
								System.out.print(" |"+difBA[j]+"| ");
							}
							if(cont!=qtdA){
								j--;
							}
							cont=0;
							cont2++;
							if(cont2>49){
								cont2--;
								j=qtdM;
							}
						}	
						System.out.println("}.");
						cont2=0;
						break;
					}
					break;
			}
		} while (menu != 6);
	}
}	
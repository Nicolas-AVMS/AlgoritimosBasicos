package Algoritimo;

import java.util.Scanner;

public class vetor_Exercicio_sala_de_aula {

	/**
	 * @param args
	 */
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
		int maior;
		byte qtdA=0;
		byte qtdB=0;
		byte cont=0;
		byte cont2=0;
		byte ind = 0;
		byte qtdM=0;
		do {
			System.out.println("___________________________________________________________");
			System.out.println("===========================MENU============================");
			System.out.println("___________________________________________________________");
			System.out.println("1. Preencher vetores \n"
						  	  +"2. Lista Vetores \n"
						  	  +"3. Gerar vetor multiplicação \n"
						  	  +"4. Gerar Vetor Iterseção \n"
						  	  +"5. Gerar Vetor União \n"
						  	  +"6. Gerar Vetor Diferença \n"
						  	  +"7. Quantidade de números primos \n"
						  	  +"8. Maior Número \n"
						  	  +"9. Sair \n"
						  	  +"DIGITE A OPÇÃO DESEJADA!");
			menu = scan.nextByte();
			switch(menu) {
				case 1:
					System.out.println("Quantos valores deseja digitar para o Conjunto A?");
					qtdA = scan.nextByte();
					if(qtdA<1|qtdA>50) {
						do {
							System.out.println("Valor inválido! Digite um número de 1 até 50.");
							System.out.println("Quantos valores deseja digitar para o Conjunto A?");
							qtdA = scan.nextByte();
						}while (qtdA<1|qtdA>50);
					}
					
					System.out.println("Digite os valores do conjunto A!");
					for(i=0; i<qtdA;i++) {
						A[i]=input.nextInt();
					}
					System.out.println("Quantos valores deseja digitar para o Conjunto B?");
					qtdB = scan.nextByte();
					if(qtdB<1|qtdB>50) {
						do {
							System.out.println("Valor inválido! Digite um número de 1 até 50.");
							System.out.println("Quantos valores deseja digitar para o Conjunto B?");
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
					/*A partir daqui há um erro no programa, pois  se o caso 1 não for iniciado, o caso 2 
					 * finaliza sem rodar os comandos e assim por diante.*/
					System.out.print("A:{");
					for(i=0;i<qtdA;i++) {
						System.out.print(A[i]+", ");
					}
					System.out.println(".};");
					System.out.print("B:{");
					for(i=0;i<qtdB;i++) {
						System.out.print(B[i]+", ");
					}
					System.out.println(".};");
					break;
				case 3:
					if(qtdA==qtdB||qtdA==0) {
						int prod[]=new int [qtdA];
						for(i=0;i<qtdA;i++) {
							prod[i]=A[i]*B[i];
							System.out.println("O produto dos elementos A"+i+" ("+A[i]+")* B"+i+" ("+B[i]+"), é igual a "+prod[i]+".");
						}	
					}else {
						System.out.println("Não é possível fazer a multiplicação porquê os dois conjuntos não têm a mesma quantidade de elementos!");
					}
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
				System.out.println("A interseção dos Vetores A e B são: ");
				for(i=0;i<cont;i++) {
					System.out.print(" |"+R[i]+"| ");
				}
				System.out.println();
				cont=0;
					break;	
				case 5:
					//União: O Vetor Uni receberá o Vetor A mais os valores do Vetor B!
					int U[] = new int [qtdA+qtdB];
					System.out.print("A união é AuB:{");
					for(i=0;i<qtdA;i++) {
						U[i]=A[i];
						System.out.print(" |"+U[i]+"| ");
						cont++;
					}
 					for(i=cont;i<qtdA+qtdB;i++) {
						for(j=0;j<qtdA;j++){
							if(B[cont2]!=A[j]){
								ind++;
							}
						}
						if(ind==qtdA){
							U[i]=B[cont2];
							System.out.print(" |"+U[i]+"| ");	
						}
						cont2++;
					}
 					System.out.println("}.");
 					cont = 0;
 					cont2 = 0;
					break;
				case 6:
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
				case 7:
					System.out.println("Para analisar o vetor A digite 1 e para analisar o vetor B digite 2?");
					opcao = scan.nextByte();
					switch (opcao) {
					case 1:
						for(j=0;j<qtdA;j++) {
							for(i=1;i<=A[j];i++) {
								if(A[j]%i==0) {
									cont++;
								}
							}
							if(cont==2) {
								System.out.println(A[j]);
								System.out.println();
								cont2++;
							}
							cont=0;
						}
						if(cont2==0)
							System.out.println("Não há números primos");
						else
							System.out.println("Existem "+cont2+" números primos no Vetor escolhido!");
						cont2=0;
						break;
					case 2:
						for(j=0;j<qtdB;j++) {
							for(i=1;i<=B[j];i++) {
								if(B[j]%i==0) {
									cont++;
								}
							}
							if(cont==2) {
								System.out.println(B[j]);
								System.out.println();
								cont2++;
							}
							cont=0;
						}
						if(cont2==0)
							System.out.println("Não há números primos");
						else
							System.out.println("Existem "+cont2+" números primos no Vetor escolhido!");
						cont2=0;
						break;
					}
					break;	
				case 8:
					System.out.println("Para analisar o vetor A digite 1 e para analisar o vetor B digite 2?");
					opcao = scan.nextByte();
					if(opcao!=1 & opcao!=2) {
						System.out.println("Opção inválida!");
						while(opcao!=1 & opcao!=2) {
							System.out.println("Para analisar o vetor A digite 1 e para analisar o vetor B digite 2?");
							opcao = scan.nextByte();
						}
					}
					switch (opcao) {
					case 1:
						maior = A[0];
							for(j=1;j<qtdA;j++) {
								if(maior<A[j]) {
									maior = A[j];
								} 
							}
							System.out.println(maior);
						break;
					case 2:
						maior = B[0];
						for(j=1;j<qtdB;j++) {
							if(maior<B[j]) {
								maior = B[j];
							} 
						}
						System.out.println(maior);
						
						break;
					}
					
					break;
			}
		} while (menu != 9);
	}
}	
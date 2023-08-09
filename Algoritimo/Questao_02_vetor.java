package Algoritimo;

import java.util.Scanner;

public class Questao_02_vetor {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Scanner scan=new Scanner(System.in);
		System.out.println("Declare a quantidade de alunos até 50!");
		int qtd=scan.nextInt();
		if(qtd<1|qtd>50){
			do {
			System.out.println("Quantidade inválida! Digite um valor de 1 a 50");
			qtd=scan.nextInt();
			}while(qtd<1|qtd>50);
		}else{
			int i;
			String aluno[]=new String[qtd];
			for(i=0; i<qtd; i++){
				System.out.println("declare o nome do aluno " + i + ".");
				aluno[i]=input.nextLine();
			}
			qtd--;
			System.out.println("A ordem inversa é:");
			for(i=qtd; i>=0; i--) {
				System.out.println(aluno[i]);
				
			}
		}
	}
	/*public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Declare a quantidade de alunos até 50!");
		byte qtd=scan.nextByte();
		if(qtd<0|qtd>50){
			System.out.println("Quantidade inválida!");
		}else{
			byte aluno[]=new byte[qtd];
			for(byte i=0; i<qtd; i++) {
				System.out.println("declare o nome do aluno " + i + ".");
				aluno[i] = scan.nextByte();
			}
			qtd--;
			System.out.println("A ordem inversa é:");
			for(byte j = qtd; j>=0; j--) {
				System.out.println(aluno[j]);
				
			}
		}*/
		/*Scanner input = new Scanner (System.in);
		int N = scan.nextInt();
		String nome[] = new String[N];
		for(int i=0; i<2; i++) {
		System.out.println("Declare um nome");
		nome[i]=input.nextLine();
		}*/
		
}

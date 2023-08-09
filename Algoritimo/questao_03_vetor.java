package Algoritimo;

import java.util.Scanner;

public class questao_03_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner scan=new Scanner (System.in);
		Scanner input=new Scanner (System.in);
		int v1[]=new int[50];
		int v2[]=new int[50];
		System.out.println("Quantos valores deseja digitar?");
		int N = scan.nextInt();
		System.out.println("declare os valores inteiros do primeiro vetor");
		for(i=0;i<N;i++) {
			v1[i]=input.nextInt();
		}
		System.out.println("Quantos valores deseja digitar para o segundo vetor?");
		int n = scan.nextInt();
		System.out.println("declare os valores inteiros do segundo vetor");
		for(i=0;i<n;i++) {
			v2[i]=input.nextInt();
		}
		if(N==n) {
			int s[]=new int[n--];
			for(i=0;i<=n;i++) {
				s[i]=v1[i]+v2[i];
			}
			for(i=0;i<=n;i++) {
				System.out.println("A soma dos vetores v1 e v2 na posição "+i+" é igual a "+s[i]+".");
			}
		}else {
			System.out.println("Informação recebida! Programa finalizado!");
		}
	}
}
package Vetores_Matrizes;

import java.util.Scanner;
public class Questão_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		Scanner scan = new Scanner (System.in);
		for(int i = 0; i < num.length;i++) {
			num[i]=scan.nextInt();
			System.out.println(num[i]+"");
		}
	}
}

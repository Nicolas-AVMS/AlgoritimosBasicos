/**
 * 
 */
package Algoritimo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author brisanet
 *
 */
public class teste_string_vetor {

	/**
	 * 
	 */
	public teste_string_vetor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String nome[] = new String[4];
		for(int i = 0; i<4; i++) {
			System.out.println("Qual é o nome do aluno?");
			nome[i] = scan.nextLine();
		}
		for(i = 0; i<4; i++) {
			System.out.println(nome[i]);
			
		}
		
		/*System.out.println(nome[1]);
		System.out.println(nome[2]);
		System.out.println(nome[3]);
		System.out.println(nome[0]);
	}
}
	*/	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int N=0;
        System.out.println("digite um numero");
        N=input.nextInt();
        String nome[]=new String[N];
        for (int i=0;i<N;i++) {
            System.out.println("digite um nome");
            nome[i]=input.next();
        }
        System.out.println(" ");
        for (int i=N-1;i>=0;i--) {
        System.out.println(nome[i]);
        }
        

    }


}	



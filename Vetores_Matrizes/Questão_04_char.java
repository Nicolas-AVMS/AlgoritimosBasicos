package Vetores_Matrizes;
import java.util.Scanner;

public class Questão_04_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		char c[] = new char []{'q','w','r','t','y','p','s','d','f','g','h','j','k','l','ç','z','x','c','v','b','n','m','Q','W','R','T','Y','P','S','D','F','G','H','J','K','L','Ç',
				'Z','X','C','V','B','N','M'};
		char d[] = new char[10];
		Scanner scan = new Scanner (System.in);
		for(int i = 0; i < d.length; i++) {
			System.out.println("Digite uma letra!");
			d[i] = scan.next().charAt(0);
		}
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < c.length; j++) {
				if(d[i]==c[j]) {
					System.out.print(d[i]+ ", ");
					cont++;
				}
			}
		}
		System.out.print("São "+cont+" consoantes.");
	}
}

package Vetores_Matrizes;
import java.util.Scanner;
public class Questao_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Double v[] = new Double[10];
		for(int i = 0; i < v.length; i++) {
			v[i]=scan.nextDouble();
		}
		for (int i = 9; i >= 0;i--) {
			System.out.println(v[i]);
		}
	}

}

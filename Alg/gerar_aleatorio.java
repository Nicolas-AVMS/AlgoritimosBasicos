package Alg;

import java.util.Random;

public class gerar_aleatorio {
	public static void main (String[] args) {
		Random aleatorio = new Random();
		for(int j = 0; j<10; j++) {
			for(int i = 0;i < 6;i++) {
				int sorteio = aleatorio.nextInt(60);
				System.out.print(" | "+sorteio+" | ");
			}
			System.out.println();
		}	
	}
}

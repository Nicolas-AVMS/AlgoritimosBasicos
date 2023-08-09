package Algoritimo;

import java.util.Scanner;

public class Matrizes {
	public static void main (String[] args){
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Declare o tamanho da matriz 2D digitndo 2 numeros inteiros!");
	       int n = scan.nextInt();
	       int m = scan.nextInt();
	       int matriz[][] = new int[n][m];
	       for (int i=0; i<n; i++) {
	           for (int j = 0; j < m; j++) {
	               System.out.println("Declare o valor da matriz " + i + " x " + j + ".");
	               matriz[i][j]= scan.nextInt();
	           }
	       }
	       if (n==m){
	           for (int i=0; i<n; i++) {
	               for (int j = 0; j < m; j++) {
	                   if (i == j) {
	                       System.out.print(matriz[i][j] + " ");
	                   }
	               }
	           }
	       }else{
	           for (int i=0; i<n; i++){
	               for (int j=0; j<m; j++){
	                   System.out.print(matriz[i][j]+ " " );
	               }
	               System.out.println();
	           }
	       }
	       int memoria[] = new int [m];
	       // Armazena a primeira linha da matriz na memoria
	       int i = 0;
           for (int j=0; j<m; j++){
               memoria[j] = matriz[i][j];  
               }
           for (int k=n--; k>-1; k--){
               for (int l=0; l<m; l++){
                     matriz[k][l] = memoria[l];
               }
           }
           
	       for(i = 0; i<m; i++) {
	    	   matriz[n][m--] = memoria[i];
	       }
	       for (i=0; i<n; i++){
               for (int j=0; j<m; j++){
                   System.out.print(matriz[i][j]+ " " );
               }
               System.out.println();
           }
	}
}
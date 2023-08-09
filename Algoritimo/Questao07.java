package Algoritimo;
import java.util.Random;
import java.lang.Math;
public class Questao07 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int A[] = new int[20];
        for(int i = 0; i < A.length; i++){
           A[i] = sorteio.nextInt(100);
           // teste: A[i] = i*3;
        }
        int S = 0;
        int indice = 19;
        for(int i = 0; i < 10; i++){
            S+= Math.pow((A[i]-A[indice]),2);
            //S+= (A[i]-A[indice])*(A[i]-A[indice]);
            indice--;
        }
        System.out.println(S);
    }
}
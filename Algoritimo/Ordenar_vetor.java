package Algoritimo;
import java.util.Scanner;
public class Ordenar_vetor {
    /*Faça um programa em Java para ler um conjunto de valores inteiros, com no máximo 20 
elementos, onde o FLAG é o valor 0 (zero) e em seguida imprima esses valores em ordem 
crescente.
Dica : Armazene cada número lido num vetor e garanta que cada novo número seja inserido de 
forma a manter o vetor ordenado */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] Vetor = new int[20];
        int num = 0;
        int index = 0;
        int count = 0;
        int count2 = 1;
        boolean think = false;
        System.out.println("Digite um número inteiro!");
        num = scan.nextInt();
        Vetor [0] = num;
        while(num!=0&&count<20){
            System.out.println("Digite um número inteiro! \n"
            +"Ou digite 0 para sair!");
            num = scan.nextInt();
            if(num==0){
                break;
            } else{
                count++;
                count2++;
                think = false;
                    for(int i = 0; i<Vetor.length;){
                        if(num<Vetor[i]){
                            think = true;
                            index = 18;
                            for(int j = 19; j>i; j-- ){
                                Vetor[j]=Vetor[index];
                                index--;
                            }
                            Vetor[i] = num;
                        }
                        break;
                    }
            }
            if(think==false){
                Vetor[count2]=num;
            }
        }      
        for(int i=0;i<=count;i++){
            System.out.println(Vetor[i]);
        }
    scan.close();
    }
}
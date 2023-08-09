package Algoritimo;
import java.util.Scanner;

public class teste_prof {







		public static void main(String[] args) {

			Scanner ler = new Scanner(System.in);

	        int v1[] = new int[50];

	        int v2[] = new int[50];

	        int vp[] = new int[100];

	        int va[] = new int[100];

	        int qtd1 = 0;

	        int qtd2 = 0;

	        int menor1, menor2, indicep, cont, indicea, num;

	        boolean achou;

	        byte operacao;

	        do {

	            System.out.println("###########################");

	            System.out.println("MENU VETOR");

	            System.out.println("###########################");

	            System.out.print("MENU \n"

	                    + "1 - Inserir dois Vetores: \n"

	                    + "2 - Listar Vetores \n"

	                    + "3 - Gerar dois Menores Números \n"

	                    + "4 - Gerar Primos \n"

	                    + "5 - Gerar Vetor Alternado \n"

	                    + "6 - Sair \n"

	                    

	                    + "Digite a opção desejada: ");

	            operacao = ler.nextByte();

	            switch (operacao) {

	                case 1:

	                    do {

	                        System.out.print("Entre com o tamanho do primeiro vetor (<50): ");

	                        qtd1 = ler.nextInt();

	                    } while (qtd1 <= 0 | qtd1 > 50);

	                    for (int i = 0; i < qtd1; i++) {

	                        do{

	                           System.out.print("Entre com o " + i + " elemento do vetor1: ");

	                           num = ler.nextInt();

	                           achou = false;

	                           for(int j = 0; j < i;j++){

	                                if(v1[j] == num){

	                                    achou = true;

	                                    break;

	                                }

	                           }

	                           if(!achou){

	                               v1[i] = num;

	                           }

	                        }while(achou);

	                    }

	                    do {

	                        System.out.print("Entre com o tamanho do segundo vetor (<50): ");

	                        qtd2 = ler.nextInt();

	                    } while (qtd2 <= 0 | qtd2 > 50);

	                    for (int i = 0; i < qtd2; i++) {

	                        do{

	                           System.out.print("Entre com o " + i + " elemento do vetor2: ");

	                           num = ler.nextInt();

	                           achou = false;

	                           for(int j = 0; j < i;j++){

	                                if(v2[j] == num){

	                                    achou = true;

	                                    break;

	                                }

	                           }

	                           if(!achou){

	                               v2[i] = num;

	                           }

	                        }while(achou);

	                    }

	                    

	                    System.out.println("Vetores Preenchidos!!");

	                    break;

	                case 2:

	                    for (int i = 0; i < qtd1; i++) 

	                        System.out.print(v1[i] + " | ");

	                 

	                    System.out.print("\n");

	                    

	                    for (int i = 0; i < qtd2; i++) 

	                        System.out.print(v2[i] + " | ");

	                    

	                    System.out.print("\n");

	                    break; 

	                case 3:

	                    if(v1[0] < v1[1]){

	                        menor1 = v1[0];

	                        menor2 = v1[1];

	                    }else{

	                        menor1 = v1[1];

	                        menor2 = v1[0];

	                    }

	                    for (int i = 2; i < qtd1; i++) {

	                        if (v1[i] < menor1) {

	                            menor2 = menor1;

	                            menor1 = v1[i];

	                        }else{

	                            if(v1[i] < menor2)

	                                menor2 = v1[i];

	                        }

	                    }

	                    for (int i = 0; i < qtd2; i++) {

	                        if (v2[i] < menor1) {

	                            menor2 = menor1;

	                            menor1 = v2[i];

	                        }else{

	                            if(v2[i] < menor2)

	                                menor2 = v2[i];

	                        }

	                    }

	                    System.out.println("Os dois menores números são:  " + menor1 + " e " + menor2);

	                    break;

	                case 4:

	                    indicep = 0;

	                    //Verificando os primos inicialmente no vetor1

	                    for (int i = 0; i < qtd1; i++) {

	                        cont = 0;

	                        for (int j = 1; j <= v1[i]; j++) {

	                            if (v1[i] % j == 0) {

	                                cont++;

	                            }

	                        } 

	                        if (cont == 2) {

	                            //Verificando se não existe o numero primo dentro do vetor de primos

	                            achou = false;

	                            for(int l = 0; l < indicep;l++){

	                                if(vp[l] == v1[i]){

	                                    achou = true;

	                                    break;

	                                }

	                            }

	                            //Se a variavel 'achou' for verdadiero é porque já existe um primo dentro do vetor

	                            if(!achou){ 

	                                vp[indicep] = v1[i];

	                                indicep++;

	                            }

	                        }

	                    }

	                    //verificando agora se existe primo no vetor 2. Utiliza a mesma logica do primeiro

	                    for (int i = 0; i < qtd2; i++) {

	                        cont = 0;

	                        for (int j = 1; j <= v2[i]; j++) {

	                            if (v2[i] % j == 0) {

	                                cont++;

	                            }

	                        } 

	                        if (cont == 2) {

	                            //Verificando se não existe o numero primo dentro do vetor de primos

	                            achou = false;

	                            for(int l = 0; l < indicep;l++){

	                                if(vp[l] == v2[i]){

	                                    achou = true;

	                                    break;

	                                }

	                            }

	                            //Se a variavel 'achou' for verdadiero é porque já existe um primo dentro do vetor

	                            if(!achou){ 

	                                vp[indicep] = v2[i];

	                                indicep++;

	                            }

	                        }

	                    }

	                    System.out.print("\n");

	                    System.out.print("Vetor primos: ");

	                    for (int i = 0; i < indicep; i++) 

	                        System.out.print(vp[i] + " | ");

	                    

	                    System.out.print("\n");

	                    break;

	                case 5:

	                    indicea = 0;

	                    if(qtd1 > qtd2){

	                        for (int i = 0; i < qtd1; i++) {

	                            if(i < qtd2){

	                               va[indicea] = v1[i];

	                               va[indicea+1] = v2[i];

	                               indicea = indicea + 2;

	                            }else{

	                               va[indicea] = v1[i]; 

	                               indicea++;

	                            }

	                        }

	                    }else{

	                        for (int i = 0; i < qtd2; i++) {

	                            if(i < qtd1){

	                               va[indicea] = v1[i];

	                               va[indicea+1] = v2[i];

	                               indicea = indicea + 2;

	                            }else{

	                               va[indicea] = v2[i]; 

	                               indicea++;

	                            }

	                        }

	                    }

	                    System.out.print("\n");

	                    System.out.print("Vetor alternado: ");

	                    for (int i = 0; i < indicea; i++) 

	                        System.out.print(va[i] + " | ");

	                    

	                    System.out.print("\n");

	                    break;

	                    

	           

	            }

	            

	        } while (operacao != 6);




		}

	

}

import java.util.Scanner;

/*
Uma loja oferece para os clientes um determinado desconto de
acordo com o valor da compra efetuada. O desconto é de 20%,
se o valor da compra for maior ou igual a R$250,00 e de 15%,
se for menor. Construa um programa que, para um grupo de dez
clientes, mostre nome, valor da compra, desconto e valor a
pagar de cada cliente. Determine também o quanto a loja
arrecadou com esses clientes.
 */
public class AppSlide1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double desconto = 0;
        double soma = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Nome do cliente: ");
            String nome = entrada.next();
            System.out.println("Valor da compra: R$ ");
            double valorCompra = entrada.nextDouble();

            if (valorCompra >= 250){
                desconto = valorCompra * 0.2;
            } else {
                desconto = valorCompra * 0.15;
            }

            //soma = soma + valorCompra;
            double compraDesconto = valorCompra - desconto;
            soma += compraDesconto;

            System.out.println("Cliente " + (i+1) +": " + nome);
            System.out.println("Valor da Compra: R$ " + valorCompra);
            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Total a pagar: R$ " + compraDesconto);
        }

        System.out.println("Valor arrecadado pela loja: R$ " + soma);
    }
}

import java.util.Scanner;

public class AppProva1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tipo de combustível (1- Álcool / 2-Gasolina): ");
        int tipoCombustivel = entrada.nextInt();

        System.out.println("Quantidade em litros: ");
        double qntLitros = entrada.nextDouble();

        System.out.println("Valor do litro do combustível: ");
        double valorCombustivel = entrada.nextDouble();

        double valorTotal = qntLitros * valorCombustivel;

        double desconto = 0;
        /* para alcool
        Até 20 litros: desconto de 3% por litro
        Acima de 20 litros: Desconto de 5% por litro.
         */

        /* para gasolina
        Até 20 litros: desconto de 4% por litro
        Acima de 20 litros, desconto de 6% por litro

         */
        if (tipoCombustivel == 1){
            if (qntLitros <= 20){
                desconto = valorTotal * 0.03;
            } else{
                desconto = valorTotal * 0.05;
            }
        } else if (tipoCombustivel == 2){
            if (qntLitros <=20){
                desconto = valorTotal * 0.04;
            } else{
                desconto = valorTotal * 0.06;
            }
        }

        valorTotal = valorTotal - desconto;

        System.out.println("Valor do combustível: R$" + valorCombustivel);
        System.out.println("Quantidade de litros: " + qntLitros);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total a pagar: R$ " + valorTotal);


    }
}

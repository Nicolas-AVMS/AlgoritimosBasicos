import java.util.Scanner;

public class AppProva2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de maçãs: kg ");
        double maca = entrada.nextDouble();

        System.out.println("Quantidade de morangos: kg ");
        double morango = entrada.nextDouble();

        double valorMaca = 0;
        double valorMorango = 0;

        if (maca <= 5 ){
            valorMaca = maca * 6;
        } else {
            valorMaca = maca * 4;
        }

        if (morango <=5){
            valorMorango = morango * 8;
        }else{
            valorMorango = morango * 6;
        }

        double valorTotal = valorMaca + valorMorango;

        System.out.println("Maçãs: R$ " + valorMaca);
        System.out.println("Morangos: R$ " + valorMorango);
        System.out.println("Valor Total: R$ " + valorTotal);
    }
}

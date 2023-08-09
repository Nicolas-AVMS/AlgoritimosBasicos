package Alg;

public class fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int fib = n1+n2;
        System.out.print(n1+" "+n2);
        for(int i=0; i<36;i++){
            System.out.print(" "+fib);
            n1 = n2;
            n2 = fib;
            fib = n1+n2;
        }
    }
    
}
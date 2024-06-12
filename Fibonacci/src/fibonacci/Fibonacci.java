
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor inicial de la sucesión de Fibonacci: ");
        int a = teclado.nextInt();

        System.out.println("Ingrese el valor final de la sucesión de Fibonacci: ");
        int b = teclado.nextInt();

        System.out.println("La sucesión de Fibonacci desde " + a + " hasta " + b + " es:");
        int fib1 = 0;
        int fib2 = 1;

        while (fib1 <= b) {
            if (fib1 >= a) {
                System.out.print(fib1 + " ");
            }
            int nextFib = fib1 + fib2;
            fib1 = fib2;
            fib2 = nextFib;
        }
        
        
    }
    
}

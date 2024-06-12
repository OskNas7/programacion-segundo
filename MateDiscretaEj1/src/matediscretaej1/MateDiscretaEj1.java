
package matediscretaej1;

import java.util.Scanner;


public class MateDiscretaEj1 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introducir un numero binario de 16 dígitos:");
        String numBinario = teclado.nextLine();

        // Verificar que la cadena tenga 16 dígitos y sea binaria
        if (numBinario.length() == 16 && numBinario.matches("[01]+")) {
            
            // Convertir el binario a decimal
            int decimal = Integer.parseInt(numBinario, 2);

            // Convertir el decimal a octal y hexadecimal
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            // Imprimir los resultados
            System.out.println("Número binario: " + numBinario);
            System.out.println("Decimal: " + decimal);
            System.out.println("Octal: " + octal);
            System.out.println("Hexadecimal: " + hexadecimal);
            
            
        } else {
            System.out.println("Por favor, introducir un número binario válido de 16 dígitos.");
        }

        
    }
    
}

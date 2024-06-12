
package matediscretaej2;

import java.util.Scanner;


public class MateDiscretaEj2 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Recursivo rec = new Recursivo();
        
        int a;
        int n;
        int d;
        int r;
        
        System.out.println("Ingerese los terminos de la sucecion Aritmetica: ");
        a = teclado.nextInt();
        n = teclado.nextInt();
        d = teclado.nextInt();
        
        System.out.println(rec.recursivoAritmetica(n, a, d));
        
        System.out.println("Ingerese los terminos de la sucecion Geometrica: ");
        r = teclado.nextInt();
        
        System.out.println(rec.recursivoGeometrica(n, a, r));
        
        
    }
    
}

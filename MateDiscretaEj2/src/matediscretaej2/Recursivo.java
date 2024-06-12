
package matediscretaej2;


public class Recursivo {
    
    public int recursivoAritmetica(int n, int a, int d){
        int an = a + (n-1)*d;
        if(n != 0){
            System.out.println(an);
            an = recursivoAritmetica(n-1, a, d);
        }
        return an;
        
    }
    
    public double recursivoGeometrica(int n, int a, int r){
        double an = a * Math.pow(r, (n-1));
        if(n != 0){
            System.out.println(an);
            an = recursivoGeometrica(n-1, a, r);
        }
        return an;
            
    }
    
}

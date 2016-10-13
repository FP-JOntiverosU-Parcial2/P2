/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int m, R, milla, yarda, pie;
        m=solicitarMetros();
        R=mostrarResultados(m);
        
        
        
        
                
    }
    public static int solicitarMetros(){
        int m;
        System.out.println("Introduce los metros para convertirlos en pies, millas y yardas:");
        Scanner teclado= new Scanner(System.in);
        m=teclado.nextInt();
        return m;
   }
    
    

    
    public static int mostrarResultados(int m){
        double pie = 3.28084;
        double milla = 0.000621371;
        double yarda = 1.09361;
        float r1 = (float) (m*milla);
        float r2 = (float) (m*yarda);
        float r3 = (float) (m*pie);
        System.out.println(m + " metros" + " es igual a: " + r1 + " milla(s)");
        System.out.println(m + " metros" + " es igual a: " + r2 + " yarda(s");
        System.out.println(m + " metros" + " es igual a: " + r3 + " pie(s)");
        return m;
    }
            
}

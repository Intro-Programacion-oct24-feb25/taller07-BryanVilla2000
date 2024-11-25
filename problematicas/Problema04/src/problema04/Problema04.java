/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author villa
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int denominador = 1;
        double suma = 0;
        int signo = 1;
        String cadenaFinal = "1";
        
        while (denominador <= 15) {
            double termino = (double) signo / denominador;
            suma =suma + termino ;
            if(denominador > 1){
                if(signo > 0){
                    cadenaFinal = String.format("%s + 1/%d", cadenaFinal, denominador);
                } else {
                    cadenaFinal = String.format("%s - 1/%d", cadenaFinal, denominador);
                }
            }
            
            denominador = denominador + 2;
            signo = signo * -1;
        }
        
        System.out.printf("Serie: %s\n", cadenaFinal);
        System.out.printf("Resultado: %.4f\n", suma);
    }
}

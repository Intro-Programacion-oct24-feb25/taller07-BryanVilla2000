/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;


/**
 *
 * @author villa
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 2;
        int incremento = 4;
        int contador = 1;
        
        while (contador <= 10) {
            System.out.println(numero);
            numero = numero + incremento;
            incremento = incremento + 2;
            contador =contador + 1;
        }
    }
}
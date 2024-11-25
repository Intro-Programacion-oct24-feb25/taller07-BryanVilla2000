/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author villa
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 2;
        int incremento = 3;
        int contador = 1;
        
        while (contador <= 6) {
            System.out.println(numero);
            incremento = incremento + 2;
            numero = numero + incremento;
            contador = contador + 1;
        }
    }
}

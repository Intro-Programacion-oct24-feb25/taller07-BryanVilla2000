/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author villa
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaFinal = "Listado de Jugadores\n";
        String listaEdades = "Listado de Edades\n";
        String respuesta;
        int contador = 1;
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Ingrese el nombre del jugador:");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese la posición del jugador:");
            String posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            int edad = Integer.parseInt(entrada.nextLine());

            System.out.println("Ingrese la estatura del jugador:");
            double estatura = Double.parseDouble(entrada.nextLine());

            cadenaFinal = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    cadenaFinal,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);

            listaEdades = String.format("%s%d\n", listaEdades, edad);

            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;

            System.out.println("¿Desea ingresar más jugadores? (Si/No)");
            respuesta = entrada.nextLine();
            
            if (respuesta.equalsIgnoreCase("si")) {
                continuar = true;
            } else {
                continuar = false;
            }

            contador = contador +1;
        }

        double promedioEdades = sumaEdades / (contador - 1);
        double promedioEstaturas = sumaEstaturas / (contador - 1);

        System.out.println(cadenaFinal);
        System.out.println(listaEdades);
        System.out.printf("Promedio de edades: %.1f\n", promedioEdades);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstaturas);
    }
}

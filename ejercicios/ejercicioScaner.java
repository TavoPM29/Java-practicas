package ejercicios;

import java.util.Scanner;

public class ejercicioScaner {
/**
 * @param args
 */
     public static void main(String[] args) {
        System.out.println("inserte el titulo de su libro:");
        try (Scanner consolScanner = new Scanner(System.in)) {
            var titulo = consolScanner.nextLine();
            System.out.println("El titulo del libro: " + titulo);
            System.out.println("inserte el nombre del autor del libro:");
            var autor = consolScanner.nextLine();
            System.out.println("el nombre del auto es: " + autor);
            System.out.println("el libro "+ titulo + " fue escrito por \""+ autor +"\"" );
        }    
    }
}

package ejercicios;

import java.util.Scanner;

public class ejerciciolibro {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        try (Scanner consolScanner = new Scanner(System.in)) {
            var usuario = consolScanner.nextLine();
            System.out.println("Usuario = " + usuario);
            System.out.println("Escribe el titulo:");
            var titulo = consolScanner.nextLine();
            System.out.println("Titulo = " + titulo);
            var resultado = (titulo + " " + usuario);
            System.out.println("resultado es: " + resultado);
            
        }
    }
}

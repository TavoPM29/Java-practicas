package Fundamentos;
//anexo teoria que he ido practicando del curso para registro propio

public class Variables {
    /**
     * @param args
     */
    public static void main(String args[]) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        // modificamos el valor las variables en java se pueden cambiar al paso
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        // DEFINIENDO TIPO DE CLASE (COMO STRING O INT)

        String miVariableCadena = "Hola Gustavo";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios Gustavo";
        System.out.println(miVariableCadena);

        // USO DE VAR PARA CREAR VARIABLES (EN UN ESPACIO DEFINIDO)
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Prueba 2";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        // REGLAS PARA DEFINIR VARIABLES
        // 1- el 1er caracter debe ser una letra (se recomienda minuscula), un "_" o "$"
        // 2- no usar acentos
        // 3- no usar caracteres especiales.

        var unaVariable = 1;
        System.out.println(unaVariable);

        var _variables = 2;
        System.out.println(_variables);

        var $miVariable = 3;
        System.out.println($miVariable);

        // CONCATENACION DE CADENAS
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println("suma de variables = " + (i + j));

        /// CARACTERES ESPECIALES EN JAVA ( LA INVERSA " \ ")
        var nombre = "karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("comilla simple: \'" + nombre + "\'");
        // la comilla doble es lo mismo que la simple asi agregas la doble.

        //CLASE SCANER EN JAVA 
        var usuario2 = "Carlos";
        System.out.println("usuario = " + usuario2);

        

    }
    
}

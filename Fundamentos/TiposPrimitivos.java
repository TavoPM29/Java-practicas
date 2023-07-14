package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // TIPOS PRIMITIVOS DE VARIABLES
        // BYTE 8 BITS, SHORT 16 BITS, INT 32 BITS, LONG 64 BITS

        byte numeroByte = (byte) 129;
        System.out.println("valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        System.out.println("numeroByte: " + numeroByte);

        short numeroShort = (short) 10;
        System.out.println("numeroShort: " + numeroShort);
        System.out.println("max min short:" + Short.MAX_VALUE);
        System.out.println("val min short:" + Short.MIN_VALUE);

        int numeroInt = (int) 12;
        System.out.println("numeroShort: " + numeroInt);
        System.out.println("max min short:" + Integer.MAX_VALUE);
        System.out.println("val min short:" + Integer.MIN_VALUE);

        long numeroLong = (long) 13;
        System.out.println("numeroShort: " + numeroLong);
        System.out.println("max min short:" + Long.MAX_VALUE);
        System.out.println("val min short:" + Long.MIN_VALUE);

        // exiten float y double
    }

}

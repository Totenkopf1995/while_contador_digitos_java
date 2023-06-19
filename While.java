package main;

public class While {
    public static void main(String[] args) {

        int contador = 0;
        int numero = 123456789;

        while (numero > 0) {

            numero = numero / 10;
            contador++;
        }

        System.out.println("El numero posee " + contador + " digitos");
    }
}
package Loops;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Imprimir los numeros  de 1 al 100, excepeto multiplos del 3 y 5
        for (int i= 1; i<= 100; i++ ){
            if ((i % 3 != 0) && (i % 5 != 0))  {
                System.out.println(i);
            }

        }
    }
}

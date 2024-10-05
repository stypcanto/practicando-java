package Condicionales;

import java.util.Scanner;

public class EjercicioPrueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");

        int numero = sc.nextInt();

        if(numero > 0){
            System.out.println("POSITIVO");
        } else if ( numero == 0) {
            System.out.println("CERO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}

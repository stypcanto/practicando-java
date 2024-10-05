package Condicionales;

import java.util.Scanner;

public class EjercicioPrueba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el número: ");

            int numero = sc.nextInt();

            if(numero % 2 == 0)
            {
                System.out.println("Numero par");
            } else {
                System.out.println("Numero impar");
            }

    }
}

package Variables;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //float fahrenheit = 290;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura en fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit -32) * 5/9;
        System.out.println("La temperatura en grados celsius es: "+celsius);

    }
}

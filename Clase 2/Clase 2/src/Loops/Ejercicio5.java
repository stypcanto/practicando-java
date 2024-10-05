package Loops;
// Imprimir los numeros  de 1 al 100, excepeto multiplos del 3
public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i= 1; i<= 100; i++ ){
            if (i % 3 != 0){
                System.out.println(i);
            }

        }
    }
}

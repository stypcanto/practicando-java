public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int edad = 25;
        // Estoy creando un comentario
        System.out.println("Mi edad es "+edad);

        float estatura = 1.68f;
        System.out.println("Mi estatura es "+estatura);
        double peso = 34.324;

        char letra = 'a';
        String nombre = "Styp";
        System.out.println("Hola soy "+ nombre + ", actualmente estoy pesando " + peso + " estoy considerado cantegoría " + letra);

        //operaciones con variables
        //operador suma +

        int a = 10;
        int b = 20;

        int resultado = a + b;
        System.out.println("El resultado de la suma de 10 + 20 es "+resultado);

        String firstName = "George ";
        String lastName = "Maxi";
        String respString = firstName + lastName;

        System.out.println(respString);

        //division

        int num1 = 10;
        int num2 = 2;

        int respDiv = num1 /num2;
        System.out.println("Respuesta division " + respDiv);

        //Si dividimos entero sobre entero entonces resultado entero
        //Si dividimos entero sobre flotante entonces reusltado flotante
        //Si dividmos floitante sobre flotante es flotante

        float num3 = 9f;
        float respDiv2 = num1 / num3;
        System.out.println("Respuesta division decimal " + respDiv2);

        int num4 = 12;
        int num5 = 5;

        float respDiv3 = num4 / num5;
        System.out.println(respDiv3);

        //Reasignando
        num1 = 28;

        num1 = num1 + 5;
        // tambien se puede escribir como num1 += 5;
        System.out.println(num1);

        final float PI = 3.14f;

        int var1 = 6;
        int var2 = 9;

        //Reasignar los valores de tal forma que
        //var1 tenga el valor de var2 y
        //var2 tenga el valor de var1
        int aux = var1;
        var1 = var2;
        var2 = aux;

        System.out.println("Var1: "+ var1);
        System.out.println("Var2: "+ var2);

        //Operador modulo %

        int ope1 = 10;
        int ope2 = 3;
        System.out.println("El residuo: "+ ope1%ope2);


    }
}
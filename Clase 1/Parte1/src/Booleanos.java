public class Booleanos {
    public static void main(String[] args) {
            boolean var1 = true;
            boolean var2 = false; // 1 bit

        //<> <= >+ == !=  !

        int a = 10;
        int b = 12;

        System.out.println( a <= b);
        System.out.println( b <= a);

        System.out.println( a == b);

        int c = 12;

        System.out.println( c == b);
        System.out.println( c != b);

        // and (&&) , or (||), not (!)
        System.out.println( "--------AND----------");
        System.out.println( true && true);
        System.out.println( true && false);
        System.out.println( false && false);

        // mascarilla y carnet vacunacion
        // true          false
        // false

        System.out.println( "--------OR----------");
        System.out.println( true || true);
        System.out.println( true || false);
        System.out.println( false || false);

        //ingresar a un concierto
        //puedes traer tu entradas fisica o virtua;
        // True                false
        // False                true

        System.out.println( "--------NOT----------");
        System.out.println( !true);
        System.out.println( !false);

        System.out.println( "--------&----------");
        System.out.println( 10 & 19); //hace un and en binario y genera el resuem

        System.out.println( "--------<<----------");
        System.out.println( 10 << 2); //este operador mueve dos bits a la izquierda


    }
}

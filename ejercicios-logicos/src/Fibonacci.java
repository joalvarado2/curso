public class Fibonacci {
    public static void main(String[] args) {
        // ejercicio 0,1,1,2,3,5,8,13,21,34

        int i = 0, a = 0, b = 1, suma = 0;

        System.out.println("Serie con for");
        for (i = 0; i <= 10; i++) {
            if (i < 10) {
                System.out.print(a + ",");
                suma = a + b;
                a = b;
                b = suma;
            } else {
                System.out.print(a);
            }
        }
        System.out.println("");
        i = 0;
        a = 0;
        b = 1;
        suma = 0;

        System.out.println("Serie con while");

        while (i <= 10) {
            if (i < 10) {
                System.out.print(a + ",");
                suma = a + b;
                a = b;
                b = suma;
            } else {
                System.out.print(a);
            }
            i++;
        }
        System.out.println("");
    }
}

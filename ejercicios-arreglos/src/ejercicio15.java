import java.util.Arrays;


public class ejercicio15 {
    public static void main(String[] args) {
        int a[] = {9, 10, 6, 3, 12, 5, 1, 98, 48};
        int b[] = {1, 6, 32, 4, 2, 5, 12, 11, 62};

        Arrays.sort(a);
        System.out.println("Arreglo 1 ordenado \n"+Arrays.toString(a));
        Arrays.sort(b);
        System.out.println("Arreglo 2 ordenado \n"+Arrays.toString(b));

        String union = Arrays.toString(a) + Arrays.toString(b);
        System.out.println(union);


    }

}


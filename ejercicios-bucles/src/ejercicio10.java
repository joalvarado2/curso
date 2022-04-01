public class ejercicio10 {
    /*
        Diseñar un programa que muestre el producto de los
        10 primeros numeros impares
    */
    public static void main(String[] args) {
        long producto = 1, valor = 0;
        for(var i = 1; i <= 20; i += 2){
            producto *= i;
            valor = (i+2);
            System.out.println(i +".) "+producto * valor+" es la multiplicacion de "+producto+" X "+ valor);
        }
    }
}

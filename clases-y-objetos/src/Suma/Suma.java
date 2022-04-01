package Suma;

public class Suma {
    private  int vUno, vDos, resultado;

    public  Suma(int valor1, int valor2) {
        this.vUno = valor1;
        this.vDos = valor2;
    }
    public  void Operacion(){
        resultado = vUno + vDos;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es "+ resultado);
    }
}

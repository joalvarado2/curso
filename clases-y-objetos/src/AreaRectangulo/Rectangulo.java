package AreaRectangulo;

public class Rectangulo {
    private int base, altura, area;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public void CalculoArea(){
        area = base * altura;
    }
    public void imprimir(){
        CalculoArea();
        System.out.println("El area del rectangulo es: "+area);
    }

}

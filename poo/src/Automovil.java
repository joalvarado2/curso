public class Automovil {

    String fabricante;
    String modelo;
    String color = "Rojo";
    double clilindraje;
    int capacidadEstanque = 40;

    public String detalle() {

        String sb = "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.clilindraje = " + this.clilindraje;
        return sb;
    }

    public String acelerar(int rpm) {
        return "el auto " + fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " Frenando";
    }


    // combinando metodos
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();

        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }
}

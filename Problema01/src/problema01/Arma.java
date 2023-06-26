package problema01;

/**
 *
 * @author Joseph
 */
public class Arma {

    private double aumentoAtaque;
    private double aumentoDefensa;
    private int durabilidad;

    public Arma() {
    }

    public Arma(double aumentoAtaque, double aumentoDefensa, int durabilidad) {
        this.aumentoAtaque = aumentoAtaque;
        this.aumentoDefensa = aumentoDefensa;
        this.durabilidad = durabilidad;
    }

    public void setAumentoAtaque(double aumentoAtaque) {
        this.aumentoAtaque = aumentoAtaque;
    }

    public void setAumentoDefensa(double aumentoDefensa) {
        this.aumentoDefensa = aumentoDefensa;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public double getAumentoAtaque() {
        return aumentoAtaque;
    }

    public double getAumentoDefensa() {
        return aumentoDefensa;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public abstract void calcularDaño();
}

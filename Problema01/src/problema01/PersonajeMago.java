package problema01;

/**
 *
 * @author Joseph
 */
public class PersonajeMago extends Personaje {

    private double ataque;
    private double defensa;
    private Arma armaMago;

    public PersonajeMago() {
    }

    public PersonajeMago(String nombre, int nivel, int experiencia, int vida, double ataque, double defensa, Arma armaMago) {
        super(nombre, nivel, experiencia, vida);
        this.ataque = ataque;
        this.defensa = defensa;
        this.armaMago = armaMago;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setArmaMago(Arma armaMago) {
        this.armaMago = armaMago;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public Arma getArmaMago() {
        return armaMago;
    }

    public int atacar() {

    }

    public int defenderse() {

    }

    @Override
    public String toString() {
        return "PersonajeMago{"
                + "ataque=" + ataque
                + ", defensa=" + defensa
                + ", armaMago=" + armaMago
                + "} " + super.toString();
    }
}

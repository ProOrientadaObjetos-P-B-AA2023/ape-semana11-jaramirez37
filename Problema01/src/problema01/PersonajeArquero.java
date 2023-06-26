package problema01;

/**
 *
 * @author Joseph
 */
public class PersonajeArquero extends Personaje {

    private double ataque;
    private double defensa;
    private Arma armaArquero;

    public PersonajeArquero() {
    }

    public PersonajeArquero(String nombre, int nivel, int experiencia, int vida, double ataque, double defensa, Arma armaArquero) {
        super(nombre, nivel, experiencia, vida);
        this.ataque = ataque;
        this.defensa = defensa;
        this.armaArquero = armaArquero;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setArmaArquero(Arma armaArquero) {
        this.armaArquero = armaArquero;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public Arma getArmaArquero() {
        return armaArquero;
    }

    public int atacar(Personaje oponente) {
        this.ataque = this.ataque + this.ataque * this.armaGuerrero.getAumentoAtaque() / 100;
        return (int) ataque;
    }

    public void defenderse() {

    }

    @Override
    public String toString() {
        return "PersonajeArquero{"
                + "ataque=" + ataque
                + ", defensa=" + defensa
                + ", armaArquero=" + armaArquero
                + "} " + super.toString();
    }
}

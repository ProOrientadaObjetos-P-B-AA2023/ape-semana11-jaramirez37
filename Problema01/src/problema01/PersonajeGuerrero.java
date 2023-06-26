package problema01;

/**
 *
 * @author Joseph
 */
public class PersonajeGuerrero extends Personaje {

    private double ataque;
    private double defensa;
    private Arma armaGuerrero;

    public PersonajeGuerrero() {
    }

    public PersonajeGuerrero(String nombre, int nivel, int experiencia, int vida, double ataque, double defensa, Arma armaGuerrero) {
        super(nombre, nivel, experiencia, vida);
        this.ataque = ataque;
        this.defensa = defensa;
        this.armaGuerrero = armaGuerrero;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setArmaGuerrero(Arma armaGuerrero) {
        this.armaGuerrero = armaGuerrero;
    }

    public double getAtaque() {
        return ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public Arma getArmaGuerrero() {
        return armaGuerrero;
    }

    public int atacar(Personaje oponente) {
        this.ataque = this.ataque + this.ataque * this.armaGuerrero.getAumentoAtaque() / 100;
        return (int) ataque;
    }

    public int defenderse(int danioRecibido) {
        this.defensa = this.defensa + this.defensa + this.armaGuerrero.getAumentoDefensa() * 10 / 100;
        return (int) defensa;
    }

    @Override
    public String toString() {
        return "PersonajeGuerrero{"
                + "ataque=" + ataque
                + ", defensa=" + defensa
                + ", armaGuerrero=" + armaGuerrero
                + "} " + super.toString();
    }
}

package problema01;

/**
 *
 * @author Joseph
 */
public abstract class Personaje {

    private String nombre;
    private int nivel;
    private int experiencia;
    private int vida;

    public Personaje() {
    }

    public Personaje(String nombre, int nivel, int experiencia, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getVida() {
        return vida;
    }

    public abstract int atacar();

    public abstract void defenderse();

    @Override
    public String toString() {
        return "Personaje{"
                + "nombre='" + nombre + '\''
                + ", nivel=" + nivel
                + ", experiencia=" + experiencia
                + ", vida=" + vida
                + '}';
    }
}

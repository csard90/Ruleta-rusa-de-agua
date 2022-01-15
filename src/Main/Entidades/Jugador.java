
package Main.Entidades;

public class Jugador {

    private Integer id;         // NUMERO DE JUGADOR, ES DECIR SI JUEGAN 5 EL PRIMERO EN CARGARSE TENDRA ID 1, Y ASI SUCESIVAMENTE.
    private String nombre;      // NOMBRE ELEGIDO + " " + ID
    private boolean mojado;     // INDICA SI EL JUGADOR RECIBIO EL DISPARO, ES DECIR SI LA POSICION DEL AGUA Y LA ACTUAL COINCIDEN (TRUE), DEFAULT FALSE.

    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre + " " + this.id;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre + " " + this.id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    

}

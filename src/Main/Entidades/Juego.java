
package Main.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revolver = new Revolver();
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = new ArrayList<>();
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    
    
    

}

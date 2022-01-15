package Main;

import Main.Entidades.Juego;
import Main.Servicios.JuegoServicio;

public class Main {
  
    public static void main(String[] args) {
     
        Juego juego1 = new Juego();
        
        JuegoServicio.juego(juego1);
        
    }

}

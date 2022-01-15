
package Main.Servicios;

import Main.Entidades.Jugador;
import Main.Entidades.Revolver;
import java.util.Scanner;

public class JugadorServicio {
    
    private static Scanner sc;           
    
    public static boolean disparo(Revolver raux, Jugador jaux) {                                
        if (RevolverServicio.mojar(raux)) {
            jaux.setMojado(true);
            return true;
        } else {
            RevolverServicio.siguienteChorro(raux);
            return false;
        }        
    }
    

    
    
}

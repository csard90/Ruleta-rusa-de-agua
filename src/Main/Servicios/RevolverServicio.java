
package Main.Servicios;

import Main.Entidades.Revolver;
import java.util.Objects;

public class RevolverServicio {

    public static void llenarRevolver(Revolver raux){        
        raux.setCapacidad(8);                                       // CAPACIDAD=8
        raux.setPosicionActual((int) (Math.random()*8)+1);      
        raux.setPosicionAgua((int) (Math.random()*8+1));        
    }
    
    public static boolean mojar(Revolver raux){        
        return Objects.equals(raux.getPosicionActual(), raux.getPosicionAgua());
    }
    
    public static void siguienteChorro(Revolver raux){
        raux.setPosicionActual(raux.getPosicionActual()+1);
        if (raux.getPosicionActual()>raux.getCapacidad()) {
            raux.setPosicionActual(1);
        }
    }
    
    
    
    
    

}

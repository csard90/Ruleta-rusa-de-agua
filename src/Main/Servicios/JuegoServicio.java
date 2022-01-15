
package Main.Servicios;

import Main.Entidades.Juego;
import Main.Entidades.Jugador;
import java.util.Scanner;

public class JuegoServicio {
    
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");       
    
//    public static void llenarJuego(Juego juego, List<Jugador> jugadores, Revolver revolver) {
//        juego.setJugadores(jugadores);
//        juego.setRevolver(revolver);                
//    }
    
    public static void ronda(Juego jaux) {
        
        int cont = 0;
        int contRondas = 1;
        boolean fin;
        String conf;
        System.out.println("---------------------------------------------");
        System.out.println("-----> EN JUEGO <----------------------------");
        System.out.println("---------------------------------------------");
        System.out.println(" ");
        do {
            do {
                System.out.println("---------------------------------------------");
                System.out.println("RONDA NUMERO " + (contRondas) + " DE LA RULETA RUSA ");            
                System.out.println("TURNO DEL JUGADOR: " + jaux.getJugadores().get(cont).getNombre());
                System.out.println("- INGRESE C PARA CONTINUAR: ");
                conf = sc.next();
                if (!conf.equalsIgnoreCase("C"))
                    System.out.println("*COMANDO NO VALIDO, INTENTELO OTRA VEZ");
                System.out.println(" ");                
            } while(!conf.equalsIgnoreCase("C"));
            fin = JugadorServicio.disparo(jaux.getRevolver(), jaux.getJugadores().get(cont));
            
            if (fin != true) {
                if (cont == jaux.getJugadores().size()-1) {                    
                    cont = 0;
                } else {
                    cont++;
                }
                contRondas++;
                System.out.println("*AIRE");
            } else {
                System.out.println("*AGUA");
            }
            System.out.println("---------------------------------------------");
        } while (fin != true);
        System.out.println(" ");
        System.out.println("-----> FIN DEL JUEGO <-----------------------");
        System.out.println(" ");
        System.out.println("* EL JUGADOR QUE HA RECIBIDO UN DISPARO FUE: " + jaux.getJugadores().get(cont).getNombre());
        System.out.println(" ");
        
        
        
        
        
            
        
        
    }
    
    public static void nuevoJuego(Juego jaux){
        
        System.out.println("----------> NUEVO JUEGO <--------------------");
        System.out.println("- INGRESE LA CANTIDAD DE JUGADORES (DE 1 A 6): ");
        int jug = sc.nextInt();
        if (jug < 1 || jug > 6) {
            jug = 6;
        }
        System.out.println(" ");        
        
        System.out.println("- CARGA DE DATOS DE JUGADORES");
        System.out.println(" ");
        
        Integer id;
        String nombre;
        for (int i = 0; i < jug; i++) {
            
            System.out.println("- JUGADOR NUMERO " + (i+1) + ": ");
            id = i+1;
            System.out.println("- INGRESE EL NOMBRE DEL JUGADOR: ");
            nombre = sc.next().toUpperCase();
            jaux.getJugadores().add(new Jugador(id, nombre));
            System.out.println(" ");
        }
        
        RevolverServicio.llenarRevolver(jaux.getRevolver());
        
        
        
    }
    
    public static void recargarJuego(Juego jaux) {
        
        RevolverServicio.llenarRevolver(jaux.getRevolver());
        for (int i = 0; i < jaux.getJugadores().size() ; i++) {
            jaux.getJugadores().get(i).setMojado(false);
        }
        
    }
    
    public static void juego(Juego jaux) {
                
        
        System.out.println("---------------------------------------------");
        System.out.println("---------------> RULETA RUSA <---------------");
        System.out.println("---------------------------------------------");
        nuevoJuego(jaux);
        String resp;
        do {
            ronda(jaux);
            do{
                System.out.println("---------------------------------------------");
                System.out.println("DESEA VOLVER A JUGAR? (SI-NO): ");
                resp = sc.next();
                if (!(resp.equalsIgnoreCase("SI")) && !(resp.equalsIgnoreCase("NO"))){
                    System.out.println("*RESPUESTA NO VALIDA");                    
                    System.out.println("---------------------------------------------");
                    System.out.println(" ");
                }
            } while(!(resp.equalsIgnoreCase("SI")) && !(resp.equalsIgnoreCase("NO")));
            if (resp.equalsIgnoreCase("SI")){
                recargarJuego(jaux);
            }
        } while(resp.equalsIgnoreCase("SI"));
        System.out.println(" ");
        System.out.println("---------------------------------------------");
        System.out.println("GRACIAS POR VENIR");
        System.out.println("---------------------------------------------");
    }
}

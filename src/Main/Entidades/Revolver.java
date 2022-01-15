
package Main.Entidades;

public class Revolver {

    private Integer capacidad;
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {        
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "capacidad=" + capacidad + ", posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    
    
    

}

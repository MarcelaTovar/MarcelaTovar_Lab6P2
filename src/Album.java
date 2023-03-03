
import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Album extends Lanzamiento{
    private ArrayList<Cancion> cancionesPertenecen = new ArrayList();
    private int cantidadDeCanciones;

    public Album() {
    }

    public Album(int cantidadDeCanciones, String tituloDePublicacion, Date fechaDeLanzamiento, int conteoDeLikes) {
        super(tituloDePublicacion, fechaDeLanzamiento, conteoDeLikes);
        this.cantidadDeCanciones = cantidadDeCanciones;
    }

    public ArrayList<Cancion> getCancionesPertenecen() {
        return cancionesPertenecen;
    }

    public void setCancionesPertenecen(ArrayList<Cancion> cancionesPertenecen) {
        this.cancionesPertenecen = cancionesPertenecen;
    }

    public int getCantidadDeCanciones() {
        return cantidadDeCanciones;
    }

    public void setCantidadDeCanciones(int cantidadDeCanciones) {
        this.cantidadDeCanciones = cantidadDeCanciones;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nCancionesPertenecen: " + cancionesPertenecen + "\nCantidadDeCanciones: " + cantidadDeCanciones;
    }
    
    
}

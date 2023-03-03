
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class ListaDeReproduccion {
    private String nombre;
    private int conteoDeLikes;
    private ArrayList<Cancion> canciones = new ArrayList();
    private String creador;

    public ListaDeReproduccion() {
    }

    public ListaDeReproduccion(String nombre, int conteoDeLikes, String creador) {
        this.nombre = nombre;
        this.conteoDeLikes = conteoDeLikes;
        this.creador = creador;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConteoDeLikes() {
        return conteoDeLikes;
    }

    public void setConteoDeLikes(int conteoDeLikes) {
        this.conteoDeLikes = conteoDeLikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
        
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    
    

    @Override
    public String toString() {
        return this.nombre + "\nConteoDeLikes: " + conteoDeLikes + "\nCanciones: " + canciones;
    }
    
    
}

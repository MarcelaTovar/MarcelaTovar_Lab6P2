
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcela
 */
public class Cancion {

    private String titulo;
    private int tiempoDeDuracion;
    private String referenciaAlAlbum;

    public Cancion() {
    }

    public Cancion(String titulo, int tiempoDeDuracion, String referenciaAlAlbum) {
        this.titulo = titulo;
        this.tiempoDeDuracion = tiempoDeDuracion;
        this.referenciaAlAlbum = referenciaAlAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempoDeDuracion() {
        return tiempoDeDuracion;
    }

    public void setTiempoDeDuracion(int tiempoDeDuracion) {
        this.tiempoDeDuracion = tiempoDeDuracion;
    }

    public String getReferenciaAlAlbum() {
        return referenciaAlAlbum;
    }

    public void setReferenciaAlAlbum(String referenciaAlAlbum) {
        this.referenciaAlAlbum = referenciaAlAlbum;
    }

    @Override
    public String toString() {
        return this.titulo + "\nTiempo De Duracion: " + tiempoDeDuracion + "\nReferencia Al Album: " + referenciaAlAlbum;
    }

    
}

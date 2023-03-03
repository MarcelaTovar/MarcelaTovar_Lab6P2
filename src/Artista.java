
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Artista extends Usuario{
    private String nombreArtistico;
    private ArrayList <Cancion> cancionespublicadas = new ArrayList();
    private ArrayList <Lanzamiento> albumespublicadas = new ArrayList();

    public Artista() {
    }

    public Artista(String nombreArtistico, String username, char[] contrasenia, int edad) {
        super(username, contrasenia, edad);
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCancionespublicadas() {
        return cancionespublicadas;
    }

    public void setCancionespublicadas(ArrayList<Cancion> cancionespublicadas) {
        this.cancionespublicadas = cancionespublicadas;
    }

    public ArrayList<Lanzamiento> getAlbumespublicadas() {
        return albumespublicadas;
    }

    public void setAlbumespublicadas(ArrayList<Lanzamiento> albumespublicadas) {
        this.albumespublicadas = albumespublicadas;
    }

    @Override
    public String toString() {
        return super.toString()+this.nombreArtistico + "\nCancionespublicadas: " + cancionespublicadas + "\nAlbumespublicadas: " + albumespublicadas;
    }
    
    
}

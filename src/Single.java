
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
    }

    public Single(Cancion cancion, String tituloDePublicacion, String fechaDeLanzamiento, int conteoDeLikes) {
        super(tituloDePublicacion, fechaDeLanzamiento, conteoDeLikes);
        this.cancion = cancion;
    }

    
    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCancion: " + cancion;
    }
    
    
}

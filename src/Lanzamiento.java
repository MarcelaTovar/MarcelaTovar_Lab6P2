
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Lanzamiento {
    protected String tituloDePublicacion;
    protected Date fechaDeLanzamiento;
    protected int conteoDeLikes;

    public Lanzamiento() {
    }

    public Lanzamiento(String tituloDePublicacion, Date fechaDeLanzamiento, int conteoDeLikes) {
        this.tituloDePublicacion = tituloDePublicacion;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.conteoDeLikes = conteoDeLikes;
    }

    public String getTituloDePublicacion() {
        return tituloDePublicacion;
    }

    public void setTituloDePublicacion(String tituloDePublicacion) {
        this.tituloDePublicacion = tituloDePublicacion;
    }

    public Date getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getConteoDeLikes() {
        return conteoDeLikes;
    }

    public void setConteoDeLikes(int conteoDeLikes) {
        this.conteoDeLikes = conteoDeLikes;
    }

    @Override
    public String toString() {
        return this.tituloDePublicacion + "\nFechaDeLanzamiento: " + fechaDeLanzamiento + "\nConteoDeLikes: " + conteoDeLikes;
    }
    
    
}

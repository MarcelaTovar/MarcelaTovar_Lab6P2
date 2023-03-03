
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcela
 */
public class administrarCanciones {

    private ArrayList<Cancion> canciones = new ArrayList();
    private File archivo = null;
    
    public administrarCanciones(String path) {
        archivo = new File(path);
    }

    public administrarCanciones() {
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setCancion(Cancion p) {
        this.canciones.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cancion c : canciones) {

                bw.write(c.getTitulo() + ";");
                bw.write(c.getTiempoDeDuracion() + ";");
                bw.write(c.getReferenciaAlAlbum() + "\n");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
}

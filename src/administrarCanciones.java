
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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

    public ArrayList<Cancion> cargarArchivo() {
//        
        Object[] guardarS = null;
        if (archivo.exists()) {
            try {
                FileReader fr = new FileReader("./canciones.txt");
                BufferedReader br = new BufferedReader(fr);

                guardarS = br.lines().toArray();
                br.close();
                fr.close();
            } catch (IOException e) {

            }
            for (int i = 0; i < guardarS.length; i++) {
                String[] cambiar = String.valueOf(guardarS[i]).split(";");
                Cancion c = new Cancion(cambiar[0], Integer.parseInt(cambiar[1]), cambiar[2]);
                canciones.add(c);
            }
            
        }
        return canciones;

    }
}

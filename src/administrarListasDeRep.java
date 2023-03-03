
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
public class administrarListasDeRep {

    private ArrayList<ListaDeReproduccion> listasderep = new ArrayList();
    private File archivo = null;

    public administrarListasDeRep(String path) {
        archivo = new File(path);
    }

    public ArrayList<ListaDeReproduccion> getListasderep() {
        return listasderep;
    }

    public void setListasderep(ArrayList<ListaDeReproduccion> listasderep) {
        this.listasderep = listasderep;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setlista(ListaDeReproduccion p) {
        this.getListasderep().add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (ListaDeReproduccion t : listasderep) {

                bw.write(t.getNombre() + ";");
                bw.write(t.getConteoDeLikes() + ";");
                bw.write(t.getCreador() + "\n");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

}

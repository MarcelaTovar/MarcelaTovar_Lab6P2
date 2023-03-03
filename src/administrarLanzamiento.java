
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
public class administrarLanzamiento {
    private ArrayList<Lanzamiento> lanzamientos = new ArrayList();
    private File archivo = null;

    public administrarLanzamiento() {
    }
    
    public administrarLanzamiento(String path) {
        archivo = new File(path);
    }

    public ArrayList<Lanzamiento> getLanzamientos() {
        return lanzamientos;
    }

    public void setLanzamientos(ArrayList<Lanzamiento> lanzamientos) {
        this.lanzamientos = lanzamientos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setLanzamiento(Lanzamiento p) {
        this.lanzamientos.add(p);
    }
    
    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Lanzamiento t : lanzamientos) {
                if (t instanceof Album) {
                    bw.write(((Album)t).getCantidadDeCanciones()+";");
                    bw.write(t.getTituloDePublicacion() + ";");
                    bw.write(t.getFechaDeLanzamiento()+";");
                    bw.write(t.getConteoDeLikes() + "\n");
                } else if (t instanceof Single) {
                    bw.write(((Single)t).getCancion()+";");
                    bw.write(t.getTituloDePublicacion() + ";");
                    bw.write(t.getFechaDeLanzamiento()+";");
                    bw.write(t.getConteoDeLikes() + "\n");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public ArrayList<Lanzamiento> cargarArchivo() {
//        
        Object[] guardarS = null;
        try {
            FileReader fr = new FileReader("./lanzamientos.txt");
            BufferedReader br = new BufferedReader(fr);

            guardarS = br.lines().toArray();
            br.close();
            fr.close();
        } catch (IOException e) {

        }
        for (int i = 0; i < guardarS.length; i++) {
            String[] cambiar = String.valueOf(guardarS[i]).split(";");
            if (cambiar.length == 5) {
                Album a  = new Album(Integer.parseInt(cambiar[0]),cambiar[1],cambiar[2],cambiar[3],Integer.parseInt(cambiar[4]));
                lanzamientos.add(a);
            }else{
                Single s = new Single();
                s.setTituloDePublicacion(cambiar[1]);
                s.setFechaDeLanzamiento(cambiar[2]);
                s.setConteoDeLikes(Integer.parseInt(cambiar[3]));
                lanzamientos.add(s);
            }
            
        }
        return lanzamientos;
    }

}

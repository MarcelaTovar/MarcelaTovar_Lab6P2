
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcela
 */
public class administrarUsuario {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public administrarUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Usuarios: " + usuarios;
    }

    public void setUsuario(Usuario p) {
        this.usuarios.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : usuarios) {
                if (t instanceof Cliente) {
                    bw.write(t.getUsername() + ";");
                    bw.write(t.getContrasenia() + ";");
                    bw.write(t.getEdad() + "\n");
                } else if (t instanceof Artista) {
                    bw.write((((Artista) t).getNombreArtistico() + ";"));
                    bw.write(t.getUsername() + ";");
                    bw.write(t.getContrasenia() + ";");
                    bw.write(t.getEdad() + "\n");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public ArrayList<Usuario> cargarArchivo() {
//        
        Object[] guardarS = null;
        try {
            FileReader fr = new FileReader("./usuarios.txt");
            BufferedReader br = new BufferedReader(fr);

            guardarS = br.lines().toArray();
            br.close();
            fr.close();
        } catch (IOException e) {

        }
        for (int i = 0; i < guardarS.length; i++) {
            String[] cambiar = String.valueOf(guardarS[i]).split(";");
            if (cambiar.length == 4) {
                Artista a = new Artista(cambiar[0],cambiar[1],cambiar[2],Integer.parseInt(cambiar[3]));
                usuarios.add(a);
            }else{
                Cliente c = new Cliente(cambiar[0],cambiar[1],Integer.parseInt(cambiar[2]));
                 usuarios.add(c);
            }
            
            
            

        }
        return usuarios;
    }

}

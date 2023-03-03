
import java.io.BufferedWriter;
import java.io.File;
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

    public void cargarArchivo() {
        Scanner sc = null;
        usuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    for (Usuario usuario : usuarios) {
                        if (usuario instanceof Artista) {
                            usuarios.add(new Artista(sc.next(), sc.next(),
                                    sc.next(),
                                    sc.nextInt()
                            )
                            );

                        } else if (usuario instanceof Cliente) {
                            usuarios.add(new Cliente(sc.next(),
                                    sc.next(),
                                    sc.nextInt()
                            )
                            );
                        }
                    }

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}

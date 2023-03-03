
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marcela
 */
public class Cliente extends Usuario{
    private ArrayList<ListaDeReproduccion> ListasFavoritas = new ArrayList();
    private ArrayList<Cancion> cancionesFavoritas = new ArrayList();

    public Cliente(String username, char[] contrasenia, int edad) {
        super(username, contrasenia, edad);
    }

    public Cliente() {
    }

    public ArrayList<ListaDeReproduccion> getListasFavoritas() {
        return ListasFavoritas;
    }

    public void setListasFavoritas(ArrayList<ListaDeReproduccion> ListasFavoritas) {
        this.ListasFavoritas = ListasFavoritas;
    }

    public ArrayList<Cancion> getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(ArrayList<Cancion> cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    @Override
    public String toString() {
        return super.toString()+"\nListasFavoritas: " + ListasFavoritas + "\nCancionesFavoritas=" + cancionesFavoritas;
    }
    
    
}


import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author marcela
 */
public class Usuario {

    protected String username;
    protected String contrasenia;
    protected int edad;

    public Usuario() {
    }

    public Usuario(String username, String contrasenia, int edad) {
        this.username = username;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }

    public Usuario(String username, String contrasenia) {
        this.username = username;
        this.contrasenia = contrasenia;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.username + "\ncontraseña: " + this.contrasenia;
    }

}

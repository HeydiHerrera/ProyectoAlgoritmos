package proyectoalgoritmos;

import java.util.Scanner;

public class Usuarios {

    String nombre,apellidos,correo,contraseña,rol,estado;

    public Usuarios(String nombre, String apellidos, String correo, String contraseña, String rol,String estado) {

        this.nombre=nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.estado=estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}
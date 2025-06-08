// archivo: models/Usuario.java
package models;

public class Usuario {
    private String nombre;
    private String rol;
    private String correo;

    public Usuario(String nombre, String rol, String correo) {
        this.nombre = nombre;
        this.rol = rol;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public String getRol() { return rol; }
    public String getCorreo() { return correo; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRol(String rol) { this.rol = rol; }
    public void setCorreo(String correo) { this.correo = correo; }
}

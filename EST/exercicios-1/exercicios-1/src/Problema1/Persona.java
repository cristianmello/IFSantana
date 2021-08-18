package Problema1;

public class Persona {
    private String nombre;
    private int telefono;

    public Persona(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return telefono;
    }

}

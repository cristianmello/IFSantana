package Problema2;

public class Estudiante {
    private int codigo;
    private String nombre;
    private double mediaEscolar;

    public Estudiante(int codigo, String nombre, double mediaEscolar) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.mediaEscolar = mediaEscolar;
    }

    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getMediaEscolar(){
        return mediaEscolar;
    }

}

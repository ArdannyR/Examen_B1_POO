package Nivel_1;

import java.util.Scanner;

public abstract class Curso {
    public String nombre_curso;
    public int duracion_curso;
    public double precio_curso;

    public Curso(String nombre_curso, int duracion_curso, double precio_curso) {
        this.nombre_curso = nombre_curso;
        this.duracion_curso = duracion_curso;
        this.precio_curso = precio_curso;
    }

    public abstract Curso crear(Scanner sc);
}

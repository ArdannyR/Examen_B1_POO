package Nivel_2;

import Nivel_1.Curso;

import java.util.Scanner;

public class C_Regular extends Curso {
    private boolean evaluacion_final;

    public C_Regular(String nombre_curso, int duracion_curso, double precio_curso, boolean evaluacion_final) {
        super(nombre_curso, duracion_curso, precio_curso);
        this.evaluacion_final = false;
    }

    @Override
    public C_Regular crear(Scanner sc) {
        System.out.print("Nombre del curso: "); nombre_curso = sc.nextLine();
        System.out.print("Duracion del curso: "); duracion_curso = sc.nextInt(); sc.nextLine();
        System.out.print("Precio base del curso: "); precio_curso = sc.nextDouble(); sc.nextLine();

        return new C_Regular(nombre_curso, duracion_curso, precio_curso, evaluacion_final);
    }

    @Override
    public void mostrar() {
        System.out.printf("\nNombre del curso: %s \tDuracion del curso: %d horas \tPrecio del curso: %.2f$",nombre_curso,duracion_curso,precio_curso);
    }
}

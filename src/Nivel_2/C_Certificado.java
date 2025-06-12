package Nivel_2;

import Nivel_1.Curso;

import java.util.Scanner;

public class C_Certificado extends Curso {
    private boolean certificado;

    public C_Certificado(String nombre_curso, int duracion_curso, double precio_curso, boolean certificado) {
        super(nombre_curso, duracion_curso, precio_curso);
        this.certificado = true;
    }

    @Override
    public C_Certificado crear(Scanner sc) {
        System.out.print("Nombre del curso: "); nombre_curso = sc.nextLine();
        System.out.print("Duracion del curso: "); duracion_curso = sc.nextInt(); sc.nextLine();
        System.out.print("Precio del curso: "); precio_curso = sc.nextDouble(); sc.nextLine();

        return new C_Certificado(nombre_curso, duracion_curso, precio_curso, certificado);
    }

    @Override
    public void mostrar() {
        System.out.printf("Nombre del curso: %s Duracion del curso: %d Precio del curso: %.2f Certificado: %b",nombre_curso,duracion_curso,precio_curso,certificado);
    }
}

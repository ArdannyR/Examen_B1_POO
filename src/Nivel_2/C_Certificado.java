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
        System.out.print("Precio base del curso: "); double precio_base = sc.nextDouble(); sc.nextLine();
        precio_curso = precio_base * 1.25;
        return new C_Certificado(nombre_curso, duracion_curso, precio_curso, certificado);
    }

    @Override
    public void mostrar() {
        System.out.printf("\n * * * * * * * * * * * \nNombre del curso: %s \nDuracion del curso: %d horas\nPrecio del curso: %.2f$ \nCertificado: %b",nombre_curso,duracion_curso,precio_curso,certificado);
    }
}

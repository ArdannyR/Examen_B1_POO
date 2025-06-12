package Nivel_2;

import Nivel_1.Curso;
import Nivel_1.Persona;

import java.util.Scanner;

public class Estudiante extends Persona {
    private boolean matriculacion;

    public Estudiante(String nombre, int edad, boolean matriculacion) {
        super(nombre, edad);
        this.matriculacion = matriculacion;
    }

    @Override
    public Estudiante ingresar(Scanner sc) {
        System.out.print("Ingrese su nombre: "); nombre = sc.nextLine();
        System.out.print("Ingrese su edad: "); edad = sc.nextInt(); sc.nextLine();
        return new Estudiante(nombre, edad, true);
    }
}

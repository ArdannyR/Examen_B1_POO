package Nivel_2;

import Nivel_1.Curso;
import Nivel_1.Persona;

import java.util.Scanner;

public class Docente extends Persona {

    public Docente(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public Docente ingresar(Scanner sc) {
        System.out.print("Ingrese su nombre: "); nombre = sc.nextLine();
        System.out.print("Ingrese su edad: "); edad = sc.nextInt(); sc.nextLine();
        return new Docente(nombre, edad);
    }
}

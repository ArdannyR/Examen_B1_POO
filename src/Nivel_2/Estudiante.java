package Nivel_2;

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
        if (edad < 13 | edad > 30) {
            do {
                System.out.print("Error! Ingrese su edad: "); edad = sc.nextInt(); sc.nextLine();
            } while (edad < 13 | edad > 30);
        }
        return new Estudiante(nombre, edad, true);
    }

    @Override
    public void mostrar() {
        System.out.println("Estudiante: " + nombre + ", edad: " + edad);
    }

}

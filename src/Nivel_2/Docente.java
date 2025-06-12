package Nivel_2;

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
        if (edad < 20 | edad > 60) {
            do {
                System.out.print("Error! Ingrese su edad: "); edad = sc.nextInt(); sc.nextLine();
            } while (edad < 20 | edad > 60);
        }
        return new Docente(nombre, edad);
    }

    @Override
    public void mostrar() {
        System.out.printf("\nDocente: %s \tedad: %d años",nombre, edad);
    }
}

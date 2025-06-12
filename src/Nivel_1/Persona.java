package Nivel_1;

import java.util.Scanner;

public abstract class Persona {
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract Persona ingresar(Scanner sc);
    public abstract void mostrar ();
}

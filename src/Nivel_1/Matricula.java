package Nivel_1;

import java.util.Scanner;

public class Matricula extends Evaluacion {
    private boolean matricula;

    public Matricula(double calificacion, boolean matricula) {
        super(calificacion);
        this.matricula = matricula;
    }

    public Matricula inscripcion(Scanner sc) {
        System.out.print("Ingrese calificacion de su curso: "); calificacion = sc.nextDouble(); sc.nextLine();
        if (calificacion < 0 || calificacion > 10) {
            do {
                System.out.print("Error: Ingrese calificacion del curso: "); calificacion = sc.nextDouble(); sc.nextLine();
            } while (calificacion < 0 || calificacion > 10);
        }
        return new Matricula(calificacion, true);
    }

    public void mostrar() {
        System.out.printf("\nMatriculacion: %b \tCalificacion: %.2f", matricula, calificacion);
    }

}

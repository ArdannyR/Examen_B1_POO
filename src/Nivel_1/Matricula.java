package Nivel_1;

import java.util.Scanner;

public class Matricula extends Evaluacion {
    private boolean matricula;

    public Matricula(double calificacion, boolean matricula) {
        super(calificacion);
        this.matricula = matricula;
    }

    public Matricula inscripcion(Scanner sc) {
        System.out.print("Ingrese calificacion de su curso: "); double calificacion_pos = sc.nextDouble(); sc.nextLine();
        if (calificacion_pos < 0 || calificacion_pos > 10) {
            do {
                System.out.print("Error: Ingrese calificacion del curso: "); calificacion_pos = sc.nextDouble(); sc.nextLine();
            } while (calificacion_pos < 0 || calificacion_pos > 10);
        }
        setCalificacion(calificacion_pos);
        return new Matricula(getCalificacion(), true);
    }

    public void mostrar() {
        System.out.printf("\n * * * * * * * * * * * \nMatriculacion: %b \nCalificacion: %.2f", matricula, getCalificacion());
    }

}

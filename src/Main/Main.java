package Main;

import Nivel_1.Curso;
import Nivel_1.Matricula;
import Nivel_2.C_Certificado;
import Nivel_2.C_Regular;
import Nivel_2.Docente;
import Nivel_2.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int opcion_nivel_1;
        int opcion_nivel_2;

        // Instancias
        Scanner sc = new Scanner(System.in);
        C_Regular curso_r = null;
        C_Certificado curso_c = null;


        // Menu
        System.out.print("\n * * * * * * * * * * * * EPN-PLUS * * * * * * * * * * * * \nBienvenido usuario, presiona un numero para continuar: "); opcion_nivel_1 = sc.nextInt(); sc.nextLine();
        do {
            System.out.print("\n * * * * * * * * * * * * EPN-PLUS * * * * * * * * * * * * \n-- Ingrese (1)Curso Regular o (2)Curso Certificado: "); opcion_nivel_2 = sc.nextInt(); sc.nextLine();
            if (opcion_nivel_2 == 1) {
                C_Regular curso = new C_Regular(null, 0, 0, false);
                curso_r = curso.crear(sc);
            }
            else if (opcion_nivel_2 == 2) {
                C_Certificado curso = new C_Certificado(null, 0, 0, false);
                curso_c = curso.crear(sc);
            }

            else {
                System.out.println("\nError: Opcion no valida.\n");
                opcion_nivel_1 = 0;
            }

            System.out.print("\n -- Docente\n");
            Docente persona_d = new Docente(null,0);
            Docente docente = persona_d.ingresar(sc);

            System.out.print("\n -- Estudiante\n");
            Estudiante persona_e = new Estudiante(null,0,false);
            Estudiante estudiante = persona_e.ingresar(sc);

            System.out.print("\n -- Matricula del Estudiante\n");
            Matricula vacio = new Matricula(0,false);
            Matricula matricula = vacio.inscripcion(sc);
            System.out.print("\n");

            docente.mostrar();
            estudiante.mostrar();
            if (opcion_nivel_2 == 1) {
                curso_r.mostrar();
            }
            else if (opcion_nivel_2 == 2) {
                curso_c.mostrar();
            }
            matricula.mostrar();
        } while (opcion_nivel_1 != 0);

    }
}
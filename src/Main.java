import jdk.jshell.execution.StreamingExecutionControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersion de java");
        System.out.println("Película Matrix");
        // declaración e inicialización de  variables
        int anio = 1999;
        double evaluacion = 5.0;
        boolean estasInlcuidoEnPlan = true;
        double sumatoria, numero;
        int ciclo, veces;
        String nombre = "Rene Avila Alonso";
        String sinopsis = """
                this movie is very good 
                 texto en mas de 2 lineas"
                 """;
        double media = (4.5 + 50. + 3.5) / 3;
        System.out.println("Año pelicula " + anio);
        System.out.println("Evaluacion   " + evaluacion);
        System.out.println("Esta incluido en el plan " + (estasInlcuidoEnPlan ? "verdadero ": "falso"));
        System.out.println("Nombre      " + nombre);
        System.out.println("Resumen     " + sinopsis);
        System.out.println("Calculo media es " + media);
        if (anio < 2020) {
            System.out.println("Pelicula antigua, muy buena");
        } else {
            System.out.println("Pelicula excelente");
        }
        sumatoria = 0.0;
        veces = 5;
        ciclo = 1;
        while (ciclo <= veces) {
            System.out.print("Ingresa nota " + ciclo + " : ");
            Scanner keyboard = new Scanner(System.in);
            numero = keyboard.nextDouble();
            sumatoria = sumatoria + numero;
            ciclo++;
        }
        System.out.println("Promedio " + (sumatoria / veces));
    }
}
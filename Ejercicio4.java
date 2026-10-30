import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        double suma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / 3;

        System.out.println("\nEstudiante: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);

        if (promedio >= 3.0) {
            System.out.println("Resultado: APRUEBA");
        } else {
            System.out.println("Resultado: REPRUEBA");
        }

        sc.close();
    }
}
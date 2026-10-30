import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;

        System.out.println("Estudiante: " + nombre);
        System.out.printf("Promedio: %.2f%n", promedio);

        sc.close();
    }
}
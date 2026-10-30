import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida");
        } else if (edad < 18) {
            System.out.println("Menor de edad");
        } else if (edad < 65) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Adulto mayor");
        }

        sc.close();
    }
}
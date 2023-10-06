import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Ingrese su edad: ");
                edad = scanner.nextInt();

                if (edad > 0) {
                    entradaValida = true;
                } else {
                    System.out.println("La edad debe ser mayor que 0. Inténtelo nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una edad válida (número entero mayor que 0).");
                scanner.nextLine(); 
            }
        }

        System.out.println("Edad ingresada: " + edad);

        scanner.close();
    }
}

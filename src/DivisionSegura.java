import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            double numerador = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double denominador = scanner.nextDouble();

            double resultado = dividir(numerador, denominador);

            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            System.out.println("Error: Se ha producido una excepción.");
        } finally {
            scanner.close();
        }
    }

    public static double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return numerador / denominador;
    }
}

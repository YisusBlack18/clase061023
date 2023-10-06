import java.util.Scanner;

public class AccesoArreglo {
    public static void main(String[] args) {
        int[] arreglo = { 10, 20, 30, 40, 50 };
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un índice para acceder al elemento del arreglo: ");
            int indice = scanner.nextInt();

            int elemento = accederElemento(arreglo, indice);

            System.out.println("Elemento en el índice " + indice + ": " + elemento);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. Ingrese un índice válido.");
        } catch (Exception e) {
            System.out.println("Error: Se ha producido una excepción.");
        } finally {
            scanner.close();
        }
    }

    public static int accederElemento(int[] arreglo, int indice) {
        return arreglo[indice];
    }
}

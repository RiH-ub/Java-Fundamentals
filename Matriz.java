import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int[][] miArray = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        // Llenar la matriz con valores introducidos por el usuario
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[0].length; j++) {
                System.out.print("Introduce un número para la posición [" + i + "][" + j + "]: ");
                miArray[i][j] = scanner.nextInt();
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(Arrays.toString(miArray[i]));
        }

        // Imprimir la diagonal de la matriz
        System.out.println("\nDiagonal:");
        for (int i = 0; i < miArray.length; i++) {
            System.out.print(miArray[i][i] + " ");
        }

        // Encontrar el número mayor y menor de la matriz
        int mayor = miArray[0][0];
        int menor = miArray[0][0];
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[0].length; j++) {
                if (miArray[i][j] > mayor) {
                    mayor = miArray[i][j];
                }
                if (miArray[i][j] < menor) {
                    menor = miArray[i][j];
                }
            }
        }

        // Imprimir el número mayor y menor de la matriz
        System.out.println("\nEl número mayor de la matriz es: " + mayor);
        System.out.println("El número menor de la matriz es: " + menor);
    }
}

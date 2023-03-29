import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        int[][] miArray = new int[3][3];
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

        // Encontrar el número mayor y menor de la matriz
        int maximo = miArray[0][0];
        int minimo = miArray[0][0];
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[0].length; j++) {
                if (miArray[i][j] > maximo) {
                    maximo = miArray[i][j];
                }
                if (miArray[i][j] < minimo) {
                    minimo = miArray[i][j];
                }
            }
        }

        // Imprimir el número mayor y menor de la matriz
        System.out.println("El número mayor de la matriz es: " + maximo);
        System.out.println("El número menor de la matriz es: " + minimo);
    }
}

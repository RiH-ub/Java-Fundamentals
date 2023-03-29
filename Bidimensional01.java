import java.util.Arrays;
import java.util.Random;

public class Bidimensional01 {

    public static void main(String[] args) {
        int[][] miArray = new int[4][4];
        Random rnd = new Random();

        // Llenar la matriz con valores aleatorios
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[0].length; j++) {
                miArray[i][j] = rnd.nextInt(100); // Valores aleatorios del 0 al 99
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

    }
}

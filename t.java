import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimimos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

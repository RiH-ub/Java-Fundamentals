import java.util.Scanner;
public class t {
    public static void main(String[] args) {
        // Creamos una matriz de enteros de 2x3
        int[][] matriz = new int[3][3]; // Aqui se asigna el orden 2x3
        Scanner sc = new Scanner(System.in);

        while (true){
        System.out.print("=> ");    
        int num = sc.nextInt();
        // Asignamos valores a la matriz
        matriz[0][0] = num;
        matriz[0][1] = num;
            
        }
    /*    matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][2] = 0;
     */  
        // Imprimimos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int[] sumasFilas = new int[5];
        int[] sumasColumnas = new int[5];
        
        // Inicializar la matriz con valores aleatorios entre 1 y 10
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        
        // Calcular la suma de los elementos de cada fila y de cada columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumasFilas[i] += matriz[i][j];
                sumasColumnas[j] += matriz[i][j];
            }
        }
        
        // Imprimir la matriz y las sumas de las filas y columnas
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("= " + sumasFilas[i]);
        }
        System.out.println("Sumas de las columnas:");
        for (int i = 0; i < sumasColumnas.length; i++) {
            System.out.print(sumasColumnas[i] + " ");
        }
    }
}

public class Ejercicio3 {

  public static void main(String[] args) {
      
      // Crear matriz de tamaño 3x3
      int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      
      // Imprimir matriz original
      System.out.println("Matriz original:");
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              System.out.print(matriz[i][j] + " ");
          }
          System.out.println();
      }
      
      // Calcular matriz transpuesta
      int[][] transpuesta = new int[3][3];
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              transpuesta[j][i] = matriz[i][j];
          }
      }
      
      // Imprimir matriz transpuesta
      System.out.println("Matriz transpuesta:");
      for (int i = 0; i < transpuesta.length; i++) {
          for (int j = 0; j < transpuesta[i].length; j++) {
              System.out.print(transpuesta[i][j] + " ");
          }
          System.out.println();
      }
  }
}

  
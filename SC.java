import java.util.Scanner;

public class SC{

    public static void main(String [] args) {
        // Introducir letras
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu nombre: "); // Este es input y solo se usa ".print"
        String nombre = sc.nextLine();  // Este se usa para solo letras "Line"

        System.out.println("Hola " + nombre + ", bienvenido"); // Este es print


        // Introducir numeros
        System.out.print("Tu número 1: "); // Este es input y solo se usa ".print"
        int num1 = sc.nextInt(); // Este se usa para solo letras "Int"
        
        System.out.print("Tu número 2: ");
        int num2 = sc.nextInt();

        int resul = num1 + num2; // La formula de la suma
        System.out.println("Tu numero es " + resul ); // Imprime el resultado



        
        sc.close();

    }

}
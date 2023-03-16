//Escribe un programa que pida al usuario ingresar un número y luego imprima
//"Es par" si el número es divisible por 2, y "Es impar" si el número no es divisible
//por 2.
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");

        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    
        sc.close();
    }

}

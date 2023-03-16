//Escribe un programa que pida al usuario ingresar una temperatura en grados
//Celsius y luego imprima la temperatura en grados Fahrenheit. La fórmula para
//convertir de Celsius a Fahrenheit es: F = (9/5) * C + 32.

import java.util.Scanner;

public class Ejercicio3 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 / 5) * celsius + 32;   //Formula del fahrenheit F = (9/5) * C + 32

        System.out.println("La temperatura de " + celsius + " en grados Fahrenheit es: " + fahrenheit);

        sc.close();
    }

}

//Escribe un programa que pida al usuario ingresar dos números y luego imprima:
//"El primer número es mayor" si el primer número es mayor que el segundo, "El segundo número es mayor"
//si el segundo número es mayor que el primero, y "Los números son iguales" si ambos números son iguales.

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer número es mayor");
        } else if (numero2 > numero1) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Los números son iguales");
        }

        sc.close();
    }

}



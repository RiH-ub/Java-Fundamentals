//Escribe un programa que pida al usuario ingresar un año y luego imprima "Es bisiesto" 
//si el año es divisible por 4 y no es divisible por 100, o si es divisible por
//400. Si no cumple con estas condiciones, debe imprimir "No es bisiesto"

import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {   // Cualquier año divisible por 4 es un año bisiesto
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            } else {
                System.out.println("Es bisiesto");
            }
        } else {
            System.out.println("No es bisiesto");
        }

       
        sc.close();
    }

}

/*
Escribe un programa que pida al usuario ingresar dos números y luego imprima:
"El primer número es mayor" si el primer número es mayor que el segundo, "El segundo número es mayor"
si el segundo número es mayor que el primero, y "Los números son iguales" si ambos números son iguales.
*/

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


/*   
Escribe un programa que pida al usuario ingresar un número del 1 al 7
correspondiente a los días de la semana) y luego imprima el nombre del día de la semana correspondiente.
*/
        System.out.print("Ingrese un número del 1 al 7: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Lunes");
        } else if (num == 2) {
            System.out.println("Martes");
        } else if (num == 3) {
            System.out.println("Miercoles");
        } else if (num == 4) {
            System.out.println("Jueves");
        } else if (num == 5) {
            System.out.println("Viernes");
        } else if (num == 6) {
            System.out.println("Sabado");
        } else if (num == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Numero invalido");
        }

        
/*
Escribe un programa que pida al usuario ingresar una temperatura en grados
Celsius y luego imprima la temperatura en grados Fahrenheit. La fórmula para
convertir de Celsius a Fahrenheit es: F = (9/5) * C + 32.
*/
        System.out.print("Ingrese una temperatura en grados Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (9 / 5) * celsius + 32;   //Formula del fahrenheit F = (9/5) * C + 32

        System.out.println("La temperatura de " + celsius + " en grados Fahrenheit es: " + fahrenheit);

 
/*
Escribe un programa que pida al usuario ingresar un número y luego imprima
"Es par" si el número es divisible por 2, y "Es impar" si el número no es divisible
por 2.
*/

        System.out.print("Ingrese un número: ");

        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

/*
Escribe un programa que pida al usuario ingresar un año y luego imprima "Es bisiesto" 
//si el año es divisible por 4 y no es divisible por 100, o si es divisible por
//400. Si no cumple con estas condiciones, debe imprimir "No es bisiesto"
*/
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



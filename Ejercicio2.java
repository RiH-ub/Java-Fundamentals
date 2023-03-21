/*
 Escribir un programa que  muestre en la pantalla la secuencia de Fibonacci hasta el numero 100
 */

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, sum;
        System.out.print(num1 + " ");
        while (num2 <= 100) {
            System.out.print(num2 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    
/*
 Escribir un programa que pida al usuario que ingrese un numero entero y 
 luego muestre en la pantalla la tabla de multiplicar de ese numero hasta el numero 10
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

        sc.close();

    }
}


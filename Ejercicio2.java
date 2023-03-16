//Escribe un programa que pida al usuario ingresar un número del 1 al 7
//correspondiente a los días de la semana) y luego imprima el nombre del día de la semana correspondiente.

import java.util.Scanner;

public class Ejercicio2 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
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

        
        sc.close();
    }

}

import java.util.Scanner;

public class A{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Tu nombre es " + nombre);

        System.out.print("Dime el primer numero:  ");
        int suma1 = sc.nextInt();

        System.out.print("Dime el segundo numero: ");
        int suma2 = sc.nextInt();

        int respuesta = suma1 + suma2;

        System.out.print("Tu respuesta es: " + respuesta );


    }
}
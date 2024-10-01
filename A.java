import java.util.Scanner;

public class A{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre ");
        String nombre = sc.nextLine();

        System.out.println("¿Te llamas: " + nombre + "?, Que buen nombre!");

        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();

        System.out.println("Tu tienes: "+ edad + " años" );
    }
}
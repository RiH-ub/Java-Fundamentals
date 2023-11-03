import java.util.Scanner;

public class A1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu nombre: ");
        String datos = sc.nextLine();
        System.out.println("Tu nombre es: " + datos);

        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tienes " + edad + " años.");
    }
}
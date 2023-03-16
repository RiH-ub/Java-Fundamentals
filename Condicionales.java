import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        int numero = sc.nextInt();

        if (numero >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        sc.close();

    }









}
    
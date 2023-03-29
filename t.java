import java.util.Scanner;
public class t {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime tu nombre: ");
        String nom = sc.nextLine();

        System.out.println("1 sumar ");
        System.out.println("2 restar ");
        System.out.println("3 multiplicar ");
        System.out.println("4 dividir ");

        System.out.print("Escoge una opcion " + nom + ": ");
        int op = sc.nextInt();

        System.out.print("Escoge un numero: ");
        int num = sc.nextInt();

        if (op == 1) {
            sumar(num);
        }
        else if (op == 2) {
            System.out.println("2");
        }
        else {
            System.out.println("Opcion invalida");
            return;
        }
        sc.close();
    }
    static void sumar(int num) {
        for (int i = 1; i <= 9; i++){
            System.out.println(i);
        }
        }

    
}

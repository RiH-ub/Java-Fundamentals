import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1)      Suma         |");
        System.out.println("2)      Resta        |");
        System.out.println("3)  Multiplicación   |");
        System.out.println("4)     División      |");
        
        System.out.println("¿Qué operación desea realizar? ");
        int opcion = sc.nextInt();

        System.out.println("Ingrese el número:");
        int num = sc.nextInt();

        /*System.out.println("Ingrese el segundo número:");
        int num2 = sc.nextInt();

        int resultado;
        String operacion;
        */

        if (opcion == 1) {
            sumar(num);
        }
        else if (opcion == 2) {
            restar(num);
        }
        else if (opcion == 3) {
            multiplicar(num);
        }
        else if (opcion == 4) {
            dividir(num);
        }
        else {
            System.out.println("Opción inválida.");
            return;
        }
        sc.close();

        }
            
    static void sumar(int num) { 
        for (int i = 1; i <= 12; i++) { 
        System.out.println(i + " + " + num + " = " + (i + num)); 
        } 
        }
    static void restar(int num) { 
        for (int i = num; i <= 12 + num; i++) { 
        System.out.println(i + " - " + num + " = " + (i - num)); 
        }
        }
    static void multiplicar(int num) { 
        for (int i = 1; i <= 10; i++) { 
        System.out.println(i + " x " + num + " = " + (i * num)); 
        }
        }
    static void dividir(int num) { 
        for (int i = num; i <= 12 * num; i += num) { 
        System.out.println(i + " / " + num + " = " + (i / num)); 
        }
        }


         
}
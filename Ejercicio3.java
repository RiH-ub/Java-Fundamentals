import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1)      Suma         |");
        System.out.println("2)      Resta        |");
        System.out.println("3)  Multiplicación   |");
        System.out.println("4)     División      |");
        
        System.out.println("¿Qué operación desea realizar? ");
        int opcion = sc.nextInt();

        System.out.println("Ingrese el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = sc.nextInt();

        int resultado;
        String operacion;

        if (opcion == 1) {
            resultado = restar(num1, num2);
            operacion = "Resta";
            
        } else if (opcion == 2) {
            resultado = sumar(num1, num2);
            operacion = "Suma";

        } else if (opcion == 3) {
            resultado = multiplicar(num1, num2);
            operacion = "Multiplicación";

        } else if (opcion == 4) {
            resultado = dividir(num1, num2);
            operacion = "Division";

        } else {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }

    public static int restar(int a, int b) {
        return a - b;
    }    

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
       
    public static int dividir(int a, int b) {
        return a / b;
}


}
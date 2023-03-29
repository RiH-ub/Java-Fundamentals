import java.util.Scanner;

public class T{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("1 Suma");
    System.out.println("2 Resta");
    System.out.println("3 Multiplicacion");
    System.out.println("4 Division");

    System.out.print("Escoge una opcion: ");
    int op = sc.nextInt();

    System.out.print("Escoge un numero: ");
    int num = sc.nextInt();

    if (op == 1){
        sumar(num);
   }
    else if (op == 2){
        restar(num);
    }
    else if (op == 3){
        multiplicar(num);
     }
    else if (op  == 4){
        dividir(num);
    }
    else{
        System.out.println("Opcion no valida");
    }
    sc.close();
    }

    static void sumar(int num){
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " + " + num + " = " + (i + num));
        }
    }
    static void restar(int num){
        for(int i = num; i <= num + 9; i++){
            System.out.println(i + " - " + num + " = " + (i - num));
        }
    }
    static void multiplicar(int num){
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
    static void dividir(int num){
        for(int i = num; i <= num + 9; i++){
            System.out.println(i + " - " + num + " = " + (i - num));
        }
    }

}
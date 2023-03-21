import java.util.Scanner;

public class main {
   public static void main (String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.print("Dime tu nombre crack ");
     String nombre = sc.nextLine();
     System.out.println("Tu nombre es " + nombre );

     System.out.print("Ahora dime tu edad " +nombre+ ": ");
     int edad = sc.nextInt();
     System.out.println("Tu edad es " + edad);

     if (edad < 18){
       System.out.println("Estas joven " + nombre);
     }
     else{
       System.out.println("Estas viejo " + nombre);
     }
     sc.close();
     

   
   }

 }
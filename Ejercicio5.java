import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("Su IMC es: " + imc);
        
        if (imc < 16) {
            System.out.println("Diagnóstico: Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Diagnóstico: Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Diagnóstico: Bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Diagnóstico: Peso normal (saludable)");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Diagnóstico: Sobrepeso (obesidad de grado I)");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Diagnóstico: Sobrepeso crónico (obesidad de grado II)");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Diagnóstico: Obesidad pre mórbida (obesidad de grado III)");
        } else {
            System.out.println("Diagnóstico: Obesidad morbida (obesidad de grado IV)");
        }
    }
}



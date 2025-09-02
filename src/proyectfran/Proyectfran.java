
package proyectfran;

import java.util.Scanner;


public class Proyectfran {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo");    
        int num1;
        int num2;      
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese un segundo numero");
        num2 = scanner.nextInt();
        /*
        OPERACIONES:
        */
        int suma = num1 + num2;
        double resta = (double)num1 - num2;
        int multi = num1 * num2;
        double div = (double)num1 / num2;
        
        System.out.println("la suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("la resta de " + num1 + " y " + num2 + " es: " + resta);
        System.out.println("la multiplicacion de " + num1 + " y " + num2 + " es: " + multi);
        System.out.println("la division de " + num1 + " y " + num2 + " es: " + div);
        System.out.println("FIN DEL PROGRAMA");
        
    } 
}

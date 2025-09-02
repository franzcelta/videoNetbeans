
package proyectfran;

import java.util.Scanner;


public class Proyectfran {

    public static void main(String[] args) { 
        
        System.out.println("Bienvenido, introduce tu nombre porfavor.");
        
        String nombre;
        int edad;
        
        Scanner scanner = new Scanner(System.in);
        
        nombre = scanner.nextLine();
        
        System.out.println("Genial!, Bienvenido " + nombre + "!");
        
        System.out.println("Ahora dime tu edad porfavor.");
        
        edad = scanner.nextInt();
        
        System.out.println("Genial, " + nombre + ", tienes " + edad + " anios!"); 
        
        
    } 
}

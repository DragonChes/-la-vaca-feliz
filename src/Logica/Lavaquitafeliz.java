/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class Lavaquitafeliz {
    static Scanner Leer = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contenedor = 0;
        do{
        System.out.println("----------------------------------------");
        System.out.println("|           LA VAQUITA FELIZ           |");
        System.out.println("----------------------------------------");
        System.out.println("Ingrese una opcion (1-5) luego presione ");
        System.out.println("La tecla entrer");
        System.out.println(" ");
        System.out.println("1. Gestion de Vacas");
        System.out.println("2. Gestion de Alimentos");
        System.out.println("3. Registro de Alimentacion");
        System.out.println("4. Registro de Produccion");
        System.out.println("5. Salir");
        System.out.println("----------------------------------------");
        System.out.println(" ");
        System.out.print("opcion: ");
        contenedor = Leer.nextInt();
        
        switch (contenedor) {
                 case 1 : ;
                               break;
                 case 2 :; 
                               break; 
                 case 3 : ;  
                               break;
                 case 4 : ;  
                               break;
                 case 5 : ;   
                               break;
                 
             }  
             if (contenedor < 0){
                 System.exit(0);
             }
         } while ( contenedor < 5 );
    }
    
}

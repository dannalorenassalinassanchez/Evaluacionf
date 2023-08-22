/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Punto1 {
     public static void main (String []args){
        Scanner sc= new Scanner (System.in);
        ArrayList<String> nombres=new ArrayList<String>();
        
        System.out.println("Primer companero:" );
        String nombre1=sc.nextLine();
        nombres.add(nombre1);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Segundo companero" );
        String nombre2=sc.nextLine();
        nombres.add(nombre2);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Tercer companero" );
        String nombre3=sc.nextLine();
        nombres.add(nombre3);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Cuarto companero" );
        String nombre4=sc.nextLine();
        nombres.add(nombre4);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Quinto companero" );
        String nombre5=sc.nextLine();
        nombres.add(nombre5);
         System.out.println("-----------------------------------------------");
         
        System.out.println("Sexto companero" );
        String nombre6=sc.nextLine();
        nombres.add(nombre6);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Nombres"+ nombres.toString());
        for (int i=0; i<nombres.size();i++){
            System.out.println("Nombre "+ nombres.get(i));
        }
}
}

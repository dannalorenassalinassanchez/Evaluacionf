/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos;

/**
 *
 * @author 503
 */
public class Punto2 {
    public static void main (String[]args){
    int [][] edades = {
        {23, 31, 52}, {22, 27, 52}, {19, 43, 60}
    };
    System.out.println("Tamaño de la matriz es:"+edades.length);
    System.out.println("-----------------------------------------------");
    
       for (int i= 0; i<edades.length; i++){
                for(int j = 0; j<edades[i].length; j++){
                    System.out.print(edades[i][j]+"\t");
                }
                System.out.println();
            } 
    
    }
}

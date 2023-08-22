/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos;

/**
 *
 * @author 503
 */
public class PuntoTresCuatroYCinco {
    public static void main(String[] args) {
       
        String[][] jugadores = {
            {"Jugador 1", "Juan", "15 anios", "Delantero"},
            {"Jugador 2", "Pedro", "16 anios", "Defensa"},
            {"Jugador 3", "Luis", "17 anios", "Arquero"}
        };

        System.out.println("Tamaño de la matriz es:"+jugadores.length);
        System.out.println("-----------------------------------------------");
        System.out.println("#Jugador\tNombre\tEdad\tPosicio"
                + "n");
        System.out.println("-----------------------------------------------");
        
        
        for (int i = 0; i < jugadores.length; i++) {
            System.out.print(jugadores[i][0] + "\t");  
            for (int j = 1; j < jugadores[i].length; j++) {
                System.out.print(jugadores[i][j] + "\t");  
            }
            System.out.println(); 
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Posicion del arquero es[2][2]:"+jugadores[2][2]);
        System.out.println("-----------------------------------------------");
        System.out.println("Posicion de 16 anios es[1][1]:"+jugadores[1][1]);
    }
}


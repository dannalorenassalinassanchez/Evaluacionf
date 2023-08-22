/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntos;

import java.util.Scanner;


/**
 *
 * @author 503
 */
public class PuntoSeisYSiete {
    
        public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int[] numeros = new int[7];
        int contador = 0;

        do {
            System.out.print("Ingresa un numero: ");
            int numero = lea.nextInt();
            numeros[contador] = numero;
            contador++;
        } while (contador < 7);

        System.out.println("Numeros ingresados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}

    


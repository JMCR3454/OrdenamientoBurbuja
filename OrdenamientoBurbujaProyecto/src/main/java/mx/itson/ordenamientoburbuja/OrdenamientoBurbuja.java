/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mx.itson.ordenamientoburbuja;

import java.util.Scanner;


public class OrdenamientoBurbuja {

        

// Método para realizar el ordenamiento burbuja
    public static void ordenamientoBurbuja (int[] calificaciones) {
        int n = calificaciones.length;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                   
                    // Intercambia el elemento actual si es mayor que el siguiente
                    int temp = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la cantidad total de calificaciones para los alumnos
        System.out.print("Ingrese la cantidad de  alumnos en la clase: ");
        int n = scanner.nextInt();

        // Crear el array para las calificaciones
        int[] calificaciones = new int[n];

        // Ingresa las calificaciones de los alumnos
        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }
   
        // Muestra la lista de calificaciones sin ordenar
        System.out.print("Lista de calificaciones sin ordenar: ");
        for (int calificacion : calificaciones) {
            System.out.print(calificacion + " "); // Imprimir cada calificación en la lista                                                                                                                             Le voy a decir a la Fiscalia
        }
       
        // Ordena las calificaciones usando el método de ordenamiento burbuja
        ordenamientoBurbuja(calificaciones);

     
        System.out.println(); // Salto de linea para mostrar las calificaciones ordenadas
        
        
        // Imprime la lista de calficaciones ordenada 
        System.out.print("Lista de calificaciones ordenada: ");
        for (int calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
    }
}
    


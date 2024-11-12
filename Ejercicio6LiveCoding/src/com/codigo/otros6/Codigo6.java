package com.codigo.otros6;
//Este programa genera un arreglo de 20 números aleatorios entre 20 y 400 y permite al usuario seleccionar si desea resaltar los múltiplos de 5 o los múltiplos de 7. Los números resaltados se mostrarán entre corchetes.

import java.util.Scanner;

public class Codigo6 {
	 public static void main(String[] args) {
	        int[] n = new int[20]; // Declaración correcta del arreglo de enteros

	        // Generar y mostrar los 20 números aleatorios entre 20 y 400
	        for (int i = 0; i < 20; i++) {
	            n[i] = (int)(Math.random() * 381) + 20; // Generación de números en el rango [20, 400]
	            System.out.print(n[i] + " ");
	        }
	        
	        Scanner scanner = new Scanner(System.in); // Inicialización del Scanner para entrada de usuario
	        System.out.println("\n¿Qué números quiere resaltar?");
	        System.out.print("(1 –> los múltiplos de 5, 2 –> los múltiplos de 7): ");
	        
	        // Lectura de la opción del usuario y manejo de errores
	        int opcion;
	        try {
	            opcion = Integer.parseInt(scanner.nextLine());
	        } catch (NumberFormatException e) {
	            System.out.println("Opción inválida.");
	            scanner.close();
	            return;
	        }

	        // Determinar el múltiplo según la opción elegida
	        int multiplo = (opcion == 1) ? 5 : 7;

	        // Mostrar los números resaltados según la opción del usuario
	        for (int e : n) { // Cambiado `foreach` por `for-each` para iterar sobre el arreglo
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] "); // Resaltar múltiplos en corchetes
	            } else {
	                System.out.print(e + " ");
	            }
	        }

	        scanner.close(); // Cerrar el scanner
	    }
}

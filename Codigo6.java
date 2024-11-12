package com.generation;

import java.util.Scanner;

public class Codigo6 {
	public static void main(String[] args) {
		//Declaración de un nuevo array 
		int[] n = new int[20];
		
		//Se corrigió el incremento i++
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " ");
	    }
	    
	    //Se corrigió printl a println
	    //Se añadió un Scanner para que usuario pudiera seleccionar una de las opciones disponibles
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = scanner.nextInt();

	    //Se cambió el orden de los operadores ternarios
	    int multiplo = (opcion == 1) ? 5 : 7;

	    for(int e : n) {
	      if (e % multiplo == 0) {
	        System.out.println("[" + e + "] ");
	      }else {
	    	//Se cambió el in por out
	        System.out.println(e + " ");
	      }
	    }
	}
}

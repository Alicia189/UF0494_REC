/**
 * 
 */
package uf2178;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class Ppal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Año de compra del vehiculo ");
		int año = entrada.nextInt();
		
		Funciones.calculaCosteTotal(año);
		
		int costes[] = new int[6];
	
		
		System.out.println("Introduce vector:");
		Funciones.pedir_vector(costes);
		

	}
		
		
		
		
	}
	
}

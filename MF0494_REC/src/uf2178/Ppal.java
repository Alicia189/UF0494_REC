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
		
		System.out.println("A�o de compra del vehiculo ");
		int a�o = entrada.nextInt();
		
		Funciones.calculaCosteTotal(a�o);
		
		int costes[] = new int[6];
	
		
		System.out.println("Introduce vector:");
		Funciones.pedir_vector(costes);
		

	}
		
		
		
		
	}
	
}

package uf2178;

import java.util.Scanner;

public class Funciones {
	
	/** 
	 * Método de la clase que pide un vector por teclado
	 * @param v int[] el vector a introducir por teclado
	 */
	public static void  pedir_vector(int v[]) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < v.length; i++) {
			System.out.printf("Introduce el elemento %d: ", i);
			v[i] = entrada.nextInt();
		}
	}
	
	/**
	 * Método para mostrar por pantalla el vector pasado como parámetro
	 * @param v int [] el vector a mostrar en pantalla
	 */
	public static void  mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d ", v[i]);
		}
		System.out.println();
	}
	
	// Escribe las sentencias de los apartados 1 y 2
	public static void VehiculoAfectadoAirbag (int año) {
	

	
	Object VehiculoAfectadoAirbag;
	if (año < 2000  ) {
		VehiculoAfectadoAirbag = null;
	} else if  (año < 2005 &&  año >= 2000) {
		VehiculoAfectadoAirbag = "Los vehiculos de la marca Seat y Opel afectados";
	} else if ( año < 2015 && año  >= 2006) {
		VehiculoAfectadoAirbag = "Los vehiculos de marca Reanult estan afectados";
	} else if (año >= 2016) {
		VehiculoAfectadoAirbag  = "Consulta en la web de la DGT";
	}

}
	
	public static void calculaCosteTotal(int costes[]) {
		for (int i = 0; i < CalculaCosteTotal.length; i++) {
			for (int i=0, i< v.lenght; i++)
			v [i]= v[i]+ 
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}


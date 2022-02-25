package uf2181;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FuncionesAuxiliaresTest {

	
	@Test
	void calculoNivelMaxCO2Test() {
		FuncionesAuxiliaresTest funciones = new FuncionesAuxiliaresTest();
		
		assertEquals(1952, funciones.calculoNivelMaxCO2("0.05 de volumen de CO2", true));
		assertEquals(1988, funciones.calculoNivelMaxCO2("0.035 de volumen de CO2", true));
		assertThrows (ArithemeticExcepcion.class,()-> funciones.calculoNivelMaxCO2Test(año < (1950));
	
	}
	@Test
	void devuelveEmisionesCuadrado() {
		Funciones funcionesDevuelveEmisionesCuadrado = new FuncionesDevuelveEmisionesCuadrado();
		doble cuadrado [] = {};
	
		assertEquals(, funciones.devuelveEmisionesCuadrado());
		
	
	

}

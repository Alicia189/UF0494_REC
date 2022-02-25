package uf2181;
/**
 * 
 * @author Alicia
 * Crea funciones Auxiliares
 */
public class FuncionesAuxiliares {
	/**
	 * Calculo nivel maximo de CO2
	 * @param año double año de adquisicion del vehiculo
	 * @return res 
	 */
		
		
		public double calculoNivelMaxCO2 (int año) {
			double res = 0.035;
			if (año<1950) {
				throw new ArithmeticException("Normativa inexistente");
			} else if (año<1986) {
				res=0.05;
			}
			return res;
		}
		/**
		 * Funcion que devuelve emisiones al cuadrado
		 * @param emisiones double 
		 * @return devuelve las emisiones al cuadrado
		 */
		
		public double[] devuelveEmisionesCuadrado (double [] emisiones) {
			double cuadrado[] = new double[emisiones.length];
			
			for (int i = 0; i < emisiones.length; i++) {
				cuadrado[i] =emisiones[i]*emisiones[i];
			}
			return cuadrado;
		}
		
		
}

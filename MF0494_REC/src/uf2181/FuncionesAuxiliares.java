package uf2181;

public class FuncionesAuxiliares {
		
		
		public double calculoNivelMaxCO2 (int a�o) {
			double res = 0.35;
			if (a�o<1950) {
				throw new ArithmeticException("Normativa inexistente");
			} else if (a�o<1986) {
				res=0.05;
			}
			return res;
		}
		
		
		public double[] devuelveEmisionesCuadrado (double [] emisiones) {
			double cuadrado[] = new double[emisiones.length];
			
			for (int i = 0; i < emisiones.length; i++) {
				cuadrado[i] =emisiones[i]*emisiones[i];
			}
			return cuadrado;
		}
		
		
}

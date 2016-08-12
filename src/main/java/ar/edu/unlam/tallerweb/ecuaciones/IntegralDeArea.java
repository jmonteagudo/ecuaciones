package ar.edu.unlam.tallerweb.ecuaciones;

/**
 * Representa la abstracción del cálculo de la integral bajo
 * la curva proporcionada.
 *
 */
public class IntegralDeArea {

	/**
	 * Calcula el área bajo la curva, utilizando el método de las sumas
	 * de Riemann entre los dos puntos dados.
	 *
	 * @param ecuacion
	 * @param inicio
	 * @param fin
	 * @param incremento
	 * @return el área bajo la curva
	 */
	public Double calcular(Ecuacion ecuacion, Double inicio,
			Double fin, Double incremento) {
		
		double resultado = 0D;
		for(double i = inicio; i<=fin; i=i+incremento){
			resultado = ((ecuacion.resolver(i)) * (i - (i-incremento)));
		}

		return resultado;

	}

}

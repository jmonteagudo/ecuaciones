package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.List;

/**
 * Representa una ecuación polinómica del tipo
 * f(x) = n + (n-1) × x + (n-2) × x^2 + ...
 *
 */
public class EcuacionPolinomica implements Ecuacion {
	
	List<Double> coeficientes;

	/**
	 * Constructor parametrizado
	 *
	 * @param coeficientes siendo coeficientes[0] el valor que
	 * corresponde al término independiente.
	 *
	 * e.g.
	 *
	 * f(x) = coeficientes[0]
	 * 		+ coeficientes[1] × x
	 * 		+ coeficientes[2] × x^2
	 * 		+ ...
	 *
	 * coeficientes = [1, 0, 2, 1, -1]
	 * f(x) = 1 × x^0 + 0 × x^1 + 2 × x^2 + 1 × x^3 - 1 × x^4
	 *
	 */
	public EcuacionPolinomica(List<Double> coeficientes) {

		//throw new RuntimeException("No implementado");
		this.coeficientes = coeficientes;

	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {

		double resultado = 0D;
		// El primer valor de la lista es el coeficiente independiete y no se multiplica por ning�n x
		resultado  = coeficientes.get(0);
		
		for(int i=1; i<coeficientes.size(); i++){
			double potencia = x;
			for(int j=1; j<i; j++){
				potencia *= x;
			}
			resultado += coeficientes.get(i) * potencia;
		}
		return resultado;
	}
	
}

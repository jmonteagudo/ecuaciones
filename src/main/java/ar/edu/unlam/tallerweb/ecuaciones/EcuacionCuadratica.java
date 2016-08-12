package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ecuación cuadrática del tipo
 * f(x) = a × x^2 + b × x + c
 *
 */
public class EcuacionCuadratica implements Ecuacion {
	
	EcuacionPolinomica cuadratica;

	/**
	 * Constructor parametrizado
	 *
	 * @param a
	 * @param b
	 * @param c
	 *
	 */
	public EcuacionCuadratica(Double a, Double b, Double c) {
		
		List<Double> coeficientes = new ArrayList<Double>();
		
		coeficientes.add(c);
		coeficientes.add(b);
		coeficientes.add(a);
		
		cuadratica = new EcuacionPolinomica(coeficientes);

	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {
		
		return (cuadratica.resolver(x));

	}

}

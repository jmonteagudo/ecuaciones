package ar.edu.unlam.tallerweb.ecuaciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ecuación lineal del tipo f(x) = m × x + b
 *
 */
public class EcuacionLineal implements Ecuacion {
	
	/*private double m;
	private double b;*/
	
	EcuacionPolinomica lineal;

	/**
	 * Constructor parametrizado
	 *
	 * @param m la pendiente
	 * @param b la ordenada al orígen
	 *
	 */
	public EcuacionLineal(Double m, Double b) {

		//throw new RuntimeException("No implementado");
		/*this.m = m;
		this.b = b;*/
		
		List<Double> coeficientes = new ArrayList<Double>();
		
		coeficientes.add(b);
		coeficientes.add(m);
		
		lineal = new EcuacionPolinomica(coeficientes);
		
		

	}

	/**
	 * Devuelve el resultado de evaluar f(x)
	 *
	 * @param x la variable
	 *
	 */
	public Double resolver(Double x) {

		//throw new RuntimeException("No implementado");
		return(lineal.resolver(x));

	}

}

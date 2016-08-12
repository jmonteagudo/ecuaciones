package ar.edu.unlam.tallerweb.ecuaciones;


import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

//import org.junit.Assert;
import org.junit.Test;

/**
 * Agregue los tests que considere necesarios. Se proporciona un test
 * a modo de testigo.
 *
 */
public class EcuacionTest {
	
	@Test
	public void testEcuacionLinealConXCero(){
		double m = 6D;
		double b = 5;
		
		EcuacionLineal lineal = new EcuacionLineal(m, b);
		double resultado = lineal.resolver(0D);
		
		Assert.assertEquals(5D, resultado);
	}
	
	@Test
	public void testEcuacionLinealConXDistintoDeCero(){
		double m = 6D;
		double b = 5;
		
		EcuacionLineal lineal = new EcuacionLineal(m, b);
		double resultado = lineal.resolver(1D);
		
		Assert.assertEquals(11D, resultado);
	}
	
	@Test
	public void testEcuacionCuadraticaConXCero(){
		double a = 9.5D;
		double b = 10.6D;
		double c = 75D;
		
		EcuacionCuadratica cuadratica = new EcuacionCuadratica(a, b, c);
		double resultado = cuadratica.resolver(0D);
		Assert.assertEquals(75D, resultado);
		
	}
	
	@Test
	public void testEcuacionCuadraticaConValores(){
		double a = 9.5D;
		double b = 10.6D;
		double c = 75D;
		
		EcuacionCuadratica cuadratica = new EcuacionCuadratica(a, b, c);
		double resultado = cuadratica.resolver(20D);
		Assert.assertEquals(4087D, resultado);
		
	}

	@Test
	public void testEcuacionnPolinomicaDeUnCoeficiente() {
		List<Double> coeficientes = new ArrayList<Double>();
		coeficientes.add(5D);	
		EcuacionPolinomica unCoeficiente = new EcuacionPolinomica(coeficientes);
		Double resultado = unCoeficiente.resolver(4D);

		Assert.assertEquals(5D, resultado);
	}

	@Test
	public void testEcuacionnPolinomicaDeDosCoeficientes() {
		List<Double> coeficientes = new ArrayList<Double>();
		coeficientes.add(5D);
		coeficientes.add(10D);
		EcuacionPolinomica unCoeficiente = new EcuacionPolinomica(coeficientes);
		Double resultado = unCoeficiente.resolver(4D);

		Assert.assertEquals(45D, resultado);
	}
	
	@Test
	public void testEcuacionnPolinomicaDeXNegativa() {
		List<Double> coeficientes = new ArrayList<Double>();
		coeficientes.add(5D);
		coeficientes.add(2.5D);
		coeficientes.add(89.1D);
		EcuacionPolinomica unCoeficiente = new EcuacionPolinomica(coeficientes);
		Double resultado = unCoeficiente.resolver(-5.4D);

		Assert.assertEquals(2589.656D, resultado);
	}
}

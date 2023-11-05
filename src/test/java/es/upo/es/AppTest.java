package es.upo.es;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void pruebaToString() {
		int edad = 48;
		String cadEdad = "48";
		String edadConvertida = Integer.toString(edad);
        Assert.assertEquals(cadEdad, edadConvertida);
	}
	
	public static void pruebaMax() {
		int n1 = 20;
		int n2 = 30;
		int valorCorrecto = 30;
		int max = Integer.max(n1, n2);
		Assert.assertEquals(valorCorrecto, max);
	}
		
    /**
     * Rigorous Test :-)
     */
    @Test
    public void iniciar()
    {
    	pruebaToString();
    	pruebaMax();
    	
    }

    
}

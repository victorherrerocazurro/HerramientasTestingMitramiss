package com.curso.sonarqube;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class HolaMundoTest {

	//Datos de prueba
	
	//	-In
	private String nombre;
	//	-Entorno
	
	//	-Resultado esperado
	private String resultadoEsperadoSaludar;
	private String resultadoEsperadoDespedir;
	
	@Parameters(name= "Cuando saludamos a {0} obtenemos {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { 
        	{ "Victor", "Hola VICTOR", "Adios VICTOR" }, 
        	{ "Maria", "Hola MARIA", "Adios MARIA" }});
    }

	public HolaMundoTest(String nombre, String resultadoEsperado, String resultadoEsperadoDespedir) {
		super();
		this.nombre = nombre;
		this.resultadoEsperadoSaludar = resultadoEsperado;
		this.resultadoEsperadoDespedir = resultadoEsperadoDespedir;
	}

	@Test
	public void testSaludar() {
		
		//SUT
		HolaMundo sut = new HolaMundo();
		
		//Realizar la prueba
		String resultadoObtenido = sut.saludar(nombre);

		//Asertos
		assertEquals(resultadoEsperadoSaludar, resultadoObtenido);		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDespedir() {
		
		//SUT
		HolaMundo sut = new HolaMundo();
		
		//Realizar la prueba
		String resultadoObtenido = sut.despedir(nombre);

		//Asertos
		assertEquals(resultadoEsperadoDespedir, resultadoObtenido);		
		
		//fail("Not yet implemented");
	}

}

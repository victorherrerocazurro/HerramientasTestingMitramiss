package com.curso.sonarqube;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HolaMundoTest {

	@Mock
	private Prefijos prefijos;

	@Before
	public void init() {
		Mockito.when(prefijos.saludar()).thenReturn("Hola ");
		//Mockito.when(prefijos.despedir()).thenReturn("Adios ");
	}
	
	@Test
	public void testSaludar() {
		//Datos de prueba
		
		//	-In
		String nombre = "Victor";
		//	-Entorno
		
		//	-Resultado esperado
		String resultadoEsperado = "Hola VICTOR";
		
		//SUT
		HolaMundo sut = new HolaMundo(prefijos);
		
		
		//Realizar la prueba
		String resultadoObtenido = sut.saludar(nombre);

		//Asertos
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		Mockito.verify(prefijos, Mockito.atLeastOnce()).saludar();
		
		//Mockito.verify(prefijos, Mockito.atLeastOnce()).despedir();
		
	}

}

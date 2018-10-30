package com.curso.sonarqube;

import static org.junit.Assert.*;

import org.junit.Test;

public class HolaMundoNullPointer {

	@Test(expected=NullPointerException.class)
	public void test() {
		//Datos de prueba
		
		//	-In
		String nombre = null;
		
		// SUT
		HolaMundo sut = new HolaMundo();

		// Realizar la prueba
		String resultadoObtenido = sut.saludar(nombre);

	}

}

package com.curso.sonarqube;

public class HolaMundo {
	
	private Prefijos prefijo;

	public HolaMundo(Prefijos prefijo) {
		super();
		this.prefijo = prefijo;
	}
	
	public void setPrefijo(Prefijos prefijo) {
		this.prefijo = prefijo;
	}

	public String saludar(String nombre) {
		return prefijo.saludar() + nombre.toUpperCase();
	}
	
	public String despedir(String nombre) {
		return prefijo.despedir() + nombre.toUpperCase();
	}

}

package com.curso.sonarqube;

public class HolaMundo {
	
	private String prefijoSaludar = Prefijos.saludar();
	private String prefijoDespedir = Prefijos.despedir();

	public String saludar(String nombre) {
		return prefijoSaludar + nombre.toUpperCase();
	}
	
	public String despedir(String nombre) {
		return prefijoDespedir + nombre.toUpperCase();
	}

}

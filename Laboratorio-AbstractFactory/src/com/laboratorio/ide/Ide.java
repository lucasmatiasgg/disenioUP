package com.laboratorio.ide;

public class Ide {
	private String nombre;
	private String version;
	
	public Ide() {
	}
	public Ide(String nombre, String version) {
		this.nombre = nombre;
		this.version = version;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String toString() {
		return "Nombre del IDE: " + getNombre() + " Version: " + getVersion();
	}
	
}

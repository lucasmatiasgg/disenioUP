package com.laboratorio.sistemaOperativo;

public class SistemaOperativo {
	private String name;
	private String version;
	private int anio;
	
	public SistemaOperativo() {
	}

	public SistemaOperativo(String name, String version, int anio) {
		this.name = name;
		this.version = version;
		this.anio = anio;
	}
	
	public String toString() {
		return ("Nombre del SO: " + getName() + " Version: " + getVersion() + " Año: " + getAnio());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}

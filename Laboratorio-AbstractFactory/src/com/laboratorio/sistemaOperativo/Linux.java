package com.laboratorio.sistemaOperativo;

public class Linux extends SistemaOperativo{
	public Linux() {	
		super();
	}
	
	public Linux(String name, String version, int anio) {
		super(name, version, anio);
	}
	
	/*
	public String toString() {
		return ("Nombre del SO: " + getName() + " Version: " + getVersion() + " Año: " + getAnio());
	}*/
}

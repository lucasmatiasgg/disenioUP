package com.laboratorio.lenguaje;

public class Lenguaje {
	private String name;
	private String version;
	
	public Lenguaje() {
	}
	
	public Lenguaje(String name, String version) {
		this.name = name;
		this.version = version;
	}

	public String toString() {
		return("Lenguaje: " + getName()+ " Version: "+ getVersion());
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
	
	
}

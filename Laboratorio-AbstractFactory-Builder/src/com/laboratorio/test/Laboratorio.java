package com.laboratorio.test;

import com.laboratorio.factory.LaboratorioAbsFactory;
import com.laboratorio.ide.Ide;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.SistemaOperativo;

public class Laboratorio {

	private String name;
	private Lenguaje lenguaje;
	private SistemaOperativo so;
	private Ide ide;
	
	public Laboratorio(Lenguaje lenguaje, SistemaOperativo so, Ide ide) {
		this.lenguaje = lenguaje;
		this.so = so;
		this.ide = ide;
	}
	
	public String toString() {
		return(name + "\n" + lenguaje + "\n" + so + "\n" + ide);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

package com.laboratorio.factory;
import com.laboratorio.ide.Ide;
import com.laboratorio.ide.Idea;
import com.laboratorio.lenguaje.Java;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.SistemaOperativo;
import com.laboratorio.sistemaOperativo.Windows;

public class LabDisenioFactory implements LaboratorioAbsFactory{
	
	private static LabDisenioFactory instance;
	
	private LabDisenioFactory() {
	}
	
	@Override
	public Lenguaje crearLenguaje(String nombre, String version) {
		return new Java(nombre, version);
	}

	@Override
	public SistemaOperativo crearSO(String nombre, String version, int anio) {
		return new Windows(nombre, version, anio);
	}
	
	@Override
	public Ide crearIde(String nombre, String version) {
		return new Idea(nombre, version);
	}
	
	public static LabDisenioFactory getInstance() {
		if(instance == null) {
			return new LabDisenioFactory();
		}
		return instance;
	}
	
}

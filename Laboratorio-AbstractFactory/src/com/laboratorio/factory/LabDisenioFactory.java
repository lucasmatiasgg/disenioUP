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
	public Lenguaje crearLenguaje(Lenguaje java) {
		return new Java(java.getName(), java.getVersion());
	}

	@Override
	public SistemaOperativo crearSO(SistemaOperativo so) {
		return new Windows(so.getName(), so.getVersion(), so.getAnio());
	}
	
	@Override
	public Ide crearIde() {
		return new Idea();
	}
	
	public static LabDisenioFactory getInstance() {
		if(instance == null) {
			return new LabDisenioFactory();
		}
		return instance;
	}
	
}

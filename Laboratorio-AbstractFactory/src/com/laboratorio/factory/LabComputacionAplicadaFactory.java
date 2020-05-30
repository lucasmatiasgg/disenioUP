package com.laboratorio.factory;
import com.laboratorio.ide.Codeblocks;
import com.laboratorio.ide.Ide;
import com.laboratorio.lenguaje.C;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.Linux;
import com.laboratorio.sistemaOperativo.SistemaOperativo;

public class LabComputacionAplicadaFactory implements LaboratorioAbsFactory{

	private static LabComputacionAplicadaFactory instance;
	
	@Override
	public Lenguaje crearLenguaje(String nombre, String version) {
		return new C(nombre, version);
	}

	@Override
	public SistemaOperativo crearSO(String nombre, String version, int anio) {
		return new Linux(nombre, version, anio);
	}

	@Override
	public Ide crearIde(String nombre, String version) {
		return new Codeblocks(nombre, version);
	}
	
	public static LabComputacionAplicadaFactory getInstance() {
		if(instance == null) {
			return new LabComputacionAplicadaFactory();
		}
		return instance;
	}

}

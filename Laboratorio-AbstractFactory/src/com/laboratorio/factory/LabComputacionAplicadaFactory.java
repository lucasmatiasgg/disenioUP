package com.laboratorio.factory;
import com.laboratorio.ide.Codeblocks;
import com.laboratorio.ide.Ide;
import com.laboratorio.lenguaje.C;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.Linux;
import com.laboratorio.sistemaOperativo.SistemaOperativo;

public class LabComputacionAplicadaFactory implements LaboratorioAbsFactory{

	@Override
	public Lenguaje crearLenguaje(Lenguaje c) {
		return new C(c.getName(), c.getVersion());
	}

	@Override
	public SistemaOperativo crearSO(SistemaOperativo so) {
		return new Linux(so.getName(), so.getVersion(), so.getAnio());
	}

	@Override
	public Ide crearIde() {
		return new Codeblocks();
	}

}

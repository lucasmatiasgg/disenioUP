package com.laboratorio.factory;
import com.laboratorio.ide.Ide;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.SistemaOperativo;

public interface LaboratorioAbsFactory {

		public Lenguaje crearLenguaje(Lenguaje lenguaje);
		public SistemaOperativo crearSO(SistemaOperativo so);
		public Ide crearIde();
}

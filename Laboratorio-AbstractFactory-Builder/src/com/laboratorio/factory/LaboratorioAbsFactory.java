package com.laboratorio.factory;
import com.laboratorio.ide.Ide;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.SistemaOperativo;

public interface LaboratorioAbsFactory {

		public Lenguaje crearLenguaje(String nombre, String version);
		public SistemaOperativo crearSO(String nombre, String version, int anio);
		public Ide crearIde(String nombre, String version);
}

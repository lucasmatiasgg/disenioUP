package com.laboratorio.test;

import com.laboratorio.factory.LabComputacionAplicadaFactory;
import com.laboratorio.factory.LabDisenioFactory;
import com.laboratorio.ide.Ide;
import com.laboratorio.ide.IdeaBuilder;
import com.laboratorio.lenguaje.C;
import com.laboratorio.lenguaje.Java;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.Linux;
import com.laboratorio.sistemaOperativo.SistemaOperativo;
import com.laboratorio.sistemaOperativo.Windows;

public class Test {

	public static void main(String[] args) {
		Lenguaje java = new Java("Java", "8");
		Lenguaje c = new C("C", "4.5");
		SistemaOperativo win = new Windows("Windows", "7", 2015);
		SistemaOperativo linux = new Linux("Linux", "2", 2010);
		
		Ide idea = new IdeaBuilder().addNombre("Eclipse Luna")
									.addVersion("2020-03")
									.build();
	
		
		
		LabDisenioFactory labDisenio = LabDisenioFactory.getInstance();
		LabComputacionAplicadaFactory labComputacion = LabComputacionAplicadaFactory.getInstance();
		
		
		Laboratorio aulaDisenio = new Laboratorio(labDisenio.crearLenguaje(java.getName(),java.getVersion()), 
													labDisenio.crearSO(win.getName(), win.getVersion(), win.getAnio()),
													labDisenio.crearIde(idea.getNombre(), idea.getVersion()));		
		aulaDisenio.setName("Laboratorio de Diseño");
		
		
		Laboratorio aulaComputacion = new Laboratorio(labComputacion.crearLenguaje(c.getName(), c.getVersion()),
													labComputacion.crearSO(linux.getName(), linux.getVersion(), linux.getAnio()),
													labComputacion.crearIde("Codeblocks", "2.0"));		
		aulaComputacion.setName("Aula de computacion aplicada");
		
		
		System.out.println(aulaDisenio);
		System.out.println("=========================");
		System.out.println(aulaComputacion);
	}

}

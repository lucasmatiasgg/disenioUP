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
		
		
		Laboratorio aulaDisenio = new Laboratorio(labDisenio, java, win, idea);
		aulaDisenio.setName("Laboratorio de Diseño");
		System.out.println(aulaDisenio);
		
		Laboratorio aulaComputacion = new Laboratorio(labComputacion, c, linux, idea);
		aulaComputacion.setName("Aula de computacion aplicada");
		System.out.println(aulaComputacion);
	}

}

package com.laboratorio.test;

import com.laboratorio.factory.LabDisenioFactory;
import com.laboratorio.lenguaje.Java;
import com.laboratorio.lenguaje.Lenguaje;
import com.laboratorio.sistemaOperativo.SistemaOperativo;

public class Test {

	public static void main(String[] args) {
		
		LabDisenioFactory labDisenio = LabDisenioFactory.getInstance();
		Lenguaje java = new Java("Java", "8");
		SistemaOperativo so = new SistemaOperativo("Windows", "7", 2015);
		labDisenio.crearLenguaje(java);
		labDisenio.crearSO(so);
		
	}

}

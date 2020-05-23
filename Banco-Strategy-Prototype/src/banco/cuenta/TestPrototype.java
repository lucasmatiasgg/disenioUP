package banco.cuenta;

import banco.paquete.Gold;
import banco.tarjetas.Tarjeta;

public class TestPrototype {

	public static void main(String[] args) {
		CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(0);
		
		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setCodigoSeguridad(987);
		tarjeta.setMarca("Visa");
		tarjeta.setNumero("1111222233334444");
		tarjeta.setTitular("Pepe");
		
		Gold paqueteGold = new Gold();	
		paqueteGold.setCajaAhorro(ca);
		paqueteGold.setTarjeta(tarjeta);
		paqueteGold.setTitular("Pepe");
		
		
	
		Gold paqueteDeJuan = paqueteGold.clone();
		paqueteDeJuan.setTitular("Juan");
		
		
		//Cambio atributos del primer paquete para testear las referencias del clonado.
		paqueteGold.getCajaAhorro().setSaldo(1900);
		paqueteGold.setTitular("NuevoTitutar");
		
		
		
		System.out.println(paqueteGold);
		System.out.println("\n------------------------------------\n");
		System.out.println(paqueteDeJuan);
	}

}

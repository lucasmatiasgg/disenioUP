package banco.cuenta;

import banco.paquete.Gold;
import banco.tarjetas.Tarjeta;

public class TestPrototype {

	public static void main(String[] args) {
		
		//Prototipo de paquetes Gold
		CajaAhorro ca = new CajaAhorro();
		ca.setSaldo(0);
		Tarjeta tarjeta = new Tarjeta("Visa",987);
		Gold paqueteGold = new Gold();	
		paqueteGold.setCajaAhorro(ca);
		paqueteGold.setTarjeta(tarjeta);
		
		//Paquetes nuevos (Solo agrego titular y numero de tarjeta)
		Gold paqueteDeJuan = paqueteGold.clone();
		paqueteDeJuan.setTitular("Juan");
		paqueteDeJuan.getTarjeta().setNumero("1234123443214321");
		
		Gold paqueteDePedro = paqueteGold.clone();
		paqueteDePedro.setTitular("Pedro");
		paqueteDePedro.getTarjeta().setNumero("9876987667896789");
		
		
		//Cambio atributos del paquete de juan para testear las referencias del clonado.
		paqueteDeJuan.getCajaAhorro().setSaldo(1900);
		paqueteDeJuan.setTitular("Juan Perez");
		
		
		System.out.println(paqueteDeJuan);
		System.out.println("\n------------------------------------\n");
		System.out.println(paqueteDePedro);
	}

}

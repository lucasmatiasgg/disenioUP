package banco.cuenta;

public class Test {

	public static void main(String[] args) {
		ICuenta CA = new CajaAhorro();
		ICuenta CC = new CuentaCorriente();
		ICuenta CA2 = new CajaAhorro();
		
		CA.setSaldo(1000.0);
		CC.setSaldo(1000);
		CA2.setSaldo(0.0);
		
		CC.transferir(CA2, 100);
		
		System.out.println(CC.getSaldo());
		System.out.println(CA2.getSaldo());
	}
}

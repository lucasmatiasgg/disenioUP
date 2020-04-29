
public class Test {

	public static void main(String[] args) {
		
		Cuenta CA = new CajaAhorro();
		Cuenta CA2 = new CajaAhorro();
		Cuenta CC = new CuentaCorriente();	
		Cuenta testNull = new NullCuenta();
		
		CA.setSaldo(100.0);
		CA2.setSaldo(0.0);
		CC.setSaldo(100.0);
		testNull.setSaldo(999.0);
		
		CC.transferir(CA2, 20.0);
		//CA.transferir(CA2, 10.0);
		
		
		
		System.out.println(CC.getSaldo());
		System.out.println(CA2.getSaldo());
	}

}

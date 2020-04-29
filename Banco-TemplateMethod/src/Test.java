
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
		
		/* Este bloque se usa para testear el objectNull
		try {
			testNull.transferir(CA2, 100.00);
		}catch (Exception e) {
			throw new RuntimeException("Error correcto de objeto nulo");
		}
		*/
		
		System.out.println(CC.getSaldo());
		System.out.println(CA2.getSaldo());
	}

}

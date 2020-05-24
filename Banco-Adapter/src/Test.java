
public class Test {

	public static void main(String[] args) {
		Cuenta cuenta;
		
		CuentaAdapter adapter = new CuentaAdapter();
		
		cuenta = adapter.getCuentaExterior(100);
		
		System.out.println(cuenta);
		
	}

}

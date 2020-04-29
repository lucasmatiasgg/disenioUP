
public class NullCuenta extends Cuenta{

	@Override
	double calcularComision(Double monto) {
		throw new UnsupportedOperationException();
	}

}

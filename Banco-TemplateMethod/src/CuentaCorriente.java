
public class CuentaCorriente extends Cuenta{
	
	private double porcentaje = 2;
	@Override
	double calcularComision(Double monto) {
		return (monto * porcentaje / 100);
	}

}

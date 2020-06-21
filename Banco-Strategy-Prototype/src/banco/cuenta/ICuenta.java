package banco.cuenta;
public interface ICuenta {
	void transferir(ICuenta destino, double monto);
	
	/**
	 * 
	 * @param saldo
	 * Metodo que se utiliza para setear saldo inicial
	 */
	void setSaldo(double saldo);
	/**
	 * 
	 * @param saldo
	 * @param monto
	 * Metodo que se utiliza para actualizar el saldo en una transferencia.
	 */
	void setSaldo(double saldo, double monto);
	double getSaldo();
}
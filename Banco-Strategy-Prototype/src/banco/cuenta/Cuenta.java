package banco.cuenta;
public interface Cuenta {
	void transferir(Cuenta destino, double monto);
	void setSaldo(double saldo);
	double getSaldo();
}
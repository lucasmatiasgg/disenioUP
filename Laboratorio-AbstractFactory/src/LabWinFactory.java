
public class LabWinFactory implements LaboratorioAbsFactory{

	@Override
	public Lenguaje crearLenguaje() {
		Lenguaje len = new Java();
		return len;
	}

	@Override
	public SistemaOperativo crearSO() {
		SistemaOperativo so = new Windows();
		return so;
	}

}

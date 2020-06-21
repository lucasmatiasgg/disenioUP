
public class Test {

	public static void main(String[] args) {
		AutoFactory factory = AutoFactory.getInstance();
		Empleado juan = new Empleado("Juan", 12123);
		Empleado jose = new Empleado("Jose", 33456);
		Empleado maria = new Empleado("Maria", 90290);
		//Ejecutivos se les da la posibilidad de elegir marca y modelo.
		jose.setAuto(factory.crearAutoEjecutivo("AAA111", "BMW", "2020"));
		
		//Empleados se carga la patente pero son todos de la misma marca y modelo.
		juan.setAuto(factory.crearAutoEmpleado("CCC231"));
		maria.setAuto(factory.crearAutoEmpleado("AFR542"));
		
		System.out.println(jose);
		
		System.out.println(juan);
		
		System.out.println(maria);
	}

}

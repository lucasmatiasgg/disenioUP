
public class Test {

	public static void main(String[] args) {
		
		Subasta subasta = new Subasta();
		
		subasta.setLimite(500);
		subasta.setPrecio(50);
		
		Comprador compA = new CompradorA();
		Comprador compB = new CompradorB();
		Comprador compC = new CompradorC();
		compA.setNombre("Lucas");
		compB.setNombre("Matias");
		compC.setNombre("Pepe");
		
		Oferente oferente = new Oferente();
		
		oferente.add(compB);
		oferente.add(compA);
		oferente.add(compC);
		
		oferente.vender(subasta);
		

	}

}

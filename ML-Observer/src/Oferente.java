import java.util.ArrayList;
import java.util.List;

public class Oferente {

	List<Comprador> compradores = new ArrayList<Comprador>();
	
	void vender(Subasta subasta) {
		float precioOferta;
		String ganador = "";
		for(Comprador comprador : compradores ) {
			if(subasta.getGanador() == null || 
				!comprador.equals(subasta.getGanador())) {
				precioOferta = comprador.ofertar(subasta);
				if (precioOferta > subasta.getLimite()) {
					System.out.println("Se supero el limite");
					System.out.println("Ganador:" + ganador);
					return ;
				}
				if(subasta.getPrecio() < precioOferta ) {
					subasta.setGanador(comprador);
					subasta.setPrecio(precioOferta);
					System.out.println("Oferta de " + comprador.getNombre() + ": $"+ precioOferta);
					ganador = comprador.getNombre();
				}
			}else {
				System.out.println("El comprador que ofertó ya está ganando.");
			}
			
		}
		System.out.println("Ganador:" + ganador);
			
	}
	
	void add(Comprador comp) {
		compradores.add(comp);
	}
	
	void remove(Comprador comp) {
		compradores.remove(comp);
	}
}

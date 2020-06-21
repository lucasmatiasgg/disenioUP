
public class Test {

	public static void main(String[] args) {
		Producto coca = new Producto("Gaseosa", 100, "Coca-Cola");
		Producto fernet = new Producto("Fernet", 320, "Branca");
		Producto papas = new Producto("Papas", 120, "Lays");
		Producto nachos = new Producto("Nachos", 130, "Lays");
		Producto salame = new Producto("Salame", 250, "Estancia Pampa");
		Producto crudo = new Producto("Crudo", 300, "Estancia Pampa");
		Producto queso = new Producto("Queso", 220, "Estancia Pampa");
		
		Paquete promo1 = new Paquete("Promo1");
		promo1.addProducto(coca);
		promo1.addProducto(fernet);
		promo1.addProducto(papas);
		promo1.addProducto(nachos);
		
		Paquete promo2 = new Paquete("Promo2");
		promo2.addProducto(coca);
		promo2.addProducto(fernet);
		promo2.addProducto(salame);
		promo2.addProducto(queso);
		promo2.addProducto(crudo);
		
		System.out.println(promo1);
		System.out.println("----------");
		System.out.println(promo2);
	}

}


public class Test {

	public static void main(String[] args) {


		IBebida cafe = new Cafe();
		
		IBebida irlandes = new DecoradorIrlandes(new Cafe());
		IBebida cafeConLeche = new DecoradorLeche(new Cafe());
		IBebida lecheIrlandes = new DecoradorIrlandes(cafeConLeche);
		
		System.out.println(cafe);
		System.out.println(irlandes);
		System.out.println(cafeConLeche);
		System.out.println(lecheIrlandes);
	}

}

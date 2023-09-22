package ex5_animais;

public class AnimalMain {
	public static void main(String[] args) {
		Gato gato = new Gato("Felicia", 3, "Casa", "Pelud�o", "Siam�s");
		Cachorro cachorro = new Cachorro("Fido", 6, "Jardim", "P�los curtos", "Vita Lata");
		Tartaruga tartaruga = new Tartaruga("Donatelo", 10, "Lagoa", false, 15);
		Lagarto lagarto = new Lagarto("Godzilla", 5, "Floresta", false, "Verde");
		
		gato.setHabitat("Apartamento");
		cachorro.setRaca("Labrador");
		tartaruga.setIdadeCasco(20);
		lagarto.setCorEscamas("Marrom");
		
		System.out.println("Informa��es do Gato:\n" + gato);
		System.out.println("\nInforma��es do Cachorro:\n" + cachorro);
		System.out.println("\nInforma��es da Tartaruga:\n" + tartaruga);
		System.out.println("\nInforma��es do Lagarto:\n" + lagarto);
		
		gato.emitirSom();
		cachorro.emitirSom();
		tartaruga.emitirSom();
		lagarto.emitirSom();
	}
}








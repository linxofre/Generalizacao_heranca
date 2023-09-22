package ex5_animais;

public class AnimalMain {
	public static void main(String[] args) {
		Gato gato = new Gato("Felicia", 3, "Casa", "Peludão", "Siamês");
		Cachorro cachorro = new Cachorro("Fido", 6, "Jardim", "Pêlos curtos", "Vita Lata");
		Tartaruga tartaruga = new Tartaruga("Donatelo", 10, "Lagoa", false, 15);
		Lagarto lagarto = new Lagarto("Godzilla", 5, "Floresta", false, "Verde");
		
		gato.setHabitat("Apartamento");
		cachorro.setRaca("Labrador");
		tartaruga.setIdadeCasco(20);
		lagarto.setCorEscamas("Marrom");
		
		System.out.println("Informações do Gato:\n" + gato);
		System.out.println("\nInformações do Cachorro:\n" + cachorro);
		System.out.println("\nInformações da Tartaruga:\n" + tartaruga);
		System.out.println("\nInformações do Lagarto:\n" + lagarto);
		
		gato.emitirSom();
		cachorro.emitirSom();
		tartaruga.emitirSom();
		lagarto.emitirSom();
	}
}








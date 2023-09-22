package ex5_animais;

public class Cachorro extends Mamifero {
	private String raca;
	
	public Cachorro(String nome, int idade, String habitat, String tipoPelo, String raca) {
		super(nome, idade, habitat, tipoPelo);
		this.raca = raca;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro late.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nRaça: " + raca;
	}
}

package ex5_animais;

public class Tartaruga extends Reptil {
	private int idadeCasco;
	
	public Tartaruga(String nome, int idade, String habitat, boolean venenoso, int idadeCasco) {
		super(nome, idade, habitat, venenoso);
		this.idadeCasco = idadeCasco;
	}
	
	public int getIdadeCasco() {
		return idadeCasco;
	}
	
	public void setIdadeCasco(int idadeCasco) {
		this.idadeCasco = idadeCasco;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("A tartaruga dá um gritinho.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nIdade do Casco: " + idadeCasco + " anos";
	}
}

package ex5_animais;

public class Reptil extends Animal {
	private boolean venenoso;
	
	public Reptil(String nome, int idade, String habitat, boolean venenoso) {
		 super(nome, idade, habitat);
		 this.venenoso = venenoso;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O réptil emite um som.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nVenenoso: " + (venenoso ? "Sim" : "Não");
	}
}

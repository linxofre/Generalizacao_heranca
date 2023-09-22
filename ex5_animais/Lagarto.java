package ex5_animais;

public class Lagarto extends Reptil {
	private String corEscamas;
	
	public Lagarto(String nome, int idade, String habitat, boolean venenoso, String corEscamas) {
		super(nome, idade, habitat, venenoso);
		this.corEscamas = corEscamas;
	}
	
	public String getCorEscamas() {
		return corEscamas;
	}
	
	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O lagarto não emite som.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCor das Escamas: " + corEscamas;
	}
}

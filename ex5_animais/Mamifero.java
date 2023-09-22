package ex5_animais;

public class Mamifero extends Animal {
	private String tipoPelo;
	
	public Mamifero(String nome, int idade, String habitat, String tipoPelo) {
	   super(nome, idade, habitat);
	   this.tipoPelo = tipoPelo;
	}
	
	public String getTipoPelo() {
	   return tipoPelo;
	}
	
	public void setTipoPelo(String tipoPelo) {
	   this.tipoPelo = tipoPelo;
	}
	
	@Override
	public void emitirSom() {
	   System.out.println("O mamífero emite um som.");
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nTipo de Pelo: " + tipoPelo;
	}
}

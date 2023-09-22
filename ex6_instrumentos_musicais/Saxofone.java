package ex6_instrumentos_musicais;

public class Saxofone extends Metais {
	private String afina��o;
	
	public Saxofone(String nome, String tipo, String material, String afina��o) {
		 super(nome, tipo, material);
		 this.afina��o = afina��o;
	}
	
	public String getAfina��o() {
		return afina��o;
	}
	
	public void setAfina��o(String afina��o) {
		this.afina��o = afina��o;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o saxofone.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAfina��o: " + afina��o;
	}
}

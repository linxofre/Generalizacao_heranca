package ex6_instrumentos_musicais;

public class Saxofone extends Metais {
	private String afinação;
	
	public Saxofone(String nome, String tipo, String material, String afinação) {
		 super(nome, tipo, material);
		 this.afinação = afinação;
	}
	
	public String getAfinação() {
		return afinação;
	}
	
	public void setAfinação(String afinação) {
		this.afinação = afinação;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o saxofone.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAfinação: " + afinação;
	}
}

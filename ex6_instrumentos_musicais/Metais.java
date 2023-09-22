package ex6_instrumentos_musicais;

public class Metais extends InstrumentosMusicais {
	private String material;
	
	public Metais(String nome, String tipo, String material) {
		super(nome, tipo);
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o instrumento de metais.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nMaterial: " + material;
	}
}

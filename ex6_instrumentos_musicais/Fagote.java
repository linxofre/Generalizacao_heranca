package ex6_instrumentos_musicais;

public class Fagote extends Madeiras {
	private String sistemaChaves;
	
	public Fagote(String nome, String tipo, String tipoMadeira, String sistemaChaves) {
		 super(nome, tipo, tipoMadeira);
		 this.sistemaChaves = sistemaChaves;
	}
	
	public String getSistemaChaves() {
		return sistemaChaves;
	}
	
	public void setSistemaChaves(String sistemaChaves) {
		this.sistemaChaves = sistemaChaves;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o fagote.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSistema de Chaves: " + sistemaChaves;
	}
}

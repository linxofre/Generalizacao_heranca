package ex6_instrumentos_musicais;

public class Prato extends Percussao {
	private String tipoPrato;
	
	public Prato(String nome, String tipo, String tipoPercussao, String tipoPrato) {
		 super(nome, tipo, tipoPercussao);
		 this.tipoPrato = tipoPrato;
	}
	
	public String getTipoPrato() {
		return tipoPrato;
	}
	
	public void setTipoPrato(String tipoPrato) {
		this.tipoPrato = tipoPrato;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o prato.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo de Prato: " + tipoPrato;
	}
}


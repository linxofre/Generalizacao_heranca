package ex6_instrumentos_musicais;

public class Percussao extends InstrumentosMusicais {
	private String tipoPercussao;
	
	public Percussao(String nome, String tipo, String tipoPercussao) {
		super(nome, tipo);
		this.tipoPercussao = tipoPercussao;
	}
	
	public String getTipoPercussao() {
		return tipoPercussao;
	}
	
	public void setTipoPercussao(String tipoPercussao) {
		this.tipoPercussao = tipoPercussao;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o instrumento de percussão.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo de Percussão: " + tipoPercussao;
	}
}

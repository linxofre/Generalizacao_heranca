package ex6_instrumentos_musicais;

public class Madeiras extends InstrumentosMusicais {
	private String tipoMadeira;
	
	public Madeiras(String nome, String tipo, String tipoMadeira) {
		super(nome, tipo);
		this.tipoMadeira = tipoMadeira;
	}
	
	public String getTipoMadeira() {
		return tipoMadeira;
	}
	
	public void setTipoMadeira(String tipoMadeira) {
		this.tipoMadeira = tipoMadeira;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o instrumento de madeira.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo de Madeira: " + tipoMadeira;
	}
}

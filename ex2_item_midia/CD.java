package ex2_item_midia;

public class CD extends Midia {
	private String faixas;
	private String album;
	
	public CD(int codigo, String descricao, String gravadora, float duracao, String faixas, String album) {
		super(codigo, descricao, gravadora, duracao);
		this.faixas = faixas;
		this.album = album;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nFaixas: " + faixas + "\n¡lbum: " + album;
	}
}

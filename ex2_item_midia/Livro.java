package ex2_item_midia;

public class Livro extends Item {
	private String autor;
	
	public Livro(int codigo, String descricao, String autor) {
		super(codigo, descricao);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAutor: " + autor;
	}
}
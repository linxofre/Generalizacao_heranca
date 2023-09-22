package ex2_item_midia;

public class Item {
	private int codigo;
	private String descricao;
		
	public Item(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
		
	@Override
	public String toString() {
		return "Código: " + codigo + "\nDescrição: " + descricao;
	}
}
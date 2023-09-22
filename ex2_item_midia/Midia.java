package ex2_item_midia;

public class Midia extends Item {
	private String gravadora;
	private float duracao;
	
	public Midia(int codigo, String descricao, String gravadora, float duracao) {
		super(codigo, descricao);
		this.gravadora = gravadora;
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nGravadora: " + gravadora + "\nDuração: " + duracao + " minutos";
	}
}
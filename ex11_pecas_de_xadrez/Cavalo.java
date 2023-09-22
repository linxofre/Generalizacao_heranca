package ex11_pecas_de_xadrez;

public class Cavalo extends Peca {
	public Cavalo(int linha, int coluna, boolean cor) {
		super(linha, coluna, cor);
	}
	
	@Override
	public boolean mover(int linhaDestino, int colunaDestino) {
		return false;
	}
}

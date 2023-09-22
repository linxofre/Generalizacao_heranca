package ex6_instrumentos_musicais;

public class Violao extends Cordas {
	private int numTrastes;
	
	public Violao(String nome, String tipo, int numCordas, int numTrastes) {
		super(nome, tipo, numCordas);
		this.numTrastes = numTrastes;
	}
	
	public int getNumTrastes() {
		return numTrastes;
	}
	
	public void setNumTrastes(int numTrastes) {
		this.numTrastes = numTrastes;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o viol�o.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nN�mero de Trastes: " + numTrastes;
	}
}





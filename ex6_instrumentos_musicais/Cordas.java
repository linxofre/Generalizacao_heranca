package ex6_instrumentos_musicais;

public class Cordas extends InstrumentosMusicais {
	private int numCordas;
	
	public Cordas(String nome, String tipo, int numCordas) {
		 super(nome, tipo);
		 this.numCordas = numCordas;
	}
	
	public int getNumCordas() {
		return numCordas;
	}
	
	public void setNumCordas(int numCordas) {
		this.numCordas = numCordas;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o instrumento de cordas.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNúmero de Cordas: " + numCordas;
	}
}

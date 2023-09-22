package ex6_instrumentos_musicais;

public class Piano extends Cordas {
	private int numTeclas;
	
	public Piano(String nome, String tipo, int numCordas, int numTeclas) {
	   super(nome, tipo, numCordas);
	   this.numTeclas = numTeclas;
	}
	
	public int getNumTeclas() {
	   return numTeclas;
	}
	
	public void setNumTeclas(int numTeclas) {
	   this.numTeclas = numTeclas;
	}
	
	@Override
	public void tocar() {
	   System.out.println("Tocando o piano.");
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nNúmero de Teclas: " + numTeclas;
	}
}



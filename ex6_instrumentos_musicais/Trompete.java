package ex6_instrumentos_musicais;

public class Trompete extends Metais {
	private int numValvulas;
	
	public Trompete(String nome, String tipo, String material, int numValvulas) {
		 super(nome, tipo, material);
		 this.numValvulas = numValvulas;
	}
	
	public int getNumValvulas() {
		return numValvulas;
	}
	
	public void setNumValvulas(int numValvulas) {
		this.numValvulas = numValvulas;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o trompete.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNúmero de Válvulas: " + numValvulas;
	}
}

package ex6_instrumentos_musicais;

public class Tuba extends Metais {
	private int numValvulas;
	
	public Tuba(String nome, String tipo, String material, int numValvulas) {
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
		System.out.println("Tocando a tuba.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNúmero de Válvulas: " + numValvulas;
	}
}

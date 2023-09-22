package ex6_instrumentos_musicais;

public class Tambor extends Percussao {
	private int numTambores;
	
	public Tambor(String nome, String tipo, String tipoPercussao, int numTambores) {
		 super(nome, tipo, tipoPercussao);
		 this.numTambores = numTambores;
	}
	
	public int getNumTambores() {
		return numTambores;
	}
	
	public void setNumTambores(int numTambores) {
		this.numTambores = numTambores;
	}
	
	@Override
	public void tocar() {
		System.out.println("Tocando o tambor.");
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNúmero de Tambores: " + numTambores;
	}
}


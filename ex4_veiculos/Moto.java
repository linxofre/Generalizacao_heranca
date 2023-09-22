package ex4_veiculos;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto() {
	   super();
	   this.cilindradas = 0;
	}
	
	public int getCilindradas() {
	   return cilindradas;
	}
	
	public void setCilindradas(int cilindradas) {
	   this.cilindradas = cilindradas;
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nCilindradas: " + cilindradas;
	}
}

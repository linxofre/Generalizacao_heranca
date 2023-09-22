package ex4_veiculos;

public class Carro extends Veiculo {
	private int portas;
	
	public Carro() {
	   super();
	   this.portas = 0;
	}
	
	public int getPortas() {
	   return portas;
	}
	
	public void setPortas(int portas) {
	   this.portas = portas;
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nPortas: " + portas;
	}
}

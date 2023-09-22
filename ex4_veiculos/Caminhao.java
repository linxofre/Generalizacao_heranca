package ex4_veiculos;

public class Caminhao extends Veiculo {
	private int eixos;
	
	public Caminhao() {
	   super();
	   this.eixos = 0;
	}
	
	public int getEixos() {
	   return eixos;
	}
	
	public void setEixos(int eixos) {
	   this.eixos = eixos;
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nEixos: " + eixos;
	}
}

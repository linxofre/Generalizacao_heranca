package ex8_ambiente_da_casa;

public class Cozinha extends Ambiente {
	private boolean microondas;
	
	public Cozinha(float area, boolean microondas) {
		super(area);
		this.microondas = microondas;
	}
	
	public boolean isMicroondas() {
		return microondas;
	}
	
	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}
	
	public void prepararRefeicao() {
		if (microondas) {
			System.out.println("As pessoas estão preparando refeições na cozinha com microondas.");
		} else {
			System.out.println("As pessoas estão preparando refeições na cozinha sem microondas.");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nMicroondas: " + (microondas ? "Sim" : "Não");
	}
}

package ex8_ambiente_da_casa;

public class Banheiro extends Ambiente {
	private boolean banheiro;
	
	public Banheiro(float area, boolean banheiro) {
		super(area);
		this.banheiro = banheiro;
	}
	
	public boolean isBanheiro() {
		return banheiro;
	}
	
	public void setBanheiro(boolean banheiro) {
		this.banheiro = banheiro;
	}
	
	public void usarBanheiro() {
		if (banheiro) {
		   System.out.println("As pessoas estão usando o banheiro.");
		} else {
		   System.out.println("Não há banheiro no ambiente.");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBanheiro: " + (banheiro ? "Sim" : "Não");
	}
}

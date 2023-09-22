package ex8_ambiente_da_casa;

public class Quarto extends Ambiente {
	private int capacidade;
	
	public Quarto(float area, int capacidade) {
	   super(area);
	   this.capacidade = capacidade;
	}
	
	public int getCapacidade() {
	   return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
	   this.capacidade = capacidade;
	}
	
	public void dormir() {
	   System.out.println("As pessoas estão dormindo no quarto.");
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nCapacidade: " + capacidade + " pessoa(s)";
	}
}

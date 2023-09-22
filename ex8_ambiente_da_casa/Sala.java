package ex8_ambiente_da_casa;

public class Sala extends Ambiente {
	private boolean tv;
	
	public Sala(float area, boolean tv) {
		 super(area);
		 this.tv = tv;
	}
	
	public boolean isTv() {
		 return tv;
	}
	
	public void setTv(boolean tv) {
		 this.tv = tv;
	}
	
	public void assistirTV() {
		 if (tv) {
		     System.out.println("As pessoas est�o assistindo TV na sala.");
		 } else {
		     System.out.println("N�o h� TV na sala para assistir.");
		 }
	}
	
	@Override
	public String toString() {
		 return super.toString() + "\nTV: " + (tv ? "Sim" : "N�o");
	}
}

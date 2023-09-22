package ex9_nave_espacial;

public class NaveEspacial {
	 private double velocidadeMaxima;
	
	 public NaveEspacial(double velocidadeMaxima) {
	     this.velocidadeMaxima = velocidadeMaxima;
	 }
	
	 public double getVelocidadeMaxima() {
	     return velocidadeMaxima;
	 }
	
	 public void setVelocidadeMaxima(double velocidadeMaxima) {
	     this.velocidadeMaxima = velocidadeMaxima;
	 }
	
	 @Override
	 public String toString() {
	     return "Velocidade Máxima: " + velocidadeMaxima + " km/s";
	 }
}

package ex4_veiculos;

public class Veiculo {
	private boolean motor;
	
	public Veiculo() {
	   this.motor = false;
	}
	
	public boolean isMotor() {
	   return motor;
	}
	
	public void setMotor(boolean motor) {
	   this.motor = motor;
	}
	
	@Override
	public String toString() {
	   return "Motor: " + (motor ? "Ligado" : "Desligado");
	}
}

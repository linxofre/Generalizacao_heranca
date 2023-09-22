package ex9_nave_espacial;

public class MillenniumFalcon extends Apolo11 {
	private float classeHiperpropulsor;
	
	public MillenniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperpropulsor) {
		 super(velocidadeMaxima, tipoCombustivel);
		 this.classeHiperpropulsor = classeHiperpropulsor;
	}
	
	public float getClasseHiperpropulsor() {
		 return classeHiperpropulsor;
	}
	
	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		 this.classeHiperpropulsor = classeHiperpropulsor;
	}
	
	public void fazerCorridaKessel() {
		 System.out.println("A Millennium Falcon está fazendo a Corrida de Kessel.");
	}
	
	@Override
	public String toString() {
		 return super.toString() + "\nClasse do Hiperpropulsor: " + classeHiperpropulsor;
	}
}

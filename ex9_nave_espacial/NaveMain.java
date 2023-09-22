package ex9_nave_espacial;

public class NaveMain {
	public static void main(String[] args) {
		Apolo11 apolo11 = new Apolo11(39.0, "Hidrogênio");
		MillenniumFalcon falcon = new MillenniumFalcon(75.0, "Quadranium", 0.5f);
		
		apolo11.setVelocidadeMaxima(42.0);
		falcon.setTipoCombustivel("Células de Energia");
		
		System.out.println("Informações da Apolo 11:\n" + apolo11);
		System.out.println("\nInformações da Millennium Falcon:\n" + falcon);
		
		apolo11.viajarLua();
		falcon.fazerCorridaKessel();
	}
}




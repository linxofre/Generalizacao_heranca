package ex10_bomba_de_combustivel;

public class BombaCombustivelMain {
	public static void main(String[] args) {
		BombaGasolina gasolina = new BombaGasolina(5.0f);
		BombaEtanol etanol = new BombaEtanol(4.0f);
		BombaDiesel diesel = new BombaDiesel(3.5f);
		
		gasolina.abastecerPorLitro(20);
		etanol.abastecerPorValor(50);
		diesel.abastecerPorLitro(15);
		
		System.out.println("Informações da Bomba de Gasolina:\n" + gasolina);
		System.out.println("\nInformações da Bomba de Etanol:\n" + etanol);
		System.out.println("\nInformações da Bomba de Diesel:\n" + diesel);
	}
}

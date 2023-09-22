package ex10_bomba_de_combustivel;

public class Bomba {
	 private double totalLitros;
	 private float valorLitro;
	
	 public Bomba(float valorLitro) {
	     this.valorLitro = valorLitro;
	     this.totalLitros = 0;
	 }
	
	 public double getTotalLitros() {
	     return totalLitros;
	 }
	
	 public void setTotalLitros(double totalLitros) {
	     this.totalLitros = totalLitros;
	 }
	
	 public float getValorLitro() {
	     return valorLitro;
	 }
	
	 public void setValorLitro(float valorLitro) {
	     this.valorLitro = valorLitro;
	 }
	
	 public boolean abastecerPorLitro(double litros) {
	     if (litros > 0) {
	         totalLitros += litros;
	         return true;
	     }
	     return false;
	 }
	
	 public boolean abastecerPorValor(double valor) {
	     if (valor > 0) {
	         double litros = valor / valorLitro;
	         totalLitros += litros;
	         return true;
	     }
	     return false;
	 }
	
	 public double calcularValorGasto() {
	     return totalLitros * valorLitro;
	 }
	
	 @Override
	 public String toString() {
	     return "Total de Litros Abastecidos: " + totalLitros + " litros\nValor por Litro: R$" + valorLitro +
	            "\nValor Total Gasto: R$" + calcularValorGasto();
	 }
}

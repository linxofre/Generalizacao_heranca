package ex8_ambiente_da_casa;

public class Ambiente {
	 private float area;
	
	 public Ambiente(float area) {
	     this.area = area;
	 }
	
	 public float getArea() {
	     return area;
	 }
	
	 public void setArea(float area) {
	     this.area = area;
	 }
	
	 @Override
	 public String toString() {
	     return "Área: " + area + " metros quadrados";
	 }
}

package ex6_instrumentos_musicais;

public class InstrumentosMusicais {
	 private String nome;
	 private String tipo;
	
	 public InstrumentosMusicais(String nome, String tipo) {
	     this.nome = nome;
	     this.tipo = tipo;
	 }
	
	 public String getNome() {
	     return nome;
	 }
	
	 public void setNome(String nome) {
	     this.nome = nome;
	 }
	
	 public String getTipo() {
	     return tipo;
	 }
	
	 public void setTipo(String tipo) {
	     this.tipo = tipo;
	 }
	
	 public void tocar() {
	     System.out.println("Tocando o instrumento musical.");
	 }
	
	 @Override
	 public String toString() {
	     return "Nome: " + nome + "\nTipo: " + tipo;
	 }
}

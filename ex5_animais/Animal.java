package ex5_animais;

public class Animal {
	 private String nome;
	 private int idade;
	 private String habitat;
	
	 public Animal(String nome, int idade, String habitat) {
	     this.nome = nome;
	     this.idade = idade;
	     this.habitat = habitat;
	 }
	
	 public String getNome() {
	     return nome;
	 }
	
	 public void setNome(String nome) {
	     this.nome = nome;
	 }
	
	 public int getIdade() {
	     return idade;
	 }
	
	 public void setIdade(int idade) {
	     this.idade = idade;
	 }
	
	 public String getHabitat() {
	     return habitat;
	 }
	
	 public void setHabitat(String habitat) {
	     this.habitat = habitat;
	 }
	
	 public void emitirSom() {
	     System.out.println("O animal emite um som.");
	 }
	
	 @Override
	 public String toString() {
	     return "Nome: " + nome + "\nIdade: " + idade + " anos\nHabitat: " + habitat;
	 }
}

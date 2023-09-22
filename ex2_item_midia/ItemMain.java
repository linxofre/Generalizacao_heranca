package ex2_item_midia;

public class ItemMain {
	public static void main(String[] args) {
		Livro livro = new Livro(1, "Horror Cósmico", "Stephen King");
		CD cd = new CD(2, "Oitavo anjo", "Gravadora Racionais", 60.5f, "oitavo anjo, saudades", "509-E");
		VHS vhs = new VHS(3, "Filme Clássico", "Estúdio Universal", 120.0f, "Poderoso Chefão");
		
		System.out.println("Informações do Livro:\n" + livro);
		System.out.println("\nInformações do CD:\n" + cd);
		System.out.println("\nInformações do VHS:\n" + vhs);
	}
}





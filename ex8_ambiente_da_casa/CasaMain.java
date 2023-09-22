package ex8_ambiente_da_casa;

public class CasaMain {
	public static void main(String[] args) {
		Quarto quarto = new Quarto(15.0f, 2);
		Sala sala = new Sala(20.0f, true);
		Banheiro banheiro = new Banheiro(5.0f, true);
		Cozinha cozinha = new Cozinha(10.0f, true);
		
		quarto.setArea(18.0f);
		sala.setTv(false);
		banheiro.setBanheiro(false);
		cozinha.setMicroondas(false);
		
		System.out.println("Informa��es do Quarto:\n" + quarto);
		System.out.println("\nInforma��es da Sala:\n" + sala);
		System.out.println("\nInforma��es do Banheiro:\n" + banheiro);
		System.out.println("\nInforma��es da Cozinha:\n" + cozinha);
		
		quarto.dormir();
		sala.assistirTV();
		banheiro.usarBanheiro();
		cozinha.prepararRefeicao();
	}
}


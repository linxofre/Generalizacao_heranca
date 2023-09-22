package ex6_instrumentos_musicais;

public class InstrumentosMusicaisMain {
	public static void main(String[] args) {
		 Violao violao = new Violao("Violão Clássico", "Cordas", 6, 20);
		 Piano piano = new Piano("Piano de Cauda", "Cordas", 88, 3);
		 Fagote fagote = new Fagote("Fagote de Orquestra", "Madeiras", "Madeira de Ébano", "Sistema Heckel");
		 Tuba tuba = new Tuba("Tuba Sinfônica", "Metais", "Latão", 4);
		 Prato prato = new Prato("Prato de Choque", "Percussão", "Prato de Ataque", "Crash");
		 Tambor tambor = new Tambor("Tambor Samba", "Percussão", "Tambor de Ritmo", 2);
		 Saxofone saxofone = new Saxofone("Saxofone Alto", "Metais", "Latão", "Mi Bemol");
		 Trompete trompete = new Trompete("Trompete Soprano", "Metais", "Latão", 3);
		
		 violao.setNumTrastes(22);
		 piano.setNumTeclas(76);
		 fagote.setSistemaChaves("Sistema Buffet");
		 tuba.setNumValvulas(5);
		 prato.setTipoPrato("Hi-Hat");
		 tambor.setNumTambores(3);
		 saxofone.setAfinação("Si Bemol");
		 trompete.setNumValvulas(3);
		
		 System.out.println("Informações do Violão:\n" + violao);
		 System.out.println("\nInformações do Piano:\n" + piano);
		 System.out.println("\nInformações do Fagote:\n" + fagote);
		 System.out.println("\nInformações da Tuba:\n" + tuba);
		 System.out.println("\nInformações do Prato:\n" + prato);
		 System.out.println("\nInformações do Tambor:\n" + tambor);
		 System.out.println("\nInformações do Saxofone:\n" + saxofone);
		 System.out.println("\nInformações do Trompete:\n" + trompete);
		
		 violao.tocar();
		 piano.tocar();
		 fagote.tocar();
		 tuba.tocar();
		 prato.tocar();
		 tambor.tocar();
		 saxofone.tocar();
		 trompete.tocar();
	}
}

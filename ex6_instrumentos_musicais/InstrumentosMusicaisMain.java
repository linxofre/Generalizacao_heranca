package ex6_instrumentos_musicais;

public class InstrumentosMusicaisMain {
	public static void main(String[] args) {
		 Violao violao = new Violao("Viol�o Cl�ssico", "Cordas", 6, 20);
		 Piano piano = new Piano("Piano de Cauda", "Cordas", 88, 3);
		 Fagote fagote = new Fagote("Fagote de Orquestra", "Madeiras", "Madeira de �bano", "Sistema Heckel");
		 Tuba tuba = new Tuba("Tuba Sinf�nica", "Metais", "Lat�o", 4);
		 Prato prato = new Prato("Prato de Choque", "Percuss�o", "Prato de Ataque", "Crash");
		 Tambor tambor = new Tambor("Tambor Samba", "Percuss�o", "Tambor de Ritmo", 2);
		 Saxofone saxofone = new Saxofone("Saxofone Alto", "Metais", "Lat�o", "Mi Bemol");
		 Trompete trompete = new Trompete("Trompete Soprano", "Metais", "Lat�o", 3);
		
		 violao.setNumTrastes(22);
		 piano.setNumTeclas(76);
		 fagote.setSistemaChaves("Sistema Buffet");
		 tuba.setNumValvulas(5);
		 prato.setTipoPrato("Hi-Hat");
		 tambor.setNumTambores(3);
		 saxofone.setAfina��o("Si Bemol");
		 trompete.setNumValvulas(3);
		
		 System.out.println("Informa��es do Viol�o:\n" + violao);
		 System.out.println("\nInforma��es do Piano:\n" + piano);
		 System.out.println("\nInforma��es do Fagote:\n" + fagote);
		 System.out.println("\nInforma��es da Tuba:\n" + tuba);
		 System.out.println("\nInforma��es do Prato:\n" + prato);
		 System.out.println("\nInforma��es do Tambor:\n" + tambor);
		 System.out.println("\nInforma��es do Saxofone:\n" + saxofone);
		 System.out.println("\nInforma��es do Trompete:\n" + trompete);
		
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

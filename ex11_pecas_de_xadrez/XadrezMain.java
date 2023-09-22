package ex11_pecas_de_xadrez;

//Classe XadrezMain
public class XadrezMain {
 public static void main(String[] args) {
     Peao peao = new Peao(2, 1, true);
     Torre torre = new Torre(1, 1, true);
     Rei rei = new Rei(1, 5, true);
     Rainha rainha = new Rainha(1, 4, true);
     Cavalo cavalo = new Cavalo(1, 2, true);
     Bispo bispo = new Bispo(1, 3, true);

     boolean movimentoValido = peao.mover(3, 1);
     System.out.println("Movimento do Peão válido: " + movimentoValido);

     movimentoValido = torre.mover(3, 1);
     System.out.println("Movimento da Torre válido: " + movimentoValido);

     movimentoValido = rei.mover(2, 4);
     System.out.println("Movimento do Rei válido: " + movimentoValido);

     movimentoValido = rainha.mover(2, 3);
     System.out.println("Movimento da Rainha válido: " + movimentoValido);

     movimentoValido = cavalo.mover(3, 4);
     System.out.println("Movimento do Cavalo válido: " + movimentoValido);

     movimentoValido = bispo.mover(3, 2);
     System.out.println("Movimento do Bispo válido: " + movimentoValido);
 }
}


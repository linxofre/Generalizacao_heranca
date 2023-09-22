package ex3_tipo_de_contas;

public class ContaEspecial extends Conta {
	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroConta, saldo);
		this.diasSemJuros = diasSemJuros;
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDias Sem Juros: " + diasSemJuros + " dias\nLimite: R$" + limite;
	}
}

package ex3_tipo_de_contas;

public class Conta {
	private String banco;
	private int agencia;
	private int numeroConta;
	protected double saldo;
	
	public Conta(String banco, int agencia, int numeroConta, double saldo) {
	    this.banco = banco;
	    this.agencia = agencia;
	    this.numeroConta = numeroConta;
	    this.saldo = saldo;
	}
	
	public boolean deposito(double valor) {
	    if (valor > 0) {
	        saldo += valor;
	        return true;
	    } else {
	        return false;
	    }
	}
	
	public boolean saque(double valor) {
		if (valor > 0 && valor <= saldo) {
	       saldo -= valor;
	       return true;
	    } else {
	        return false;
	    }
	}
	
	@Override
	public String toString() {
	    return "Banco: " + banco + "\nAgência: " + agencia + "\nNúmero da Conta: " + numeroConta + "\nSaldo: R$" + saldo;
	}
}

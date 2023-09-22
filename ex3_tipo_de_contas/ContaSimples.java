package ex3_tipo_de_contas;

public class ContaSimples extends Conta {
	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca) {
	   super(banco, agencia, numeroConta, saldo);
	   this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
	   if (valor > 0) {
	       saldoPoupanca += valor;
	       return true;
	   } else {
	       return false;
	   }
	}
	
	public boolean saquePoupanca(double valor) {
	   if (valor > 0 && valor <= saldoPoupanca) {
	       saldoPoupanca -= valor;
	       return true;
	   } else {
	       return false;
	   }
	}
	
	@Override
	public String toString() {
	   return super.toString() + "\nSaldo Poupança: R$" + saldoPoupanca;
	}
}

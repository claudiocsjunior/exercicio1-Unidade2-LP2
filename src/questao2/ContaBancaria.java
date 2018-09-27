/**
 * 
 */
package questao2;


public abstract class ContaBancaria {
	protected double saldo;
	
	public ContaBancaria() {
		this.saldo = 0;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito no valor de " + valor +" reais realizado com Sucesso");
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		System.out.println("Saque no valor de " + valor +" reais realizado com Sucesso");
	}
	
	public void transferir(double valor, ContaBancaria contaDestino) {
		System.out.println("Iniciando tranferência...");
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Tranferência realizada com Sucesso");
	}
	
	public abstract void calcularSaldo();
	

}

package questao2;

public class Main {

	public static void main(String[] args) {
		ContaBancaria contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100);
		contaCorrente.sacar(50);
		contaCorrente.calcularSaldo();
		
		ContaBancaria contaInvestimento = new ContaInvestimento();
		contaInvestimento.depositar(1000);
		contaInvestimento.sacar(500);
        contaInvestimento.calcularSaldo();
		
        contaInvestimento.transferir(100, contaCorrente);
        contaCorrente.calcularSaldo();
        contaInvestimento.calcularSaldo();
	}

}

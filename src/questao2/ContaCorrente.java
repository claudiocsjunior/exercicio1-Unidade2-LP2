package questao2;

public class ContaCorrente extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		double saldoRejustado = this.saldo - (this.saldo * 0.1 );
		System.out.println("Saldo em conta Corrente: " + saldoRejustado);
	}

}

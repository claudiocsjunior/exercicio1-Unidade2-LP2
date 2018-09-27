package questao2;

public class ContaInvestimento extends ContaBancaria {

	@Override
	public void calcularSaldo() {
		double saldoReajustado = this.saldo + (this.saldo * 0.05);
		System.out.println("Saldo em conta Invertimento: " + saldoReajustado);
	}

}

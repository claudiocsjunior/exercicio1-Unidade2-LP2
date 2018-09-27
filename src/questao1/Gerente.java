package questao1;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf ,salario);
	}

	@Override
	public double getBonificacao() {
		double bonificacao = ((super.getSalario()*30)/100) + 1000;
		return bonificacao;
	}

}

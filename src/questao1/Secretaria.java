package questao1;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, String cpf, double salario) {
		super(nome, cpf ,salario);
	}

	@Override
	public double getBonificacao() {
		double bonificacao = (super.getSalario()*20)/100;
		return bonificacao;
	}

}

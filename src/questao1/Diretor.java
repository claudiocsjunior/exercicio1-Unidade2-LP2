package questao1;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf ,salario);
	}

	@Override
	public double getBonificacao() {
		double bonificacao = ((super.getSalario()*40)/100) + 2000;
		return bonificacao;
	}

}

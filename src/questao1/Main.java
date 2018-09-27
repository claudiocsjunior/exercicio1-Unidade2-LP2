package questao1;

public class Main {

	public static void main(String[] args) {
		Funcionario secretaria = new Secretaria("Ana Maria", "101.222.333-11", 1500);
		Funcionario gerente = new Gerente("Roberto da Silva", "102.444.333-22", 3000);
		Funcionario diretor = new Diretor("Madona", "103.555.333-33", 7000);
		
		DAOFuncionario funcionarios = new DAOFuncionario();
		
		funcionarios.cadastrarFuncionario(secretaria);
		funcionarios.cadastrarFuncionario(gerente);
		funcionarios.cadastrarFuncionario(diretor);
		
		funcionarios.listarFuncionarios();

	}

}

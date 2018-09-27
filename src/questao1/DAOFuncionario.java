package questao1;

import java.util.ArrayList;


public class DAOFuncionario {
	ArrayList<Funcionario> funcionarios;
	
	
	public DAOFuncionario() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public void cadastrarFuncionario(Funcionario f){
		this.funcionarios.add(f);
	}
	
	public void listarFuncionarios(){
		ControleBonificacao bonificacao = new ControleBonificacao();
		for(Funcionario funcionario : this.funcionarios){
			String tipoFuncionario = "";
			if(funcionario instanceof Secretaria) {
				tipoFuncionario = "Secretária";
			}else if(funcionario instanceof Diretor) {
				tipoFuncionario = "Diretor";
			}else if(funcionario instanceof Gerente) {
				tipoFuncionario = "Gerente";
			}
			
			System.out.println("**************************************");
			System.out.println("nome: "    + funcionario.getNome() + " - " + tipoFuncionario);
			System.out.println("cpf: "     + funcionario.getCpf());
			System.out.println("salário: " + funcionario.getSalario());
			System.out.println("Bonos: "   + funcionario.getBonificacao());
			bonificacao.registrarBonificacoes(funcionario);
		}
		
		System.out.println("**************************************");
		System.out.println("Total das bonificações: " + bonificacao.getTotalBonificacoes());
		System.out.println("**************************************");
		
	}

}

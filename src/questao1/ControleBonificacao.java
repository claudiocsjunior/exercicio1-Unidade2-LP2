package questao1;

public class ControleBonificacao {
	private double totalBonificacoes;
	
	public ControleBonificacao() {
		this.totalBonificacoes = 0;
	}
	
	public void registrarBonificacoes(Funcionario f){
		this.totalBonificacoes += f.getBonificacao();
	}
	
	public double getTotalBonificacoes(){
		return this.totalBonificacoes;
	}

}

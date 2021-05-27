package banco1;

public class Cliente {
	
	private Conta conta;
	private String nome;
	private Long cpf;

	public Cliente(String nome, Long cpf, Conta conta) {
		
		this.nome = nome;
		this.conta = conta;
		this.cpf = cpf;
		
	}

	public Conta getConta() {
		return conta;
		
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}
	
	public Long getCpf() {
		return cpf;
	}

}

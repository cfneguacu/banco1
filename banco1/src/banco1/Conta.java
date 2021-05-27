package banco1;

public class Conta {
	
	private Integer agencia;
	private Integer numConta;
	private Integer senha;
	private double saldo;

	public Conta(Integer agencia, Integer numConta, Integer senha, double saldo) {
		
		this.agencia = agencia;
		this.numConta = numConta;
		this.senha = senha;
		this.saldo = saldo;
	}

	public Integer getAgenciaBancaria() {
		// TODO Auto-generated method stub
		return agencia;
	}

	public Integer getNumeroDaConta() {
		// TODO Auto-generated method stub
		return numConta;
	}
	
	public Integer getSenha(){
		
		return senha;
	}
	
	public double getSaldo() {
		
		return saldo;
	}

}

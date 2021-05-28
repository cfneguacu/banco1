package banco1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Banco1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<Integer, Cliente> agencia = new LinkedHashMap<>();
		Random random = new Random();
		Integer opcao;
		
		do {
			System.out.println("------------------------------------");
			System.out.println("[1] Nova Conta\n[2] - Remover Conta\n[3] - Dados do Cliente\n[4] - Listar Contas");
			System.out.println("------------------------------------");
			opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Digite o Cpf: ");
				Long cpf = sc.nextLong();
				System.out.print("Senha: ");
				Integer senha = sc.nextInt();
				Integer numConta = random.nextInt(4000)+1000;
				Integer Agencia = random.nextInt(4000)+1000;
				double saldo = random.nextInt(999999)/10;
				Cliente cliente = new Cliente(nome, cpf, new Conta(Agencia, numConta, senha, saldo));
				agencia.put(senha, cliente);
				System.out.println("Conta: " + numConta);
				System.out.println("Agencia: "+ Agencia);
			    break;
				
			case 2:
				
				System.out.print("Agencia: ");
				Integer agencia1 = sc.nextInt();
				System.out.print("Conta: ");
				Integer conta1 = sc.nextInt();
				System.out.print("Senha: ");
				Integer senha1 = sc.nextInt();
				
				if(agencia.get(senha1).getConta().getAgenciaBancaria().equals(agencia1)
						&& agencia.get(senha1).getConta().getNumeroDaConta().equals(conta1)) {
					agencia.remove(senha1);
					System.out.println("Removido com Sucesso!");
				}else {
					System.out.println("Conta inexistente!");
				}
				
				break;
				
			case 3:
				
				System.out.print("Agencia: ");
				Integer agencia2 = sc.nextInt();
				System.out.print("Conta: ");
				Integer conta2 = sc.nextInt();
				System.out.print("Senha: ");
				Integer senha2 = sc.nextInt();
				
				try {
				
					if(agencia.get(senha2).getConta().getAgenciaBancaria().equals(agencia2)
						&& agencia.get(senha2).getConta().getNumeroDaConta().equals(conta2)) {
					System.out.println("--------------------------------------");
					System.out.println("Agencia: "+agencia.get(senha2).getConta().getAgenciaBancaria());
					System.out.println("Numero da Conta: "+agencia.get(senha2).getConta().getNumeroDaConta());
					System.out.println("Nome: "+agencia.get(senha2).getNome());
					System.out.println("Saldo: "+String.format("%.2f", agencia.get(senha2).getConta().getSaldo()));
					System.out.println("--------------------------------------");
				
				
					}else {
						
					System.out.println("Conta Inexistente");
				
					}
					
				}catch(NullPointerException e) {
					
					System.out.println("Conta Inexistente");

				}
				
				break;
				
			case 4:
				
				Collection c = agencia.values();
				Iterator i = c.iterator();
				int cont = 0;
				while (i.hasNext()) {
					cliente = (Cliente) i.next();
					cont++;
					System.out.println(cont+"- Cliente: " + cliente.getNome() + " Agencia: " + cliente.getConta().getAgenciaBancaria() + " Conta: " + cliente.getConta().getNumeroDaConta() +  " Saldo: " + String.format("%.2f",cliente.getConta().getSaldo()));
				}
			}
			

		}while(opcao!=0);
		sc.close();
	}

}

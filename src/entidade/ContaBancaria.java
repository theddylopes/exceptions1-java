package entidade;

import java.util.Scanner;

public class ContaBancaria 
{
	private int numConta;
	private String nome;
	private double depInicial;
	
	
	// Construtores
	public ContaBancaria(int numConta, String nome, double depInicial) 
	{
		this.numConta = numConta;
		this.nome = nome;
		deposito(depInicial);
	}

	public ContaBancaria(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getDepInicial() {
		return depInicial;
	}
	
	//Metodos
	public void deposito(double valor)
	{
		depInicial += valor;
		System.out.println("Depositando...");
	}
	
	public void saque(double valor)
	{
		depInicial -= valor + 5.00;
		System.out.println("Você Sacou: " + valor + " / Taxa de Saque R$ 5.00");
	}
	
	public String toString()
	{
		return 
				 "Conta: " + getNumConta() + ", "
				+"Nome: " + getNome() + ", "
				+"Deposito: " + getDepInicial();
	}
	
	/*Programa ContaBancaria
	 * Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		char c;
		double temp;
		
		System.out.print("Numero da conta: ");
		int a = sc.nextInt();
		
		System.out.print("Nome do Usuário: ");
		String r = sc.nextLine();
		String b = sc.nextLine();
		
		do 
		{
			System.out.print("Fará deposito Inicial? - Digite (s/n): ");
			c = sc.next().charAt(0);
			
			if(c == 's')
			{
				System.out.print("Deposito Inicial: ");
				double d = sc.nextDouble();
				conta = new ContaBancaria(a, b, d);
			}
			else if (c == 'n')
			{
				conta = new ContaBancaria(a, b);
			}
			else
			{
				System.out.println("Valor inválido! Tente novamente.");
				conta = new ContaBancaria(0, null, 0.0);
			}
			
		} while(c != 's' && c != 'n');
		
		System.out.println(conta.toString());
			
		System.out.println("\nDeposite um valor: ");
		temp = sc.nextDouble();
		conta.deposito(temp);
		
		System.out.println(conta.toString());
		
		System.out.println("\nSaque um valor: ");
		temp = sc.nextDouble();
		conta.saque(temp);
		
		System.out.println(conta.toString());
		
		conta.setNome("Josivaldo da Silva");
		
		System.out.println(conta.toString());
		
		sc.close();
	 * 
	 * */

	
}
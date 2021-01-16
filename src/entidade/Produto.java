package entidade;

public class Produto {
	
	private String nome;
	private double preco;
	private int qtd;

	
	
	//Construtores
	public Produto() {
		
	}

	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	//Metodos
	public double totalValorEstoque()
	{
		return preco * qtd;
	}

	public void addProdutos(int qtd)
	{
		this.qtd += qtd;
	}
	
	public void removeProdutos(int qtd)
	{
		this.qtd -= qtd;
	}
	
	public String toString()
	{
		String display = 
				"Nome: " + nome 
				+ "\nPreço: " + String.format("%.2f", preco) 
				+ "\nQuantidade: " + qtd
				+ "\nTotal:" + String.format("%.2f", totalValorEstoque())
				+ "\n";
				;
		return display;
	}

}

package testes;

public class Cadastrador extends Pessoa{

	public Cadastrador(String nome, Integer idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	void cadastrar(Cadastrado cadastrado, String nome, Integer idade){
		cadastrado.setNome(nome);
		cadastrado.setIdade(idade);
		System.out.println("Dados do cadastrado:");
		System.out.println("Nome: " + cadastrado.getNome() + "\n" + 
						    "Idade: " + cadastrado.getIdade());
		System.out.println("===================");
		System.out.println("Dados do cadastrador:");
		System.out.println("Nome: " + this.getNome() + "\n" +
						   "Idade: " + this.getIdade());
	}
	
}

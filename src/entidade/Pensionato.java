package entidade;

public class Pensionato {
	private String nome;
	private int quarto; 
	
	
	public Pensionato() {
		this.nome = null;
	}
	
	public Pensionato(String nome, int quarto) {
		this.nome = nome;
		this.quarto = quarto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
}



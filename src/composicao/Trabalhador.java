package composicao;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entidade.enums.Nivel;

public class Trabalhador {
	private String nome;
	private Nivel nivel;
	private Double salario; 
	
	//Associações da Composição
	private Departamento departamento;
	private List<Contrato> contratos = new ArrayList<>();
	
	//Construtor
	public Trabalhador(String nome, Nivel nivel, Double salario, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}


	//Metodos
	public void adicionaContrato(Contrato c) {
		this.contratos.add(c);
	}
	
	public void removeContrato(Contrato c) {
		this.contratos.remove(c);
	}
	
	public double ganhoMensal(int ano, int mes) {
		double soma = salario;
		
		Calendar cal = Calendar.getInstance();
		
		for(Contrato c: contratos) {
			
			cal.setTime(c.getData());
			
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);		
			
			if(c_ano == ano && c_mes == mes) 
			{
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}

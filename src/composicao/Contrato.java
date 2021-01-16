package composicao;

import java.util.Date;

public class Contrato {
	private Date data;
	private Double valorPorHora;
	private Integer horas;
	
	//Construtor
	public Contrato() {
		
	}
	
	public Contrato(Date data, Double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}
	
	//Getters e Setters
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	//Metodos
	double valorTotal() {
		return valorPorHora * horas;
	}


}

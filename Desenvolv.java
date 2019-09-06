package br.edu.unisep;

public class Desenvolv {
	private String titulo_Projeto;
	private double valor;
	private int perc_equipe;
	private int perc_Licenca;
	private int perc_Mark;
	private int perc_Imp;
	private double valor_Equipe;
	private double valor_Licenca;
	private double valor_Mark;
	private double valor_Imp;
	
	public String custos() {
		valor_Equipe = (0.9*valor) * (perc_equipe/100);
		valor_Licenca = (0.9*valor) * (perc_equipe/100);
		valor_Mark = (0.9*valor) * (perc_Mark/100);
		valor_Imp = (0.9*valor) * (perc_Imp/100);
		return String.format("equipe: %02d | licenca: %02d | marketing: %02d | imposto: %02d.",valor_Equipe, valor_Licenca, valor_Mark, valor_Imp);
	}
	
	
	public int getPerc_Licenca() {
		return perc_Licenca;
	}


	public void setPerc_Licenca(int perc_Licenca) {
		this.perc_Licenca = perc_Licenca;
	}


	public double getValor_Equipe() {
		return valor_Equipe;
	}


	public void setValor_Equipe(double valor_Equipe) {
		this.valor_Equipe = valor_Equipe;
	}


	public double getValor_Licenca() {
		return valor_Licenca;
	}


	public void setValor_Licenca(double valor_Licenca) {
		this.valor_Licenca = valor_Licenca;
	}


	public double getValor_Mark() {
		return valor_Mark;
	}


	public void setValor_Mark(double valor_Mark) {
		this.valor_Mark = valor_Mark;
	}


	public double getValor_Imp() {
		return valor_Imp;
	}


	public void setValor_Imp(double valor_Imp) {
		this.valor_Imp = valor_Imp;
	}


	public String getTitulo_Projeto() {
		return titulo_Projeto;
	}
	public void setTitulo_Projeto(String titulo_Projeto) {
		this.titulo_Projeto = titulo_Projeto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getPerc_equipe() {
		return perc_equipe;
	}
	public void setPerc_equipe(int perc_equipe) {
		this.perc_equipe = perc_equipe;
	}

	public int getPerc_Mark() {
		return perc_Mark;
	}
	public void setPerc_Mark(int perc_Mark) {
		this.perc_Mark = perc_Mark;
	}
	public int getPerc_Imp() {
		return perc_Imp;
	}
	public void setPerc_Imp(int perc_Imp) {
		this.perc_Imp = perc_Imp;
	}
	
	
}

package br.com.dio.deafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Connteudo {

	private LocalDate data;
	
	public Mentoria() {
		
	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADDRAO + 20;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Curso [titulo = " + getTitulo() + ", descricao = " + getDescricao() + "]";
	}
	
}

package entities;

import java.util.Date;

public class Arbitro {
	
	private Integer id;
	private String nome;
	private Date nascimento;
	private char genero;
	
	public Arbitro() {
		
	}

	public Arbitro(Integer id, String nome, Date nascimento, char genero) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.genero = genero;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public char getGenero() {
		return genero;
	}
	
	
	
	

}

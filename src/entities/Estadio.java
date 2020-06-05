package entities;

public class Estadio {
	 
	private String nome;
	private Endereco endereco;
	
	public Estadio() {
		
	}

	public Estadio(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	

}

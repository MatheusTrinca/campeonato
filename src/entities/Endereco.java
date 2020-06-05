package entities;

public class Endereco {
	
	private String cidade;
	private String logradouro;
	private String bairro;

	public Endereco(String cidade, String logradouro, String bairro) {
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	
	
	
	

}

package br.com.banco.modelo;

public class Endereco {
	
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String numero;
	private String complemento;
	
	public void setAll(String logradouro, String bairro, String cidade, String uf, String cep, String numero,String complemento) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf
				+ ", cep=" + cep + ", numero=" + numero + ", complemento=" + complemento + "]";
	}
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, String bairro, String cidade, String uf, String cep, String numero,
			String complemento) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	

}

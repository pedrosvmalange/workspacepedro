	package br.com.universidade.modelo;

public class Professor {

	private String nome;
	private float valorHora;
	private String formacao;
	private String area;
	private String email;
	
	public void setAll(String nome, float valorHora, String formacao, String area, String email) {
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", valorHora=" + valorHora + ", formacao=" + formacao + ", area=" + area
				+ ", email=" + email + "]";
	}
	public Professor() {
		super();
	}
	public Professor(String nome, float valorHora, String formacao, String area, String email) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.formacao = formacao;
		this.area = area;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValorHora() {
		return valorHora;
	}
	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getEmail() {
		return email;		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String calcularSalario (int qtdeHoras) {
		return "Salário Bruto: " + (float)((valorHora*1.06)*qtdeHoras) + "\n" +
				"FGTS: " + (float)((valorHora*1.06)*qtdeHoras*0.08)  + "\n" +
				"Salário Líquido: " + ((float)((valorHora*1.06)*qtdeHoras) - (float)((valorHora*1.06)*qtdeHoras*0.08));
	}
	
	public String getSaudacao() {
		
		String primeironome = nome;
		if (nome.contains(" ")==true) {
			primeironome = nome.substring(0,nome.indexOf(" "));
		}
		
		if (formacao.toUpperCase().equals("DOUTOR")) {
			return ("PhD " + primeironome);
		} else if (formacao.toUpperCase().equals("MESTRE")) {
			return ("Ms " + primeironome);
		} else if (formacao.toUpperCase().equals("ESPECIALISTA")) {
			return ("Especialista " + primeironome);
		} else
			return "Sem formação" + primeironome;
		
	}
	

	
	
}

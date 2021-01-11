package br.com.universidade.modelo;

public class Aluno {

	private int rm;
	private String nome;
	private String fone;
	private boolean ativo;
		
	
	public void setAll(int rm, String nome, String fone, boolean ativo) {
		this.rm = rm;
		this.nome = nome;
		this.fone = fone;
		this.ativo = ativo;
	}
	
	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", fone=" + fone + ", ativo=" + ativo + "]";
	}
	public Aluno() {
		super();
	}
	public Aluno(int rm, String nome, String fone, boolean ativo) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.fone = fone;
		this.ativo = ativo;
	}
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getSaudacao() {
		if (nome.contains(" ")==true) {
		return (nome.substring(0,nome.indexOf(" ")));
		} else
		return nome;
	}
	
	
}

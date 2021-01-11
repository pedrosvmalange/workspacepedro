package br.com.ecomerceabc.modelo;

public class Produto {	
	/*
	 * Design Pattern (Padrões para projetos)
	 * DTO (Um pattern - Data Transfer Object), melhor forma para representar um diagrama de classe dentro da programação;
	 * - Diz que: 
	 * 		1) Todos os atributos devem ser privados;
	 * 		2) Cada atributo deve possuir INDIVIDUALMENTE métodos getters e setters (input e output);
	 * 		3) Toda classe BEANS deve possuir no minimo 2 construtores. Um vazio e outro com todos os parametros para os atributos
	 */

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	public Produto() {
		super();
	}
	
	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}	
	
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", qtde=" + qtde + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public String getAll() {
		return "Código: " + id + "\n" +
				"Descrição: " + descricao + "\n" +
				"Valor Venda: " + valorVenda + "\n" +
				"Valor Compra: " + valorCompra + "\n" +
				"Quantidade: " + qtde;
	}

	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

	public float getPromocao() {
		return (float) (valorVenda*0.9);
	}

	public float getTotalVendas() {
		return qtde*valorVenda;
	}

	public float getTotalCompras() {
		return qtde*valorCompra;
	}

	public void atualizarValores (float porcentagem) {
		valorCompra = valorCompra * (1 + (porcentagem/100));
		valorVenda = valorVenda * (1 + (porcentagem/100));
	}

	public String verificarEstoque() {
		if (qtde>20) {
			return "Estoque Alto";
		} else if (qtde<5) {
			return "Estoque Baixo";
		} 
		return "Estoque Normal";
	}

	public float getPromocao (float porcentagem) {
		return valorVenda*(1-porcentagem/100);
	}















}

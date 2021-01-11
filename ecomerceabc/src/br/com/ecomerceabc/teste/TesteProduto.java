package br.com.ecomerceabc.teste;

import br.com.ecomerceabc.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setDescricao("Churros");
		produto.setQtde(10);
		produto.setValorCompra(5);
		produto.setValorVenda(8);
		produto.setId(1);
		
		System.out.println("Produto: " + produto.getDescricao());
		System.out.println("Promoção: " + produto.getPromocao(20));
		System.out.println("Valor Venda: " + produto.getValorVenda());
		produto.atualizarValores(10);
		
		System.out.println(produto.getAll());
		System.out.println(produto.verificarEstoque());
		System.out.println("Total de Vendas: " + produto.getTotalVendas());
		System.out.println("Total de Compras: " + produto.getTotalCompras());
		
		
		
		
		
		
		
		
		
		
	}
	

	
}

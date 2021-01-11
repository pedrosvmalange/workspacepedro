package br.com.ecomerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecomerceabc.modelo.Produto;

public class TesteProduto2 {

	public static void main(String[] args) {

		Produto produto = new Produto();
		
		produto.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("Código")), 
				JOptionPane.showInputDialog("Descrição"), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda")), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor de Compra")), 
				Integer.parseInt(JOptionPane.showInputDialog("Quantidade"))
				);
		
		
		System.out.println(produto.getAll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

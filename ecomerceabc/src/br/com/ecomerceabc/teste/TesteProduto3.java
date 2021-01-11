package br.com.ecomerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecomerceabc.modelo.Produto;

public class TesteProduto3 {

	public static void main(String[] args) {


		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("ID"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
				);
		
		
		System.out.println(produto.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

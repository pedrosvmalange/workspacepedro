package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		

		/*
		 * Exibam no final 
		 * total sem imposto
		 * total com imposto
		 * s� o valor do imposto sobre o valor do produto
		 * total com imposto e 10% de desconto
		 */
		
		
		String nome = JOptionPane.showInputDialog("Digite o produto");
		String categoria = JOptionPane.showInputDialog("Digite a categoria do Produto");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		double imposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Imposto"));
		
		double totalSemImposto = valor * quantidade;
		double totalComImposto = totalSemImposto + ((imposto / 100) * totalSemImposto);
		
		System.out.println(nome);
		System.out.println(categoria);
		System.out.println(valor);
		System.out.println(quantidade);
		System.out.println(imposto);
		System.out.println(totalSemImposto);
		System.out.println(totalComImposto);
		System.out.println((totalComImposto - totalSemImposto));
		System.out.println((totalComImposto * 0.9));
		
				
	}

}

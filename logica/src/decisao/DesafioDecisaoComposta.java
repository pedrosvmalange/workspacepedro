package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
	
		
		/*
		 * Input: produto - qtde - valor unit�rio
		 * Preciso avaliar o estoque:
		 * se a qtde estiver entre 10 e 20 - o valor unit�rio ter� 10% de redu��o
		 * se a qtde estiver entre 5 e 9 - o valor unit�rio ter� 5% de redu��o
		 * se a qtde estiver menor que 5 - sem redu��o
		 * se a qtde estiver maior que 20 - 12% de redu��o
		 * 
		 * No final exibir o valor do produto atualizado
		 * 
		 */
		
		String produto = JOptionPane.showInputDialog("Produto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		
		if (quantidade<5) {
			System.out.println(valor);
		}else if (quantidade>20) {
			System.out.println(valor*0.88);
		}else if (quantidade>=10 && quantidade<=20) {
			System.out.println(valor*0.9);
		}else
			System.out.println(valor*0.95);
		
		
		
		
		
		
		

	}

}

package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex3 {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));

		String operacao = JOptionPane.showInputDialog("Operacao");

		if (operacao.contentEquals("+")) {
			System.out.println(valor1+valor2);
		} else if (operacao.contentEquals("-")) {
			System.out.println(valor1-valor2);
		} else if (operacao.contentEquals("*")) {
			System.out.println(valor1*valor2);
		} else if (operacao.contentEquals("/")) {
			if (valor2!=0) {
				System.out.println(valor1/valor2);	
			} else
				System.out.println("N�o � poss�vel dividir por Zero");	
		} else
			System.out.println("Operador Invalido");	

	}

}

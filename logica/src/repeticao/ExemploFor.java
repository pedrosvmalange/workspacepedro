package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		
		/*
		 * Sintaxe do For
		 * 1� Parte: definimos o contador e o valor inicial
		 * 2� Parte: condi��o (enquanto for verdadeiro o la�o ir� continuar)
		 * 3� Parte: como ocorrer� a contagem
		 */
		
		/*
		for (int contador=1 ; contador<500; contador++) { // conta de 1 e 1 de 0 a 499
			
			System.out.println(contador);
		}
		
		
		for (int contador=1 ; contador<500; contador+=2) { // conta de 2 e 2 de 1 at� 499 - pega s� impares
			
			System.out.println(contador);
		}
		
		
		
		for (int contador=100 ; contador>0; contador--) { // decresente de 100 at� 1 de 1 em 1
			
			System.out.println(contador);
		}
		*/
		
		
		
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada?"));
		for (int contador=1; contador<11; contador++) {
			System.out.println(tabuada + "x" + contador + "=" + (tabuada*contador) );
		}
		
		
		
		
		
		
		
		
		
		

	}

}

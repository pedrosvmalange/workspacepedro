package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {


		/*
		 * 1� Fase
		 * Jogador 1 vai digitar um n�mero
		 * Jogador 2 vai tentar adivinhar o numero digitado pelo jogador 1
		 * Quando ele acertar, mostra a mensagem de Parab�ns
		 * 
		 * 2� Fase
		 * Implemente Dicas para o jogador 2
		 * O numero � maior ou menor do que o que vc digitou
		 * 
		 * 3� Fase
		 * Contar quantas tentativas o jogador 2 utilizou para acertar
		 * No final exibir a quantidade junto com a mensagem de Parab�ns
		 */


		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o numero informado"));
		int i = 1;

		while (numero2!=numero1) {				
			i = i+1;	
			// poderia ser: i++;
			if (numero2>numero1) {				
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Incorreto, tente novamente um numero menor: "));
			}else {
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Incorreto, tente novamente um numero maior: "));
			}
		}

		JOptionPane.showMessageDialog(null, "Parab�ns, voc� realizou " + i + " tentativa(s)");













	}

}

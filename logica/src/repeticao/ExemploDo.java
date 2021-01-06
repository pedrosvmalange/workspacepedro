package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {



		int valor1=0;
		int valor2=0;
		do {
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (valor1+valor2)); //sempre coloca NULL (a não ser que você crie sua propria janela)
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

		// importante não criar variáveis DENTRO do laço pois cada vez que a repetição é executada a variáve aloca 1 lugar na memoria
		// se for executado 100x teremos 99 espaços de memoria que são lixos

		// sempre criar a variável antes do laço









	}

}

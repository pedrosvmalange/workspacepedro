package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {



		int valor1=0;
		int valor2=0;
		do {
			valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
			JOptionPane.showMessageDialog(null, "Resultado: " + (valor1+valor2)); //sempre coloca NULL (a n�o ser que voc� crie sua propria janela)
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

		// importante n�o criar vari�veis DENTRO do la�o pois cada vez que a repeti��o � executada a vari�ve aloca 1 lugar na memoria
		// se for executado 100x teremos 99 espa�os de memoria que s�o lixos

		// sempre criar a vari�vel antes do la�o









	}

}

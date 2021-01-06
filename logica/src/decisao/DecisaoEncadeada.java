package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {


		String disciplina = JOptionPane.showInputDialog("Disciplina");
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Faltas"));

		if (faltas>=20) {
			System.out.println("Voc� est� reprovado por faltas");
		}else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1 + nota2) / 2;

			// m�dia � 6
			/*
			 * Acrescenta um input para faltas
			 * Aprova��o do aluno acontecer� quando media for maior que 6 e faltas menor que 20
			 * Exame acontecer� quando a m�dia estiver entre 4 e 5 e falta menor que 20
			 * Reprovado quando a nota for menor que 4 ou falta maior que 20
			 */

			if (media>=6) {
				System.out.println("Parab�ns voc� foi aprovado na Disciplina: " + disciplina);
			}else if (media<6 && media>=4) {
				System.out.println("Voc� ficou de exame na Disciplina: " + disciplina);
			}else {
				System.out.println("Voc� foi reprovado na Disciplina: " + disciplina);
			}
			System.out.println("Media: " + media);
		}	


	}

}

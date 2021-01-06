package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
	/*
	 * Ter� que imputar: nome de uma pessoa e a ideia
	 * Dever� exibir uma das mensagens
	 * Se for maior que 70 anos, ou igual 16 ou 17 - "VOTO FACULTATIVO
	 * Se for menor que 16 anos; "PROIBIDO VOTAR" 
	 * Se for entre 18 e 70 - "OBRIGADO A VOTAR"
	 */
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		System.out.println("Nome: " + nome);
			
		if (idade>70 || idade==16 || idade==17) {
			System.out.println("VOTO FACULTATIVO");
		}
		
		if (idade<16) {
			System.out.println("PROIBIDO VOTAR");
		}
			
		if(idade>=18 && idade<=70) {
			System.out.println("OBRIGADO A VOTAR");
		}
		
		
	
		
		

	}

}

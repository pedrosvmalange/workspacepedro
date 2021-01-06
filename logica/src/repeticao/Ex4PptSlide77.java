package repeticao;

import javax.swing.JOptionPane;

public class Ex4PptSlide77 {

	public static void main(String[] args) {

		String nome = "";
		int idade = 0;
		int qtdepessoas=0;
		int maior=0;
		int somaidade = 0;
		int idadeExp = 0;
		int idadeN = 0;
		String nomeN = "";
		String nomeExp ="";
			
		do {

			nome = JOptionPane.showInputDialog("Digite seu nome");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			
			somaidade = idade + somaidade; // somando as idades
			qtdepessoas++; // contando quantas pessoas cadastradas
			
			if (idade>18) { 
				maior++; // contando quantas pessoas maiores de 18
			}

			
			if (idade>idadeExp) { // mais experiente
				idadeExp = idade;
				nomeExp = nome;			
			}
			
			if (idade<idadeN || qtdepessoas==1) { // mais novo
				idadeN = idade;
				nomeN = nome;
			}
										
				System.out.println("Nome:" + nome + " Idade:" + idade);
				
			
		}while(JOptionPane.showConfirmDialog(null, "Deseja realizar outro cadastro?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);

		
		System.out.println("Maiores de Idade: " + maior);
		System.out.println("Media das Idades: " + somaidade/qtdepessoas);		
		System.out.println("O mais expriente é: " + nomeExp + " com " + idadeExp + " anos");
		System.out.println("O mais novo é: " + nomeN + " com " + idadeN + " anos");

	}

}

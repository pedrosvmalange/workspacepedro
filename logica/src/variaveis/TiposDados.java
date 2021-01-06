package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Existem dois tipos de dados
		 * 
		 * - alfanum�rico: � o dado que N�O VAI ser utilizado em uma express�o matem�tica
		 * e tamb�m n�o � um dado sens�vel (muito utilizado) para o modelo de neg�cio.
		 * EM JAVA=> String
		 *  
		 * - num�rico: � o dado que PODE ser utilizado em uma express�o matem�tica.
		 * EM JAVA => int (numeros inteiros) e double (para numeros reais - casas decimais)
		 */
		
		/*
		 * Nome da vari�vel: Identificador
		 * 
		 * Regras:
		 * 1� N�o pode come�ar com n�mero. Ex: 1Berto
		 * 2� N�o pode fazer uso de palavras reservadas. Ex: int / double
		 * 3� N�o pode usar caract�res especiais. Ex: D@t@ / Nome Cliente (n�o pode ter espa�o).
		 * 
		 * Padr�es:
		 * 1� Nomes significativos. Evitem X, XPTO, FULANO, etc...
		 * 2� Come�a com letra min�scula
		 * 3� Padr�o CamelCase (dataNascimento) Correto - n�o utiliza espa�o e coloca a segunda palavra iniciando com MAIUSCULA
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		/*
		 * Tipos num�ricos s�o primitivos, para apoi�-los utilizamos as classes Wrappers
		 * int = Integer
		 * double = Double
		 * short = Short
		 * boolean = Boolean
		 */
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome:.. " + nome);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("IMC: " + imc);
		
		
		
		
		
		
		
	}
	
	

}

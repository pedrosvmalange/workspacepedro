package br.com.elevadores.modelo;

public class Elevadores {


	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdePessoas;
	private short andarAtual;

	/*
	 * Sintaxe dos métodos
	 * <modificador> <tipo do retorno> <nome do metodo> (<tipo do parametro><nome do parametro>)
	 */

	public void inicializar (short capacidade, short maior, short menor) {
		capacidadeMaxima = capacidade;
		andarMaximo = maior;
		andarMinimo = menor;
	}

	public String verificarStatus() {
		return "Quantidade de pessoas: " + qtdePessoas + "\n" + "Andar Atual: " + andarAtual + "\n" + "Capacidade Maxima: " + capacidadeMaxima;
	}

	public void subir() {
		if(andarAtual<andarMaximo) {
			andarAtual++;
		}
	}

	public void descer() {
		if(andarAtual>andarMinimo) {
			andarAtual--;
		}
	}

	public void entrar (short qtde) {
		if((qtdePessoas+qtde)<=capacidadeMaxima) {
			qtdePessoas+=qtde;
		}
	}

	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}

	public void sair (short qtde) {
		if ((qtdePessoas-qtde)>=0)
			qtdePessoas-=qtde;
	}








}

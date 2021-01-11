package br.com.ecomerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecomerceabc.modelo.ClientePF;
import br.com.ecomerceabc.modelo.ClientePJ;
import br.com.ecomerceabc.modelo.Colaborador;
import br.com.ecomerceabc.modelo.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {


		Pessoa pessoa = null;
		
		char resp = JOptionPane.showInputDialog("Digite:\n<F> Física \n<J> Juridica \n<C> Colaborador").toUpperCase().charAt(0);
		
		if (resp=='F') {
			pessoa = new ClientePF();
		} else if (resp=='J') {
			pessoa = new ClientePJ();	
		} else if (resp=='C') {
			pessoa = new Colaborador();
		} else		
			System.out.println("Opção invalida!!");
		
		
		System.out.println(pessoa.getResumo());
	
	
		
		
		
		
		
		
		
		
		
		
	}

}

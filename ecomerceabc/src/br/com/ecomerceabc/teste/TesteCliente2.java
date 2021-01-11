package br.com.ecomerceabc.teste;

import javax.swing.JOptionPane;

import br.com.ecomerceabc.modelo.Pessoa;
import br.com.ecomerceabc.modelo.Endereco;

public class TesteCliente2 {

	public static void main(String[] args) {

		Pessoa cliente = new Pessoa(
				Integer.parseInt(JOptionPane.showInputDialog("Código")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("Email"),
				new Endereco(
						JOptionPane.showInputDialog("Logradouro"),
						JOptionPane.showInputDialog("Bairro"),
						JOptionPane.showInputDialog("Cidade"),
						JOptionPane.showInputDialog("UF"),
						JOptionPane.showInputDialog("Cep"),
						JOptionPane.showInputDialog("Numero"),
						JOptionPane.showInputDialog("Complemento")
						)
				);
		
		System.out.println(cliente.getEndereco().getBairro());
		System.out.println(cliente.toString());
	
		
		
		
		
		
		
		
		
		

	}

}

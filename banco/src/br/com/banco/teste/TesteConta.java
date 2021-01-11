package br.com.banco.teste;

import javax.swing.JOptionPane;

import br.com.banco.modelo.Agencia;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Gerente;

public class TesteConta {


	public static void main(String[] args) {

		Conta conta = new Conta(
				Integer.parseInt(JOptionPane.showInputDialog("Numero da Conta")),
				Float.parseFloat(JOptionPane.showInputDialog("Saldo")),
				new Cliente(
						Integer.parseInt(JOptionPane.showInputDialog("Código")),
						JOptionPane.showInputDialog("Nome do cliente"),
						JOptionPane.showInputDialog("Email do cliente"),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro do cliente"),
								JOptionPane.showInputDialog("Bairro do cliente"),
								JOptionPane.showInputDialog("Cidade do cliente"),
								JOptionPane.showInputDialog("UF do cliente"),
								JOptionPane.showInputDialog("Cep do cliente"),
								JOptionPane.showInputDialog("Numero do cliente"),
								JOptionPane.showInputDialog("Complemento do cliente")
								)
						),
				new Agencia(
						JOptionPane.showInputDialog("Nome da AG"),
						Integer.parseInt(JOptionPane.showInputDialog("Numero da AG")),
						new Endereco(
								JOptionPane.showInputDialog("Logradouro da AG"),
								JOptionPane.showInputDialog("Bairro da AG"),
								JOptionPane.showInputDialog("Cidade da AG"),
								JOptionPane.showInputDialog("UF da AG"),
								JOptionPane.showInputDialog("Cep da AG"),
								JOptionPane.showInputDialog("Numero da AG"),
								JOptionPane.showInputDialog("Complemento")
								),
						JOptionPane.showInputDialog("Telefone da AG"),
						Integer.parseInt(JOptionPane.showInputDialog("Código da AG"))
						),
				new Gerente(
						JOptionPane.showInputDialog("Nome do gerente"),
						JOptionPane.showInputDialog("Telefone do gerente"),
						JOptionPane.showInputDialog("Email do gerente"),
						Integer.parseInt(JOptionPane.showInputDialog("Funcional do gerente"))
						)
				);



		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Nome do cliente : " + conta.getCliente().getNome());
		System.out.println("Cidade do endereço do cliente : " + conta.getCliente().getEndereco().getCidade());
		System.out.println("Nome do gerente: " + conta.getGerente().getNome());
		System.out.println("Nome da agencia: " + conta.getAgencia().getNome());







	}

}

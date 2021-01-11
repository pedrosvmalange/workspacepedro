package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.interfaces.Magica;

public class ImplementarConta {

	public static void main(String[] args) {


		Conta conta = null;
		
		do {
			
		char resp = JOptionPane.showInputDialog("Para cadastrar Conta Corrente digite <C>, para poupanã digite <P>").toUpperCase().charAt(0);
		
		if (resp=='C') {
			conta = new Corrente(
					Magica.r("Digite o numero da conta"),
					Magica.b("Digite o digito da conta"),
					Magica.r("Digite o numero da agencia"),
					Magica.f("Digite o saldo da conta"),
					new Cliente(
							Magica.i("Digite o ID do cliente"),
							Magica.s("Digite o nome do cliente"),
							Magica.s("Digite o CPF do cliente"),
							Magica.s("Digite o telefone do cliente")
							),
					Magica.f("Digite o limite da conta da CC"),
					Magica.f("Digite a taxa da CC")
					);
		} else if (resp=='P') {
			conta = new Poupanca(
					Magica.r("Digite o numero da conta"),
					Magica.b("Digite o digito da conta"),
					Magica.r("Digite o numero da agencia"),
					Magica.f("Digite o saldo da conta"),
					new Cliente(
							Magica.i("Digite o ID do cliente"),
							Magica.s("Digite o nome do cliente"),
							Magica.s("Digite o CPF do cliente"),
							Magica.s("Digite o telefone do cliente")
							),
					Magica.f("Digite o rendimento")
					);	
		} else		
			System.out.println("Opção invalida!!");
		
		}while (JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra conta?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
			
			System.out.println(conta.toString());
			System.out.println(conta.depositar(Magica.f("Valor do Deposito")));
			System.out.println(conta.sacar(Magica.f("Valor do saque")));
			System.out.println(conta.verificarSaldo());
		
		
		
		
		
		
	}

}

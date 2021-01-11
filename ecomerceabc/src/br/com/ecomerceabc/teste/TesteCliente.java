package br.com.ecomerceabc.teste;

import br.com.ecomerceabc.modelo.Pessoa;
import br.com.ecomerceabc.modelo.Endereco;

public class TesteCliente {

	public static void main(String[] args) {

	
		Pessoa cliente = new Pessoa();
		
		cliente.setId(1);
		cliente.setNome("xpto");
		cliente.setEmail("xpto@gama.com.br");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setLogradouro("Av Itaquera");
		endereco.setBairro("Itaquera");
		endereco.setCidade("Sao Paulo");
		endereco.setCep("12345-123");
		endereco.setComplemento("Viela 456");
		endereco.setNumero("77");
		endereco.setUf("SP");
		
		System.out.println(cliente.toString());
	
		
		
		
		
		
		
		
		
		
		
		

	}

}

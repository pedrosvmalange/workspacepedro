package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {

		// Criar um objeto: não possui qualquer repartição, não pode ser usado; Ex: Veiculo objeto;	
		// Instanciar um objeto: possui todas as repartições, pode ser usado; Ex: Veiculo objeto = new Veiculo();

		Veiculo objeto = new Veiculo();

		objeto.preencherMontadora("fiat");
		objeto.preencherModelo("Uno");
		objeto.preencherVelocidadeMaxima(180);
		objeto.preencherValor(30000);

		System.out.println("Montadora: " + objeto.retornarMontadora());
		System.out.println("Modelo: " + objeto.retornarModelo());
		System.out.println("Velocidade Max: " + objeto.retornarVelocidadeMaxima());
		System.out.println("Valor: " + "R$" + objeto.retornarValor());

		System.out.println(objeto.ligar());

		objeto.acelerar(20);
		objeto.acelerar();
		objeto.acelerar(250);		
		System.out.println(objeto.verificarStatus());
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.verificarStatus());

		System.out.println(objeto.desligar());
		objeto.acelerar();	
		System.out.println(objeto.verificarStatus());







	}

}

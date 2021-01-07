package br.com.elevadores.aplicacao;

import br.com.elevadores.modelo.Elevadores;

public class AplicacaoElevadores {

	public static void main(String[] args) {
		
		Elevadores objeto = new Elevadores();
		
		objeto.inicializar((short)30, (short)5, (short)0); // capacidade, andarmax, andarmin
		System.out.println(objeto.verificarStatus());
		
		//objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		//objeto.descer();
		//objeto.sair();
		
		
		System.out.println(objeto.verificarStatus());
		

	}

}

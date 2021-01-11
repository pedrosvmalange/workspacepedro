package br.com.bankofoz.beans;

import br.com.bankofoz.interfaces.PadraoConta;

public class Poupanca extends Conta implements PadraoConta{


	private float rendimento;


	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", conta=" + super.toString() +"]";
	}

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public boolean sacar(float valor) {
		if ((super.getSaldo() - valor)>=0) {
			super.setSaldo(super.getSaldo()-valor);
			return true;
		} else
			return false;
	}

	@Override
	public boolean depositar(float valor) {
		if (valor>=0) { 
			super.setSaldo(super.getSaldo()+valor);
			return true;
		} else
			return false;	
	} 

	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo()*(1 + (rendimento/100)));
	}

	public float verificarSaldo() {
		return getSaldo();
	}











}

package br.com.bankofoz.interfaces;

import javax.swing.JOptionPane;

public class Magica {

	
	// m�todos est�ticos n�o exigem inst�ncia do objeto
	public static String s(String msg ) {  // agora no c�digo podemos substituir "JOptionPane.showInputDialog" por "s";
		return 	JOptionPane.showInputDialog(msg).toUpperCase();	
	}
	
	public static int i (String msg) { // substitui Integer.parseInt(JOptionPane.showInputDialog por "i"
		return Integer.parseInt(s(msg));
	}
	
	public static float f (String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static short r (String msg) {
		return Short.parseShort(s(msg));
	}
	
	public static byte b (String msg) {
		return Byte.parseByte(s(msg));
	}
	
}

package br.com.universidade.util;

import javax.swing.JOptionPane;

public class Magica {

	
	// métodos estáticos não exigem instância do objeto
	public static String s(String msg ) {  // agora no código podemos substituir "JOptionPane.showInputDialog" por "s";
		return 	JOptionPane.showInputDialog(msg).toUpperCase();	
	}
	
	public static int i (String msg) { // substitui Integer.parseInt(JOptionPane.showInputDialog por "i"
		return Integer.parseInt(s(msg));
	}
	
	public static float f (String msg) {
		return Float.parseFloat(s(msg));
	}
	
	public static boolean b (String msg) {
		int resp = JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION);
		if (resp==0) {
			return true;
		}
		return false;
	}
	
	
	
}

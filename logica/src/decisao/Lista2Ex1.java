package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex1 {

	public static void main(String[] args) {
		
		
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Di�rias"));
		double fixo = 80.00;
		
		if (diaria>15) {
			System.out.println(fixo*diaria + diaria*5.5);
		} else if (diaria==15) {
			System.out.println(fixo*diaria + diaria*6);
		} else
			System.out.println(fixo*diaria + diaria*8);
	}

}


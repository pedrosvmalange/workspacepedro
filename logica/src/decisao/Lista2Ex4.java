package decisao;

import javax.swing.JOptionPane;

public class Lista2Ex4 {

	public static void main(String[] args) {


		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3"));

		if (n1==n2 || n1==n3 || n2==n3) {
			System.out.println("Existem n�meros repetidos");
		} else {

			if (n1 > n2 && n1 > n3) {
				if (n2>n3) {
					System.out.println(n1 + "\n" + n2 + "\n" + n3);
				} else 
					System.out.println(n1 + "\n" + n3 + "\n" + n2);		
			}

			if (n2 > n1 && n2 > n3) {
				if (n1>n3) {
					System.out.println(n2 + "\n" + n1 + "\n" + n3);
				} else 
					System.out.println(n2 + "\n" + n3 + "\n" + n1);		
			}

			if (n3 > n1 && n3 > n2) {
				if (n1>n2) {
					System.out.println(n3 + "\n" + n1 + "\n" + n2);
				} else 
					System.out.println(n3 + "\n" + n2 + "\n" + n1);		
			}

		}		


	}

}

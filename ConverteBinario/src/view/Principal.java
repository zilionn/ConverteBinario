package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController convertCont = new ConverteController();
		
		int dec;
		
		do
		dec = Integer.parseInt(JOptionPane.showInputDialog("Insira um númeiro inteiro: "));
		while (dec > 1000);
		
		String binario = convertCont.decToBin(dec);
		
		JOptionPane.showMessageDialog(null, "Número em binário: " + binario);
		}

	}



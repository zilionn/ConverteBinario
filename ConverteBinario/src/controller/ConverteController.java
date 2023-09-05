package controller;

import model.PilhaInt;

public class ConverteController {

	private PilhaInt pInt;
	
	private String bin;
	
	public ConverteController() {
		pInt = new PilhaInt();
		bin = "";
	}
	
	public String decToBin (int decimal) {
		if (decimal == 0) {
			return "0";
		}
		
		while (decimal > 0) {
			int resto = decimal %2;
			pInt.push(resto);
			decimal /= 2;
			
		}
		while (!pInt.isEmpty()) {
			try {
				bin = String.valueOf(bin + pInt.pop());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	return bin;
	}
}

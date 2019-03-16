package org.ismek.ders1;

public class ExcelHucreProgram {

	public static void main(String[] args) {
		String[] satir = {"1", "2", "3"};
		String[] sutun = {"A", "B", "C", "D" };
		String[][] satirSutun = new String[satir.length][sutun.length];
		
		for (int i = 0; i < satir.length; i++) {
			for (int j = 0; j < sutun.length; j++) {
				System.out.println(sutun[j] + satir[i]);
				satirSutun[i][j] = sutun[j] + satir[i];
			}
		}
		System.out.println();
	}

}

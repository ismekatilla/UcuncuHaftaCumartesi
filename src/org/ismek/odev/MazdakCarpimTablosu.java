package org.ismek.odev;

import java.util.Scanner;

public class MazdakCarpimTablosu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int rakam = input.nextInt();
		for (int i = 1; i < 10; i++) {
			int carpim;
			carpim = i * rakam;
			System.out.println(i + "x" + rakam + "=" + carpim);
		}
	}

}

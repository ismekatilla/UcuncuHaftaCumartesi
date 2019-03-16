package org.ismek.odev;

import java.util.Scanner;

public class CansuIciBosKare {

	public static void main(String[] args) {
		Scanner klayvedenGirilen = new Scanner(System.in);

		System.out.println("kýsa kenar uzunluðunu giriniz:");
		int kýsaKenar = klayvedenGirilen.nextInt();
		System.out.println("uzun kenar uzunluðunu giriniz:");
		int uzunKenar = klayvedenGirilen.nextInt();

		for (int i = 0; i <= kýsaKenar; i++) {

			if (i >= 1 || i <= kýsaKenar - 1)
				for (int j = 1; j <= uzunKenar - 1; j++) {
					System.out.print("n");
				}
			else {
				for (int j = 0; j <= uzunKenar; j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}
}
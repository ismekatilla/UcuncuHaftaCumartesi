package org.ismek.ders1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Faktoriyel Alınacak Sayıyı Giriniz = ");
		byte faktoriyelAlinacakSayi = scanner.nextByte();
		int sonuc = 1;
		for (int i = 1; i <= faktoriyelAlinacakSayi; i++) {
			sonuc = sonuc * i;
		}
		System.out.println(sonuc);
	}
}
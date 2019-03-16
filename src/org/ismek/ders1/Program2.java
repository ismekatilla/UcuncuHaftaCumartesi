package org.ismek.ders1;

import java.util.Scanner;

public class Program2 {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("------------ Fatih Bilişim Okulu Java 1 Dersi -------------");

		do {
			System.out.println(
					"1. Faktoriyel Al\n" + 
					"2. Çarpım Hesapla\n" + 
					"3. Çıkış Yap\n" + 
					"İşlem No Giriniz");

			byte islemNo = scanner.nextByte();
			if (islemNo == 1) {
				faktoriyelHesapla();
			} else if (islemNo == 2) {
				System.out.println("Çarpım Sonuc");
			} else {
				System.out.println("Çıkış Yapıldı");
				break;
			}
		} while (true);

	}
	
	private static void faktoriyelHesapla() {
		do {
			System.out.print("Faktoriyel Alınacak Sayıyı Giriniz = ");
			byte faktoriyelAlinacakSayi = scanner.nextByte();
			int sonuc = 1;
			for (int i = 1; i <= faktoriyelAlinacakSayi; i++) {
				sonuc = sonuc * i;
			}
			System.out.println("Faktoriyel Sonucu = " + sonuc);
			System.out.println("Devam etmek için herhangi bir tuşa basınız. Ana Menü için 1 e basınız.");
			int girilenSayi = scanner.nextInt();
			if (girilenSayi == 1) {
				break;
			}
		} while (true);
	}

}

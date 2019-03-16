package org.ismek.ders1;

import java.util.Random;
import java.util.Scanner;

public class Dizi {

	public static void main(String[] args) {
		System.out.print("Kaç tane rastgele sayı üretilecek = ");
		Scanner scanner = new Scanner(System.in);
		byte rastgeleUretilecekSayiAdeti = scanner.nextByte();
		
		int [] sayiDizisi = new int[rastgeleUretilecekSayiAdeti];
		
		Random random = new Random();
		for (int i = 0; i < rastgeleUretilecekSayiAdeti; i++) {
			int rastgeleUretilenSayi = random.nextInt(100);
			sayiDizisi[i] = rastgeleUretilenSayi;
		}
		
		for (int rastgeleSayi : sayiDizisi) {
			System.out.println(rastgeleSayi);
		}
		
		int enKucukSayi = sayiDizisi[0];
		for (int rastgeleSayi : sayiDizisi) {
			if (enKucukSayi > rastgeleSayi) {
				enKucukSayi = rastgeleSayi;
			}
		}
		System.out.println("En Küçük Sayı = " + enKucukSayi);
		
		int enBuyukSayi = 0;
		for (int rastgeleSayi : sayiDizisi) {
			if (enBuyukSayi < rastgeleSayi) {
				enBuyukSayi = rastgeleSayi;
			}
		}
		System.out.println("En Büyük Sayı = " + enBuyukSayi);
	}

}

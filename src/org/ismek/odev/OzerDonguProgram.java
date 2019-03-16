package org.ismek.odev;

import java.util.Scanner;

public class OzerDonguProgram {

	public static void main(String[] args) {
		Scanner klavyedenOku = new Scanner(System.in);
		boolean a = true;
		while (a == true) {
			System.out.print("Gün kodunu giriniz = ");
			String haftaninGunuKodu = klavyedenOku.nextLine();

			haftaninGunuKodu = haftaninGunuKodu.toUpperCase();

			switch (haftaninGunuKodu) {
			case "PTS":
				System.out.println("Pazartesi");
				break;
			case "SL":
				System.out.println("Salı");
				break;
			case "CRS":
				System.out.println("Çarşamba");
				break;
			case "PRS":
				System.out.println("Perşembe");
				break;
			case "CM":
				System.out.println("Cuma");
				break;
			case "CMT":
				System.out.println("Cumartesi");
				break;
			case "PZ":
				System.out.println("Pazar");
				break;
			default:
				System.out.println("Girdiğiniz kod herhangi bir gün ile eşleştirilemedi...!!!!");
				break;
			}
			System.out.println("Tekrardan gün girmek istiyorsanız A'e basınız=");
			klavyedenOku.nextLine();
			String kullaniciCevap = klavyedenOku.next();
			if (kullaniciCevap == "A") {
				continue;
			} else {
				break;
			}
		}
		System.out.println("A'e basmadığınız için tekrardan gün giremeyeceksiniz ...!!!");
	}
}

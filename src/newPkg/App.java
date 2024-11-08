package newPkg;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secim = -1;
		LinkedList ogrList = new LinkedList();
		Scanner scanner=new Scanner(System.in);
		while (secim != 0) {
			System.out.println();
			System.out.println("ÖĞRENCİ KAYIT UYGULAMASI");
			System.out.println("_________________________________");
			System.out.println("1 - Yeni Kayıt");
			System.out.println("2 - Kayıt Sil");
			System.out.println("3 - Kayıtları Listele");
			System.out.println("0 - Çıkış");
			System.out.print("seçiminiz : ");
			secim=scanner.nextInt();
			if(secim==1) {
				ogrList.ekle();
			}else if(secim==2) {
				ogrList.sil();
			}else if(secim==3) {
				ogrList.yazdir();
			}else if(secim==0) {
				System.out.println("Programdan çıkılıyor iyi günler...");
			}else {
				System.out.println("Hatalı Seçim Lütfen Yeniden Deneyiniz");
			}
		}
	}

}

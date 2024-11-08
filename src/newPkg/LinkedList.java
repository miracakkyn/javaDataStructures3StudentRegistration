package newPkg;

import java.util.Scanner;

public class LinkedList {
	Node head;
	Node tail;

	String name;
	String surName;
	int number;
	int mid;
	int fin;

	double avg;
	String durum;
	Scanner scanner = new Scanner(System.in);

	void ekle() {
		System.out.println("Kayıt olacak öğrenci bilgilerini giriniz : ");

		System.out.println("İsim : ");
		name = scanner.nextLine();
		System.out.println("Soyisim : ");
		surName = scanner.nextLine();
		System.out.println("Numara : ");
		number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Vize : ");
		mid = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Final : ");
		fin = scanner.nextInt();
		scanner.nextLine();

		Node eleman = new Node(name, surName, number, mid, fin);
		if (head == null) {
			head = eleman;
			tail = eleman;
			System.out.println("Kayıt olacak öğrencilerin liste yapısı oluşturuldu ilk öğrenci kayıt oldu!!!");

		} else {
			tail.next = eleman;
			tail = eleman;
			System.out.println(number + " numaralı öğrenci bölüme kayıt edildi!!!");
		}

	}

	void sil() {
		if (head == null) {
			System.out.println("Liste boş silinecek öğrenci yok");
		} else {
			System.out.println("Kaydı silinecek öğrenci numarasını giriniz: ");
			number = scanner.nextInt();
			if (head.next == null && head.number == number) {
				head = null;
				tail = null;
				System.out.println(number + " numaralı öğrencinin kaydı silindi ve liste boş");
			} else if (number == head.number && head.next != null) {
				head = head.next;
				System.out.println(number + " numaralı öğrenci silindi");
			} else {
				Node temp = head;
				Node temp2 = head;
				while (temp.next != null) {
					temp2 = temp;
					temp = temp.next;
					if (temp.number == number) {
						temp2.next = temp.next;
						System.out.println(number + " numaralı öğrenci kaydı silindi");
						break;
					}
				}
				if (temp.number == number) {
					System.out.println(number + " numaralı öğrenci kaydı silindi");
					temp2.next = null;
					tail = temp2;
				} else {
					System.out.println(number + " numaralı öğrenci kaydı bulunamadı");

				}

			}
		}

	}

	void yazdir() {
		if (head == null) {
			System.out.println("Liste boş yazdırılacak öğrenci yok");
		} else {
			Node temp = head;
			System.out.println("_________________________________________________________");

			while (temp != null) {
				System.out.println(temp.number + " " + temp.name + " " + temp.surName + " " + temp.mid + " " + temp.fin
						+ " " + temp.avg + " " + temp.durum);
				temp = temp.next;
			}
		}
	}
}

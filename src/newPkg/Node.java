package newPkg;

public class Node {
	String name;
	String surName;
	int number;
	int mid;
	int fin;
	double avg;
	String durum;
	Node next;
	public Node(String name, String surName, int number, int midtermExam, int finalExam) {
		this.name = name;
		this.surName = surName;
		this.number = number;
		this.mid = midtermExam;
		this.fin = finalExam;
		avg=midtermExam*0.4+finalExam*0.6;
		if(avg>=50) {
			durum="Geçti";
		}else {
			durum="Kaldı";
		}
	}
	
	

}

package tugasTeori;
import java.util.Scanner;

public class Student extends tugas {
	private String nim;
	private double spp;
	private double sks;
	private double modul;
	
	public void inputInfo() {
		super.inputInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input NIM: ");
		nim = scanner.nextLine();
		System.out.println("Input SPP: ");
		spp = scanner.nextDouble();
		System.out.println("Input SKS: ");
		sks = scanner.nextDouble();
		System.out.println("Input Modul: ");
		modul = scanner.nextDouble();
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("NIM: " + nim);
		System.out.println("SPP: " + spp);
		System.out.println("SKS: " + sks);
		System.out.println("Modul: " + modul);
		System.out.println("Total Payment: " + hitungPembayaran());
	}
	
	public double hitungPembayaran() {
		return spp + sks + modul;
	}

}

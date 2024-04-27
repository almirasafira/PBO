package tugasTeori;
import java.util.Scanner;

public class tugas {
	protected String nama;
	protected String alamat;
	protected String hobby;
	
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input nama: ");
		nama = scanner.nextLine();
		System.out.println("Input alamat: ");
		alamat = scanner.nextLine();
		System.out.println("Input hobby: ");
		hobby = scanner.nextLine();
	}
	
	public void displayInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("Alamat: " + alamat);
		System.out.println("Hobby: " + hobby);
	}
	
} 

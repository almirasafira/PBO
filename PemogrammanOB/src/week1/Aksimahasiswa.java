package week1;

public class Aksimahasiswa {

	public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(); //mhs nama objek dibuat dengan class mahasiswa
        mhs1.nim = "A11.2022.14336";
        mhs1.nama = "Almira Zuhrotus Safira";
        mhs1.usia = 20;
        mhs1.getIdentitas();
        mhs1.belajar();

        Mahasiswa mhs2 = new Mahasiswa(); //Mahasiswa
        mhs2.nim = "A11.2022.14256";
        mhs2.nama = "Almi";
        mhs2.usia = 9;
        mhs2.getIdentitas();
        mhs2.belajar();

	}

}

public class main {
    public static void main(String[] args) {
  
        MAHASISWA mahasiswa1 = new MAHASISWA("John Doe", "123456", 20);
        
        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.displayInfo();
        
        mahasiswa1.setNama("Jane Smith");
        
        System.out.println("\nInformasi Mahasiswa setelah perubahan:");
        mahasiswa1.displayInfo();
    }
}
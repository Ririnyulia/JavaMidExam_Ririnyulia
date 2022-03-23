package data;

public class LaptopApp {
    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop();
        System.out.println("\nNama          : "+laptop1.getNama());
        System.out.println("Brand           : "+laptop1.getBrand());
        System.out.println("Nama Processor  : "+laptop1.getProcessor());
        System.out.println("Jumlah Core     : "+laptop1.getJumlahCore());
        System.out.println("Sistem Operasi  : "+laptop1.getSO());
        System.out.println("Ukuran RAM dalam GB : "+laptop1.getRAM());
        System.out.println("Jenis Storage   : "+laptop1.getStorage());
        System.out.println("Stok            : "+laptop1.getStok()+"\n");
       
        System.out.println("=============================================");

        
        Laptop laptop2 = new Laptop("Ririn", "Acer", "Intel Core i5-8th Gen", 
                "5 Core", "Windows 10", "64GB", "SSD SATA", 2);
        System.out.println(laptop2);
    }
}

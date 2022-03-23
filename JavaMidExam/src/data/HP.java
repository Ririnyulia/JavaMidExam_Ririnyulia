package data;

public class HP extends Laptop{
    String display, graphic, storefront;
    
    public HP(String nama, String brand, String processor, String jumlahCore, String SO, 
            String RAM, String storage, int stok){
        super(nama, brand, processor, jumlahCore, SO, RAM, storage, stok);
        getStorefront();
        Stok();
    }

    public void Stok(){
        if (stok <= 0) {
            stok = 0;
        }
    }

    public String getDisplay() {
        System.out.println("Display     : 14 Inch");
        return display;
    }

    public void getGraphic() {
        System.out.println("Graphic     : AMD Radeon 530 Graphics");
    }
    
    public String getStorefront() {
        if (storage == "SSD M.2") {
            storefront = "Best";
        } else if(storage == "SSD SATA"){
            storefront = "Good";
        } else if(storage == "HDD"){
            storefront = "Middle";
        } else {
            storefront = "Unknown";
        }
        return storefront;
    }
    
    public String toString(){
        return   "Nama          : "+nama
                +"\nBrand       : "+brand
                +"\nProcessor   : "+processor
                +"\nJumlah Core : "+jumlahCore
                +"\nSistem Operasi : "+SO
                +"\nRAM         : "+RAM
                +"\nStorage     : "+storage
                +"\nStorefront  : "+storefront
                +"\nStok        : "+stok;
    }
}

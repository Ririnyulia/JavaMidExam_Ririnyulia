package application;

import data.*;

public class Application {
    public static void main(String[] args) {
        
        Acer acer = new Acer("ACER ASPIRE 3 A313-35", "ACER", "Intel Celeron N5100", 
                "2", "Windows 11 Home x64", "4", "HDD", 10);
        System.out.println("Laptop Acer");
        System.out.println(acer);
        acer.getDisplay();
        acer.getGraphic();
        
        
        HP hp = new HP("HP 14s-CF2034TX", "HP", "Intel Core i7-10510U", 
                "2", "Windows 10", "8", "SSD SATA", 19);
        System.out.println("\nLaptop HP");
        System.out.println(hp);
        hp.getDisplay();
        hp.getGraphic();
    }
}

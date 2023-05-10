package demo;

import lesson1_oop.Laptop;

public class Acer extends Laptop {
    public Acer()
    {
//        this.ten = "Acer i5";
//        this.gia = 20.5;
//        this.nsx = "Acer";
//        this.namBaoHanh = 4;
    }
    
    @Override
    public void xuatThongTin()
    {
        System.out.println("Máy tính Acer");
        super.xuatThongTin();
    }
    
    // Overload
    public void xuatThongTin(String chip)
    {
        this.xuatThongTin();
        System.out.println(chip);
    }
}

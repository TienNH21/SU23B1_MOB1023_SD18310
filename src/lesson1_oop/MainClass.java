package lesson1_oop;

import demo.Acer;

public class MainClass {
    public static void main(String[] args) {
        // Khai báo biến a có kiểu Laptop
        Laptop a;

        // Khởi tạo đối tượng Acer và gán đối tượng vào biến a
        a = new Acer();

        a.setNsx("Acer");
        a.setGia(20);
        
        System.out.println(a.getNsx());
        System.out.println(a.getGia());
    }
}

package lesson1_oop;

public class Laptop {
    private String ten;
    private double gia;
    private String nsx;
    private int namBaoHanh;

    public Laptop() {
    }

    public Laptop(String ten, double gia, String nsx, int namBaoHanh) {
        this.ten = ten;
        this.gia = gia;
        this.nsx = nsx;
        this.namBaoHanh = namBaoHanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }
    
}

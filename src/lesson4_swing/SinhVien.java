package lesson4_swing;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String ma;
    private String ten;
    private String email;
    private String pwd;
    private int gioiTinh;
    private int trangThai;
    private String cNganh;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String email, String pwd, int gioiTinh, int trangThai, String cNganh) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.pwd = pwd;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
        this.cNganh = cNganh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getcNganh() {
        return cNganh;
    }

    public void setcNganh(String cNganh) {
        this.cNganh = cNganh;
    }
    
    
}

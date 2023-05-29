package lesson4_swing;

import java.util.ArrayList;

public class SinhVienService {
    private ArrayList<SinhVien> listSv; // null
    
    public SinhVienService()
    {
        this.listSv = new ArrayList<>();
    }
    
    public void insert(SinhVien sv)
    {
        this.listSv.add(sv);
    }
    
    public void update(int viTri, SinhVien sv)
    {
        this.listSv.set(viTri, sv);
    }
    
    public void delete(int viTri)
    {
        this.listSv.remove(viTri);
    }

    public ArrayList<SinhVien> getListSv() {
        return listSv;
    }

    public void setListSv(ArrayList<SinhVien> listSv) {
        this.listSv = listSv;
    }
}

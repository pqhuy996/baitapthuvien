import java.util.ArrayList;
import java.util.List;

public class ThuVien implements QuanLySach {
    private int id;
    private String tenThuVien;
    private List<Sach> danhSachSach;
    public ThuVien(int id, String tenThuVien) {
        this.id = id;
        this.tenThuVien = tenThuVien;
        this.danhSachSach = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTenThuVien() {
        return tenThuVien;
    }

    public List<Sach> getDanhSachSach() {
        return danhSachSach;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenThuVien(String tenThuVien) {
        this.tenThuVien = tenThuVien;
    }

    public void setDanhSachSach(List<Sach> danhSachSach) {
        this.danhSachSach = danhSachSach;
    }
    public void themSachMoi(Sach sach) {
        danhSachSach.add(sach);
    }
    public void xoaSach(int id) {
        danhSachSach.removeIf(sach -> sach.getId() == id);
    }
    @Override
    public Sach timKiemSach(String tieuDe, String tacGia) {
        for (Sach sach : danhSachSach) {
            if(sach.getTieuDe().equalsIgnoreCase(tieuDe) || sach.getTacGia().equalsIgnoreCase(tacGia)) {
                return sach;
            }
        }
        return null;
    }
    @Override
    public void hienThiSach() {
        for (Sach sach : danhSachSach) {
            System.out.println(sach);
        }
    }

    @Override
    public String toString() {
        return "ThuVien{" +
                "id=" + id +
                ", tenThuVien='" + tenThuVien + '\'' +
                ", danhSachSach=" + danhSachSach +
                '}';
    }
}

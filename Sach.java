public class Sach {
    private int id;
    private String tieuDe;
    private String tacGia;
    private String theLoai;
    private int namXuatBan;
    private String trangThai;
    public Sach(int id, String tieuDe, String tacGia, String theLoai, int namXuatBan, String trangThai) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.namXuatBan = namXuatBan;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    @Override
    public String toString() {
        return "Sach{" +
                "id=" + id +
                ", tieuDe='" + tieuDe + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", theLoai='" + theLoai + '\'' +
                ", namXuatBan=" + namXuatBan +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
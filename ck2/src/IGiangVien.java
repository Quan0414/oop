public interface IGiangVien {
    void addGiangVien(GiangVien gv);
    void editGiangVien(GiangVien gv);
    GiangVien searchGiangVien(String maCBNV);
    Double getTotalSalary(String hocHamHocVi);
    void display();
}

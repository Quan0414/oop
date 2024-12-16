import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiangVienImpl implements IGiangVien{
    private List<GiangVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addGiangVien(GiangVien gv) {
        try {
            gv.nhap();
            for (GiangVien giangvien : list) {
                if (giangvien.getMaCBNV().equalsIgnoreCase(gv.getMaCBNV())) {
                    System.out.println("Ma giang vien da ton tai");
                    return;
                }
            }
            list.add(gv);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void editGiangVien(GiangVien gv) {
        try {
            System.out.println("Nhap luong co ban moi: ");
            gv.setHeSoLuong(sc.nextDouble());
            sc.nextLine();
            if (gv.getHeSoLuong() < 0) {
                System.out.println("He so luong phai lon hon 0");
                return;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public GiangVien searchGiangVien(String maCBNV) {
        try {
            for (GiangVien giangvien : list) {
                if (giangvien.getMaCBNV().equalsIgnoreCase(maCBNV)) {
                    return giangvien;
                }
            }
            System.out.println("Khong tim thay giang vien");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Double getTotalSalary(String hocHamHocVi) {
        try {
            double totalSalary = 0;
            for (GiangVien giangvien : list) {
                if (giangvien.getHocHamHocVi().equalsIgnoreCase(hocHamHocVi)) {
                    totalSalary += giangvien.getSalary();
                }
            }
            return totalSalary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0.0;
    }

    @Override
    public void display() {
        for (GiangVien giangvien : list) {
            System.out.println(giangvien);
        }
        System.out.println();
    }
}

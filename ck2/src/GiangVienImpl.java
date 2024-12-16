import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiangVienImpl implements IGiangVien{
    private List<GiangVien> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public List<GiangVien> getList() {
        return list;
    }


    @Override
    public void addGiangVien(GiangVien gv) {
        try {
            gv.nhap();
            for (GiangVien giangVien : list) {
                if (giangVien.getMaCBNV().equalsIgnoreCase(gv.getMaCBNV())) {
                    throw new Exception("Ma giang vien da ton tai");
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
            System.out.println("Nhap he so luong moi: ");
            double heSoLuong = sc.nextDouble();
            sc.nextLine();

            if (heSoLuong < 0) {
                throw new Exception("He so luong phai lon hon 0");
            }
            gv.setHeSoLuong(heSoLuong);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public GiangVien searchGiangVien(String maCBNV) {
        try {
            if (maCBNV.isEmpty()) {
                throw new Exception("Ma giang vien khong duoc de trong");
            } else {
                for (GiangVien gv : list) {
                    if (gv.getMaCBNV().equalsIgnoreCase(maCBNV)) {
                        return gv;
                    }
                }
                throw new Exception("Khong tim thay giang vien");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public double getTotalSalary(String hocHamHocVi) {

        try {
            if (hocHamHocVi.isEmpty()) {
                throw new Exception("Hoc ham hoc vi khong duoc de trong");
            } else {
                double total = 0;
                for (GiangVien gv : list) {
                    if (gv.getHocHamHocVi().equalsIgnoreCase(hocHamHocVi)) {
                        total += gv.getSalary();
                    }
                }
                return total;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public void display() {
        for (GiangVien gv : list) {
            System.out.println(gv);
        }
    }
}

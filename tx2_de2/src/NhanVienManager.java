import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class NhanVienManager {
    private ArrayList<NHANVIENHC> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapDsNhanVien() {
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        try {
            if (n > 5) {
                throw new Exception("So luong nhan vien khong duoc lon hon 5");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ": ");
            NHANVIENHC nhanVien = new NHANVIENHC();
            nhanVien.nhap();
            list.add(nhanVien);
        }
    }

    public void hienThiDsNhanVien() {
        for (NHANVIENHC nhanVien : list) {
            nhanVien.hienThi();
        }
    }

    //sap xep theo namTD, td sau xep truoc
    public void sapXep() {
        //sap xep theo namTD
        Collections.sort(list, (o1, o2) -> o2.getNamTD() - o1.getNamTD());
        hienThiDsNhanVien();
    }

    //tim kiem nhanvien thuoc phong taichinh va xoa
    public void timKiemTheoPhong() {
        int cnt = 0;
        for (NHANVIENHC nhanVien : list) {
            if (nhanVien.getPhongBan().equals("Phong tai chinh")) {
                nhanVien.hienThi();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co nhan vien nao thuoc Phong tai chinh");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getPhongBan().equals("Phong tai chinh")) {
                    list.remove(i);
                }
            }
            hienThiDsNhanVien();
        }
    }




}

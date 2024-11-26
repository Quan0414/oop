import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class GiangVienManager {
    private ArrayList<GIANGVIEN> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapDanhSachGiangVien() {
        System.out.println("Nhap so luong giang vien: ");
        int n = sc.nextInt();
        try {
            if (n > 5) {
                throw new Exception("So luong giang vien khong duoc lon hon 5");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin giang vien thu " + (i + 1) + ": ");
            GIANGVIEN giangVien = new GIANGVIEN();
            giangVien.nhap();
            list.add(giangVien);
        }
    }

    public void hienThiDanhSachGiangVien() {
        for (GIANGVIEN giangVien : list) {
            giangVien.hienThi();
        }
    }

    public void sapXep() {
        //sap xep theo namTD
        Collections.sort(list, (o1, o2) -> o1.getNamTD() - o2.getNamTD());
        hienThiDanhSachGiangVien();
    }

    public void timKiemTheoKhoa() {
        int cnt = 0;
        for (GIANGVIEN giangvien : list) {
            if (giangvien.getKhoaCT().equals("KHOA CNTT")) {
                giangvien.hienThi();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co giang vien nao thuoc KHOA CNTT");
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getKhoaCT().equals("KHOA CNTT")) {
                    list.remove(i);
                }
            }
            hienThiDanhSachGiangVien();
        }


    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static ArrayList<GIANGVIEN> list = new ArrayList<>();
    public static void xuatDSGV(ArrayList<GIANGVIEN> list) {
        for (GIANGVIEN giangVien : list) {
            giangVien.hienThi();
        }
        System.out.println();
    }

    public static void nhapDSGV(ArrayList<GIANGVIEN> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhap so luong giang vien: ");
                int n = sc.nextInt();
                if (n > 5) {
                    throw new Exception("So luong giang vien khong duoc lon hon 5");
                }
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin giang vien thu " + (i + 1) + ": ");
                    GIANGVIEN giangVien = new GIANGVIEN();
                    giangVien.nhap();
                    list.add(giangVien);
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Danh sach giang vien: ");
        xuatDSGV(list);
    }

    public static void sapXep(ArrayList<GIANGVIEN> list) {
        //sap xep theo namTD
        list.sort((o1, o2) -> o1.getNamTD() - o2.getNamTD());
        System.out.println("Danh sach giang vien sau khi sap xep: ");
        xuatDSGV(list);
    }

    public static void timKiem(ArrayList<GIANGVIEN> list) {
        int cnt = 0;
        for (GIANGVIEN giangvien : list) {
            if (giangvien.getKhoaCT().equalsIgnoreCase("KHOA CNTT")) {
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co giang vien nao thuoc KHOA CNTT");
        } else {
            System.out.println("Danh sach giang vien thuoc KHOA CNTT: ");
            for (GIANGVIEN giangvien : list) {
                if (giangvien.getKhoaCT().equalsIgnoreCase("KHOA CNTT")) {
                    giangvien.hienThi();
                }
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).getKhoaCT().equalsIgnoreCase("KHOA CNTT")) {
                    list.remove(i);
                }
            }
            System.out.println("Danh sach giang vien sau khi xoa: ");
            xuatDSGV(list);
        }
    }

    public static void main(String[] args) {
        nhapDSGV(list);
        sapXep(list);
        timKiem(list);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<NHANVIENHC> list = new ArrayList<>();

    public static void xuatDSNV(ArrayList<NHANVIENHC> list) {
        for (NHANVIENHC nhanVien : list) {
            nhanVien.hienThi();
        }
        System.out.println();
    }

    public static void nhapDSNV(ArrayList<NHANVIENHC> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhap so luong nhan vien: ");
                int n = sc.nextInt();
                if (n > 5) {
                    throw new Exception("So luong nhan vien khong duoc lon hon 5");
                }
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ": ");
                    NHANVIENHC nhanVien = new NHANVIENHC();
                    nhanVien.nhap();
                    list.add(nhanVien);
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Danh sach nhan vien: ");
        xuatDSNV(list);
    }

    public static void sapXep(ArrayList<NHANVIENHC> list) {
        //sap xep theo namTD
        list.sort((o1, o2) -> o2.getNamTD() - o1.getNamTD());
        System.out.println("Danh sach nhan vien sau khi sap xep: ");
        xuatDSNV(list);
    }

    //tim kiem nhanvien thuoc phong taichinh va xoa
    public static void timKiem(ArrayList<NHANVIENHC> list) {
        int cnt = 0;
        for (NHANVIENHC nhanVien : list) {
            if (nhanVien.getPhongBan().equalsIgnoreCase("Phong tai chinh")) {
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co nhan vien nao thuoc Phong tai chinh");
        } else {
            System.out.println("Danh sach nhan vien thuoc Phong tai chinh: ");
            for (NHANVIENHC nhanVien : list) {
                if (nhanVien.getPhongBan().equalsIgnoreCase("Phong tai chinh")) {
                    nhanVien.hienThi();
                }
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).getPhongBan().equalsIgnoreCase("Phong tai chinh")) {
                    list.remove(i);
                }
            }
            System.out.println("Danh sach nhan vien sau khi xoa: ");
            xuatDSNV(list);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhapDSNV(list);
        sapXep(list);
        timKiem(list);
    }
}

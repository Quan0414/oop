import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiangVienImpl giangVien = new GiangVienImpl();

        System.out.println("Nhap so luong giang vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            GiangVien gv = new GiangVien();
            giangVien.addGiangVien(gv);
        }
        System.out.println("Danh sach giang vien: ");
        giangVien.display();



        System.out.println("Nhap ma giang vien can sua: ");
        String maCBNV = sc.nextLine();
        GiangVien gvcs = new GiangVien();
        for (GiangVien gv : giangVien.getList()) {
            if (gv.getMaCBNV().equalsIgnoreCase(maCBNV)) {
                gvcs = gv;
                break;
            }
        }
        giangVien.editGiangVien(gvcs);
        System.out.println("Danh sach giang vien sau khi sua: ");
        giangVien.display();



        System.out.println("Nhap ma giang vien can tim: ");
        String maCBNV1 = sc.nextLine();
        GiangVien gv1 = giangVien.searchGiangVien(maCBNV1);
        System.out.println(gv1);
        System.out.println();

        System.out.println("Tong luong: " + giangVien.getTotalSalary("TS"));


    }
}
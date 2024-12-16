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
        giangVien.display();

        System.out.println("Nhap ma giang vien can sua: ");
        String maCBNV = sc.nextLine();
        GiangVien gv = giangVien.searchGiangVien(maCBNV);
        if (gv != null) {
            giangVien.editGiangVien(gv);
            giangVien.display();
        } else {
            System.out.println("Khong tim thay giang vien");
        }


    }
}
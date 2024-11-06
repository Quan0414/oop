package de1;

import java.util.Scanner;
import java.util.*;

public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong giang vien: ");
        int n = sc.nextInt();

        ArrayList<GIANGVIEN> gv = new ArrayList<GIANGVIEN>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin giang vien thu " + (i + 1) + ": ");
            GIANGVIEN giangvien = new GIANGVIEN();
            giangvien.nhapGV();
            gv.add(giangvien);
        }
        //xuất danh sách giảng viên
        System.out.println("Danh sach giang vien: ");
        for (GIANGVIEN giangvien : gv) {
            System.out.println("Thong tin giang vien: ");
            giangvien.xuatGV();           
        }

        System.out.println("Nhap ma GV can kiem tra: ");
        String maGV = sc.next();
        for (GIANGVIEN giangvien : gv) {
            if (giangvien.getMaGV().equals(maGV)) {
                System.out.println("Thong tin giang vien can tim: ");
                giangvien.xuatGV();
            }
            else {
                System.out.println("Khong tim thay giang vien co ma " + maGV);
            }
        }

        //Tìm giảng viên có số năm công tác lớn nhất bằng hàm max của Collection
        int max = gv.get(0).getSoNamGD();
        for (int i = 1; i < gv.size(); i++) {
            if (gv.get(i).getSoNamGD() > max) {
                max = gv.get(i).getSoNamGD();
            }
        }
        //xóa giảng viên có số năm công tác lớn nhất
        for (int i = 0; i < gv.size(); i++) {
            if (gv.get(i).getSoNamGD() == max) {
                gv.remove(i);
            }
        }

        //xuất danh sách giảng viên sau khi xóa
        System.out.println("Danh sach giang vien sau khi xoa: ");
        for (GIANGVIEN giangvien : gv) {
            System.out.println("Thong tin giang vien: ");
            giangvien.xuatGV();           
        }


    }
}

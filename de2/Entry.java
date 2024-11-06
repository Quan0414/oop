package de2;

import java.util.Scanner;
import java.util.ArrayList;

public class Entry {

    // kiểm tra có sinh viên nào quê ha nam không
    public static void checkQueQuan(ArrayList<SINHVIEN> sv) {
        System.out.println("Danh sach sinh vien que Ha Nam: ");
        int cnt = 0;
        for (SINHVIEN sinhvien : sv) {
            if (sinhvien.getQueQuan().equals("Ha Nam")) {
                sinhvien.xuat();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co sinh vien que Ha Nam");
        }
    }

    public static void xoa(ArrayList<SINHVIEN> sv) {
        int min = sv.get(0).getDiemTT();
        for (int i = 1; i < sv.size(); i++) {
            if (sv.get(i).getDiemTT() < min) {
                min = sv.get(i).getDiemTT();
            }
        }
        for (int i = 0; i < sv.size(); i++) {
            if (sv.get(i).getDiemTT() == min) {
                sv.remove(i);
            }
        }
        System.out.println("Danh sach sinh vien sau khi xoa: ");
        for (SINHVIEN sinhvien : sv) {
            sinhvien.xuat();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        ArrayList<SINHVIEN> sv = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SINHVIEN sinhvien = new SINHVIEN();
            sinhvien.nhap();
            sv.add(sinhvien);
        }

        for (int i = 0; i < sv.size(); i++) {
            System.out.println("Thong tin sinh vien thu " + (i + 1) + ":");
            sv.get(i).xuat();
        }

        checkQueQuan(sv);
        xoa(sv);

    }
}

package de3;

import java.util.Scanner;
import java.util.ArrayList;

public class Entry {

    public static void check(ArrayList<DETAIKH> dt) {
        System.out.println("Danh sach de tai co nam thuc hien la 2023: ");
        int cnt = 0;
        for (DETAIKH detai : dt) {
            if (detai.getNamThucHien() == 2023) {
                detai.xuat();
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println("Khong co de tai can tim");
        }
    }

    public static void xoa(ArrayList<DETAIKH> dt) {
        int min = dt.get(0).getNamThucHien();
        for (int i = 1; i < dt.size(); i++) {
            if (dt.get(i).getNamThucHien() < min) {
                min = dt.get(i).getNamThucHien();
            }
        }
        for (int i = 0; i < dt.size(); i++) {
            if (dt.get(i).getNamThucHien() == min) {
                dt.remove(i);
            }
        }
        System.out.println("Danh sach de tai sau khi xoa: ");
        for (DETAIKH detai : dt) {
            detai.xuat();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong de tai: ");
        int n = sc.nextInt();
         
        ArrayList<DETAIKH> dt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin de tai thu " + (i + 1) + ":");
            DETAIKH detai = new DETAIKH();
            detai.nhap();
            dt.add(detai);
        }
        for (int i = 0; i < dt.size(); i++) {
            System.out.println("Thong tin de tai thu " + (i + 1) + ":");
            dt.get(i).xuat();
        }

        check(dt);
        xoa(dt);

    }
}

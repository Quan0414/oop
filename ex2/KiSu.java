package ex2;

import java.util.Scanner;

public class KiSu extends NguoiLaoDong {
    private double luong;
    private double luongCoBan;
    private int soNgayCong;
    private double heSoLuong;
    private int thuong;

    public KiSu() {
        super();
        this.luongCoBan = 0;
        this.heSoLuong = 0;
        this.thuong = 0;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap luong co ban: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
    }

    @Override
    public double tinhLuong() {
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong < 25 && soNgayCong > 15) {
            thuong = 1000000;
        } else {
            thuong = 0;
        }
        return luong = luongCoBan * heSoLuong + thuong;
    }
}

package ex2;

import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
    private double luong;
    private int soNgayCong;
    private double donGiaNgayCong;
    private int thuong;

    public LaoDongPhoThong() {
        super();
        this.luong = 0;
        this.soNgayCong = 0;
        this.donGiaNgayCong = 0;
        this.thuong = 0;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public double getDonGiaNgayCong() {
        return donGiaNgayCong;
    }

    public void setDonGiaNgayCong(double donGiaNgayCong) {
        this.donGiaNgayCong = donGiaNgayCong;
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
        System.out.print("Nhap so ngay cong: ");
        soNgayCong = sc.nextInt();
        System.out.print("Nhap don gia ngay cong: ");
        donGiaNgayCong = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
    }

    @Override
    public double tinhLuong() {
        if (soNgayCong >= 25) {
            thuong = 1000000;
        } else if (soNgayCong < 25 && soNgayCong > 15) {
            thuong = 700000;
        } else {
            thuong = 0;
        }
        return luong = soNgayCong * donGiaNgayCong + thuong;
    }

}

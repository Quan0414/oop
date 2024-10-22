package ex2;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    protected String ten;
    protected String diaChi;

    public NguoiLaoDong() {
        this.ten = "";
        this.diaChi = "";
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    abstract public double tinhLuong();

    public void xuat() {
        System.out.printf("%-15s %-15s %-15s \n", ten, diaChi, tinhLuong());
    }
}
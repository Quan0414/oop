package de3;

import java.util.Scanner;

public class DETAIKH {
    private String maDT;
    private String tenDT;
    private int namThucHien;
    private String chuNhiemDT;
    private String linhVuc;
    private String sanPhamDT;
    private String donviCM;

    public DETAIKH() {
    }

    public DETAIKH(String maDT) {
        this.maDT = maDT;
    }

    public DETAIKH(String maDT, String tenDT, int namThucHien, String chuNhiemDT, String linhVuc, String sanPhamDT, String donviCM) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.namThucHien = namThucHien;
        this.chuNhiemDT = chuNhiemDT;
        this.linhVuc = linhVuc;
        this.sanPhamDT = sanPhamDT;
        this.donviCM = donviCM;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public int getNamThucHien() {
        return namThucHien;
    }

    public void setNgayThucHien(int namThucHien) {
        this.namThucHien = namThucHien;
    }

    public String getChuNhiemDT() {
        return chuNhiemDT;
    }

    public void setChuNhiemDT(String chuNhiemDT) {
        this.chuNhiemDT = chuNhiemDT;
    }

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }

    public String getSanPhamDT() {
        return sanPhamDT;
    }

    public void setSanPhamDT(String sanPhamDT) {
        this.sanPhamDT = sanPhamDT;
    }

    public String getDonviCM() {
        return donviCM;
    }

    public void setDonviCM(String donviCM) {
        this.donviCM = donviCM;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma de tai: ");
        this.maDT = sc.nextLine();
        System.out.print("Nhap ten de tai: ");
        this.tenDT = sc.nextLine();
        System.out.print("Nhap nam thuc hien: ");
        this.namThucHien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap chu nhiem de tai: ");
        this.chuNhiemDT = sc.nextLine();
        System.out.print("Nhap linh vuc: ");
        this.linhVuc = sc.nextLine();
        System.out.print("Nhap san pham de tai: ");
        this.sanPhamDT = sc.nextLine();
        System.out.print("Nhap don vi chu tri: ");
        this.donviCM = sc.nextLine();
    }

    @Override
    public String toString() {
        return "DETAIKH [maDT: " + maDT + ", tenDT: " + tenDT + ", namThucHien: " + namThucHien + ", chuNhiemDT: "
                + chuNhiemDT + ", linhVuc: " + linhVuc + ", sanPhamDT: " + sanPhamDT + ", donviCM: " + donviCM + "]";
    }

    public void xuat() {
        System.out.println(this.toString());
    }
}

package de2;

import java.util.Scanner;

public class SINHVIEN {
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private int diemTT;
    private String nganhHoc;
    private String khoaCM;
    private String ngayNhapHoc;
    private String queQuan;

    public SINHVIEN() {
    }

    public SINHVIEN(String maSV) {
        this.maSV = maSV;
    }

    public SINHVIEN(String maSV, String hoTen, String ngaySinh, int diemTT, String nganhHoc, String khoaCM, String ngayNhapHoc, String queQuan) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTT = diemTT;
        this.nganhHoc = nganhHoc;
        this.khoaCM = khoaCM;
        this.ngayNhapHoc = ngayNhapHoc;
        this.queQuan = queQuan;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDiemTT() {
        return diemTT;
    }

    public void setDiemTT(int diemTT) {
        this.diemTT = diemTT;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getKhoaCM() {
        return khoaCM;
    }

    public void setKhoaCM(String khoaCM) {
        this.khoaCM = khoaCM;
    }

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemTT = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap nganh hoc: ");
        nganhHoc = sc.nextLine();
        System.out.println("Nhap khoa chinh quy: ");
        khoaCM = sc.nextLine();
        System.out.println("Nhap ngay nhap hoc: ");
        ngayNhapHoc = sc.nextLine();
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
    }

    @Override
    public String toString() {
        return "SINHVIEN [maSV: " + maSV + ", hoTen: " + hoTen + ", ngaySinh: " + ngaySinh + ", diemTT: " + diemTT
                + ", nganhHoc: " + nganhHoc + ", khoaCM: " + khoaCM + ", ngayNhapHoc: " + ngayNhapHoc + ", queQuan: "
                + queQuan + "]";
    }

    public void xuat() {
        System.out.println(this.toString());
    }
}

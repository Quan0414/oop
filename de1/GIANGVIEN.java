package de1;

import java.util.Scanner;

public class GIANGVIEN {
    private String maGV;
    private String hoTen;
    private String ngaySinh;
    private String trinhDoCM;
    private String chuyenNganh;
    private String khoaCM;
    private int soNamGD;
    private String diaChi;

    public GIANGVIEN() {
    }

    public GIANGVIEN(String maGV) {
        this.maGV = maGV;
    }

    public GIANGVIEN(String maGV, String hoTen, String ngaySinh, String trinhDoCM, String chuyenNganh, String khoaCM,
            int soNamGD, String diaChi) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.trinhDoCM = trinhDoCM;
        this.chuyenNganh = chuyenNganh;
        this.khoaCM = khoaCM;
        this.soNamGD = soNamGD;
        this.diaChi = diaChi;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
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

    public String getTrinhDoCM() {
        return trinhDoCM;
    }

    public void setTrinhDoCM(String trinhDoCM) {
        this.trinhDoCM = trinhDoCM;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getKhoaCM() {
        return khoaCM;
    }

    public void setKhoaCM(String khoaCM) {
        this.khoaCM = khoaCM;
    }

    public int getSoNamGD() {
        return soNamGD;
    }

    public void setSoNamGD(int soNamGD) {
        this.soNamGD = soNamGD;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhapGV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma giang vien: ");
        maGV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap trinh do chuyen mon: ");
        trinhDoCM = sc.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        chuyenNganh = sc.nextLine();
        System.out.print("Nhap khoa chuyen mon: ");
        khoaCM = sc.nextLine();
        System.out.print("Nhap so nam giang day: ");
        soNamGD = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();

        //sc.close();
    }

    public void xuatGV() {
        System.out.println("Ma giang vien: " + maGV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Trinh do chuyen mon: " + trinhDoCM);
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("Khoa chuyen mon: " + khoaCM);
        System.out.println("So nam giang day: " + soNamGD);
        System.out.println("Dia chi: " + diaChi);
    }
    
}

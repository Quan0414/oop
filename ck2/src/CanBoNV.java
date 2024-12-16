import java.util.Scanner;

public abstract class CanBoNV {
    private String maCBNV;
    private String hoTen;
    private int namTuyenDung;
    private Double heSoLuong;
    private Double heSoPC;

    public CanBoNV() {
    }

    public CanBoNV(String maCBNV, String hoTen, int namTuyenDung, Double heSoLuong, Double heSoPC) {
        this.maCBNV = maCBNV;
        this.hoTen = hoTen;
        this.namTuyenDung = namTuyenDung;
        this.heSoLuong = heSoLuong;
        this.heSoPC = heSoPC;
    }

    public String getMaCBNV() {
        return maCBNV;
    }

    public void setMaCBNV(String maCBNV) {
        this.maCBNV = maCBNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getNamTuyenDung() {
        return namTuyenDung;
    }

    public void setNamTuyenDung(int namTuyenDung) {
        this.namTuyenDung = namTuyenDung;
    }

    public Double getHeSoPC() {
        return heSoPC;
    }

    public void setHeSoPC(Double heSoPC) {
        this.heSoPC = heSoPC;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma can bo nhan vien: ");
        maCBNV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam tuyen dung: ");
        namTuyenDung = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap he so phu cap: ");
        heSoPC = sc.nextDouble();
        sc.nextLine();

    }

    @Override
    public String toString() {
        return "CanBoNV{" +
                "maCBNV='" + maCBNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namTuyenDung=" + namTuyenDung +
                ", heSoLuong=" + heSoLuong +
                ", heSoPC=" + heSoPC +
                '}';
    }

    public abstract double getSalary();
}

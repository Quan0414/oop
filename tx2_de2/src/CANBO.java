import java.util.Scanner;

public class CANBO {
    private String maCB;
    private String hoTen;
    private String ngaySinh;
    private int namTD;

    public CANBO() {
    }

    public CANBO(String maCB, String hoTen, String ngaySinh, int namTD) {
        this.maCB = maCB;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.namTD = namTD;
    }

    public String getMaCB() {
        return maCB;
    }

    public void setMaCB(String maCB) {
        this.maCB = maCB;
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

    public int getNamTD() {
        return namTD;
    }

    public void setNamTD(int namTD) {
        this.namTD = namTD;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can bo: ");
        this.maCB = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap nam tuyen dung: ");
        this.namTD = sc.nextInt();

    }

    @Override
    public String toString() {
        return "CANBO{" +
                "maCB='" + maCB + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", namTD='" + namTD + '\'' +
                '}';
    }

    public void hienThi() {
        System.out.println(toString());
    }

}
